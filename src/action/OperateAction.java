package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.HibernateUtil;
import entity.MemberEntity;
import entity.ProviderEntity;
import org.hibernate.Session;

public class OperateAction extends ActionSupport {
    private int memberId;
    private int memberId_delete;
    private String memberName;
    private String memberCountry;
    private String memberCity;
    private String memberAddress;
    private String memberZip;
    private String memberState;
    private double memberFee;
    private String memberPass;
    private int providerId;
    private int providerId_delete;
    private String providerName;
    private String providerCountry;
    private String providerCity;
    private String providerAddress;
    private String providerZip;
    private String providerState;
    private String providerPass;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getMemberId_delete() {
        return memberId_delete;
    }

    public void setMemberId_delete(int memberId_delete) {
        this.memberId_delete = memberId_delete;
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

    public int getProviderId_delete() {
        return providerId_delete;
    }

    public void setProviderId_delete(int providerId_delete) {
        this.providerId_delete = providerId_delete;
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

    public String addMember() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            session.beginTransaction();
            MemberEntity memberEntity = new MemberEntity();
            memberEntity.setMemberId(memberId);
            memberEntity.setMemberName(memberName);
            memberEntity.setMemberCountry(memberCountry);
            memberEntity.setMemberCity(memberCity);
            memberEntity.setMemberAddress(memberAddress);
            memberEntity.setMemberZip(memberZip);
            memberEntity.setMemberState(memberState);
            memberEntity.setMemberFee(memberFee);
            memberEntity.setMemberPass(memberPass);
            session.save(memberEntity);
            session.getTransaction().commit();
            return "addMemberSuccess";
        } catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "error";
    }

    public String deleteMember() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            session.beginTransaction();
            MemberEntity memberEntity = (MemberEntity)session.get(MemberEntity.class, memberId_delete);
            session.delete(memberEntity);
            session.getTransaction().commit();
            return "deleteMemberSuccess";
        } catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "error";
    }

    public String addProvider() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            session.beginTransaction();
            ProviderEntity providerEntity = new ProviderEntity();
            providerEntity.setProviderId(providerId);
            providerEntity.setProviderName(providerName);
            providerEntity.setProviderCountry(providerCountry);
            providerEntity.setProviderCity(providerCity);
            providerEntity.setProviderAddress(providerAddress);
            providerEntity.setProviderZip(providerZip);
            providerEntity.setProviderState(providerState);
            providerEntity.setProviderPass(providerPass);
            session.save(providerEntity);
            session.getTransaction().commit();
            return "addProviderSuccess";
        } catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "error";
    }

    public String deleteProvider() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            session.beginTransaction();
            ProviderEntity providerEntity = (ProviderEntity)session.get(ProviderEntity.class, providerId_delete);
            session.delete(providerEntity);
            session.getTransaction().commit();
            return "deleteProviderSuccess";
        } catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "error";
    }
}
