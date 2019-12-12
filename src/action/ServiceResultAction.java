package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.HibernateUtil;
import entity.MemberEntity;
import entity.ProviderEntity;
import entity.ServiceEntity;
import entity.ServicerecordEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ServiceResultAction extends ActionSupport {
    private String nowTime;
    private String serviceTime;
    private int provider_id;
    private int member_id;
    private int service_id;
    private String comments;
    private String message;

    public String getNowTime() {
        return nowTime;
    }

    public void setNowTime(String nowTime) {
        this.nowTime = nowTime;
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }

    public int getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(int provider_id) {
        this.provider_id = provider_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String execute() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            Criteria criteria = session.createCriteria(ServiceEntity.class);
            criteria.add(Restrictions.eq("serviceId", service_id));
            List list = criteria.list();
            Criteria criteria1 = session.createCriteria(ProviderEntity.class);
            criteria1.add(Restrictions.eq("providerId", provider_id));
            Criteria criteria2 = session.createCriteria(MemberEntity.class);
            criteria2.add(Restrictions.eq("memberId", member_id));
            List list1 = criteria1.list();
            List list2 = criteria2.list();
            if(list != null && !list.isEmpty())
            {
                ServiceEntity serviceEntity = (ServiceEntity)list.get(0);
                ProviderEntity providerEntity = (ProviderEntity)list1.get(0);
                MemberEntity memberEntity = (MemberEntity)list2.get(0);
                Map sess = ActionContext.getContext().getSession();
                sess.put("ServiceNow", serviceEntity);
                sess.put("message", message);
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                nowTime = df.format(new Date());
                Timestamp ts = Timestamp.valueOf(nowTime);
                Date date = dateFormat.parse(serviceTime);
                java.sql.Date serviceDate = new java.sql.Date(date.getTime());
                System.out.println(ts);
                System.out.println(date.toString());
                ServicerecordEntity servicerecordEntity = new ServicerecordEntity();
                servicerecordEntity.setTimeStamp(ts);
                servicerecordEntity.setDateProvided(serviceDate);
                servicerecordEntity.setServiceEntity(serviceEntity);
                servicerecordEntity.setProviderEntity(providerEntity);
                servicerecordEntity.setMemberEntity(memberEntity);
                servicerecordEntity.setComments(comments);
                sess.put("Record",servicerecordEntity);
                return "success";
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        message = "当前服务不存在，请重新输入服务代码！";
        Map se = ActionContext.getContext().getSession();
        se.put("message", message);
        return "error";
    }
}
