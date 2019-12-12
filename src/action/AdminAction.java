package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.HibernateUtil;
import entity.*;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminAction extends ActionSupport {
    private int memberId;
    private int memberId_report;
    private String memberName;
    private String memberCountry;
    private String memberCity;
    private String memberAddress;
    private String memberZip;
    private String memberState;
    private double memberFee;
    private String memberPass;
    private int providerId;
    private int providerId_report;
    private String providerName;
    private String providerCountry;
    private String providerCity;
    private String providerAddress;
    private String providerZip;
    private String providerState;
    private String providerPass;
    private List<memberList> memberLists = new ArrayList<memberList>();
    private List<providerList> providerLists = new ArrayList<providerList>();
    private List<outLine> outLines = new ArrayList<outLine>();
    private MemberEntity memberEntity;
    private ProviderEntity providerEntity;
    private double TotalFee;
    private int providerTotalNumber;
    private int queryTotalNumber;


    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getMemberId_report() {
        return memberId_report;
    }

    public void setMemberId_report(int memberId_report) {
        this.memberId_report = memberId_report;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberCountry() {
        return memberCountry;
    }

    public void setMemberCountry(String memberCountry) {
        this.memberCountry = memberCountry;
    }

    public String getMemberCity() {
        return memberCity;
    }

    public void setMemberCity(String memberCity) {
        this.memberCity = memberCity;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberZip() {
        return memberZip;
    }

    public void setMemberZip(String memberZip) {
        this.memberZip = memberZip;
    }

    public String getMemberState() {
        return memberState;
    }

    public void setMemberState(String memberState) {
        this.memberState = memberState;
    }

    public double getMemberFee() {
        return memberFee;
    }

    public void setMemberFee(double memberFee) {
        this.memberFee = memberFee;
    }

    public String getMemberPass() {
        return memberPass;
    }

    public void setMemberPass(String memberPass) {
        this.memberPass = memberPass;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public int getProviderId_report() {
        return providerId_report;
    }

    public void setProviderId_report(int providerId_report) {
        this.providerId_report = providerId_report;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderCountry() {
        return providerCountry;
    }

    public void setProviderCountry(String providerCountry) {
        this.providerCountry = providerCountry;
    }

    public String getProviderCity() {
        return providerCity;
    }

    public void setProviderCity(String providerCity) {
        this.providerCity = providerCity;
    }

    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }

    public String getProviderZip() {
        return providerZip;
    }

    public void setProviderZip(String providerZip) {
        this.providerZip = providerZip;
    }

    public String getProviderState() {
        return providerState;
    }

    public void setProviderState(String providerState) {
        this.providerState = providerState;
    }

    public String getProviderPass() {
        return providerPass;
    }

    public void setProviderPass(String providerPass) {
        this.providerPass = providerPass;
    }

    public List<memberList> getMemberLists() {
        return memberLists;
    }

    public void setMemberLists(List<memberList> memberLists) {
        this.memberLists = memberLists;
    }

    public List<providerList> getProviderLists() {
        return providerLists;
    }

    public void setProviderLists(List<providerList> providerLists) {
        this.providerLists = providerLists;
    }

    public List<outLine> getOutLines() {
        return outLines;
    }

    public void setOutLines(List<outLine> outLines) {
        this.outLines = outLines;
    }

    public MemberEntity getMemberEntity() {
        return memberEntity;
    }

    public void setMemberEntity(MemberEntity memberEntity) {
        this.memberEntity = memberEntity;
    }

    public ProviderEntity getProviderEntity() {
        return providerEntity;
    }

    public void setProviderEntity(ProviderEntity providerEntity) {
        this.providerEntity = providerEntity;
    }

    public double getTotalFee() {
        return TotalFee;
    }

    public void setTotalFee(double totalFee) {
        TotalFee = totalFee;
    }

    public int getProviderTotalNumber() {
        return providerTotalNumber;
    }

    public void setProviderTotalNumber(int providerTotalNumber) {
        this.providerTotalNumber = providerTotalNumber;
    }

    public int getQueryTotalNumber() {
        return queryTotalNumber;
    }

    public void setQueryTotalNumber(int queryTotalNumber) {
        this.queryTotalNumber = queryTotalNumber;
    }

    public String MemberReport() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            memberEntity = (MemberEntity)session.get(MemberEntity.class, memberId_report);
            if(memberEntity != null)
            {
                Criteria criteria = session.createCriteria(ServicerecordEntity.class);
                criteria.add(Restrictions.eq("memberEntity", memberEntity));
                criteria.add(Restrictions.sqlRestriction("record_id in (select min(a.record_id) from servicerecord a group by a.service_id)"));
                List<ServicerecordEntity> list = criteria.list();
                if(list != null && !list.isEmpty())
                {
                    for(ServicerecordEntity servicerecordEntity : list)
                    {
                        memberList ml = new memberList();
                        String  pName = servicerecordEntity.getProviderEntity().getProviderName();
                        String sName = servicerecordEntity.getServiceEntity().getServiceName();
                        Date date = servicerecordEntity.getDateProvided();
                        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                        String serviceTime = df.format(date);
                        ml.setProviderName(pName);
                        ml.setServiceName(sName);
                        ml.setServiceDate(serviceTime);
                        memberLists.add(ml);
                    }
                    return "memberReportSuccess";
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return "error";
    }

    public String ProviderReport() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            providerEntity = (ProviderEntity)session.get(ProviderEntity.class, providerId_report);
            if(providerEntity != null)
            {
                Criteria criteria = session.createCriteria(ServicerecordEntity.class);
                criteria.add(Restrictions.eq("providerEntity", providerEntity));
                criteria.add(Restrictions.sqlRestriction("record_id in (select min(a.record_id) from servicerecord a group by a.service_id)"));
                List<ServicerecordEntity> list = criteria.list();
                if(list != null && !list.isEmpty())
                {
                    for(ServicerecordEntity servicerecordEntity : list)
                    {
                        providerList pl = new providerList();
                        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
                        String st = df2.format(servicerecordEntity.getDateProvided());
                        String nt = df1.format(servicerecordEntity.getTimeStamp());
                        String mName = servicerecordEntity.getMemberEntity().getMemberName();
                        int mid = servicerecordEntity.getMemberEntity().getMemberId();
                        int sid = servicerecordEntity.getServiceEntity().getServiceId();
                        double shouldPay = servicerecordEntity.getServiceEntity().getServiceFee();
                        Criteria criteria1 = session.createCriteria(ServicerecordEntity.class);
                        criteria1.add(Restrictions.eq("serviceEntity", servicerecordEntity.getServiceEntity()));
                        criteria1.add(Restrictions.eq("providerEntity", servicerecordEntity.getProviderEntity()));
                        int number = (Integer) criteria1.setProjection(Projections.rowCount()).uniqueResult();
                        double fee = number * servicerecordEntity.getServiceEntity().getServiceFee();
                        BigDecimal bg1 = new BigDecimal(shouldPay);
                        BigDecimal bg2 = new BigDecimal(fee);
                        shouldPay = bg1.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                        fee = bg2.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                        pl.setServiceDate(st);
                        pl.setLocalTime(nt);
                        pl.setMemberName(mName);
                        pl.setMemberId(mid);
                        pl.setServiceId(sid);
                        pl.setShouldPay(shouldPay);
                        pl.setQueryMemberNumber(number);
                        pl.setTotalFee(fee);
                        providerLists.add(pl);
                    }
                    return "providerReportSuccess";
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return "error";
    }

    public String OutLine() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            Criteria criteria = session.createCriteria(ServicerecordEntity.class);
            criteria.add(Restrictions.sqlRestriction("record_id in (select min(a.record_id) from servicerecord a group by a.provider_id)"));
            List<ServicerecordEntity> list = criteria.list();
            if(list != null && !list.isEmpty())
            {
                TotalFee = 0;
                for(ServicerecordEntity servicerecordEntity : list)
                {
                    outLine oe = new outLine();
                    int pid = servicerecordEntity.getProviderEntity().getProviderId();
                    String pName = servicerecordEntity.getProviderEntity().getProviderName();
                    Criteria criteria1 = session.createCriteria(ServicerecordEntity.class);
                    criteria.add(Restrictions.eq("providerEntity", servicerecordEntity.getProviderEntity()));
                    int number = (Integer)criteria1.setProjection(Projections.rowCount()).uniqueResult();
                    double fee = number * servicerecordEntity.getServiceEntity().getServiceFee();
                    BigDecimal bg = new BigDecimal(fee);
                    fee = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                    TotalFee += fee;
                    oe.setProviderId(pid);
                    oe.setProviderName(pName);
                    oe.setQueryAmount(number);
                    oe.setTotalFee(fee);
                    outLines.add(oe);
                }
                    providerTotalNumber = (Integer)session.createCriteria(ServicerecordEntity.class).setProjection(Projections.countDistinct("providerEntity")).uniqueResult();
                    queryTotalNumber = (Integer) session.createCriteria(ServicerecordEntity.class).setProjection(Projections.rowCount()).uniqueResult();
                    return "outLineSuccess";
                }
            } catch (Exception e){
            e.printStackTrace();
        }
        return "error";
    }

    public String updateMember() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            session.beginTransaction();
            MemberEntity memberEntity = (MemberEntity)session.get(MemberEntity.class, memberId);
            memberEntity.setMemberName(memberName);
            memberEntity.setMemberCountry(memberCountry);
            memberEntity.setMemberCity(memberCity);
            memberEntity.setMemberAddress(memberAddress);
            memberEntity.setMemberZip(memberZip);
            memberEntity.setMemberState(memberState);
            memberEntity.setMemberFee(memberFee);
            memberEntity.setMemberPass(memberPass);
            session.update(memberEntity);
            session.getTransaction().commit();
            return "updateMemberSuccess";
        } catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "error";
    }

    public String updateProvider() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            session.beginTransaction();
            ProviderEntity providerEntity = (ProviderEntity)session.get(ProviderEntity.class, providerId);
            providerEntity.setProviderName(providerName);
            providerEntity.setProviderCountry(providerCountry);
            providerEntity.setProviderCity(providerCity);
            providerEntity.setProviderAddress(providerAddress);
            providerEntity.setProviderZip(providerZip);
            providerEntity.setProviderState(providerState);
            providerEntity.setProviderPass(providerPass);
            session.update(providerEntity);
            session.getTransaction().commit();
            return "updateProviderSuccess";
        } catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "error";
    }
}
