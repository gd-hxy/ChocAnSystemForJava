package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.HibernateUtil;
import entity.AdminEntity;
import entity.MemberEntity;
import entity.OperatorEntity;
import entity.ProviderEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


import java.util.List;
import java.util.Map;

/**
 * LoginAction class
 *
 * @author xiaoyang Huang
 * @date 2019/11/28
 */
public class LoginAction extends ActionSupport {
    private String userType;
    private String userName;
    private String userPass;
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }


    public String login() throws Exception{
        try{
            Configuration cfg = new Configuration()
                    .configure();
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            Session session = sessionFactory.openSession();
            switch(userType){
                case "管理员":
                    Criteria criteria1 = session.createCriteria(AdminEntity.class);
                    criteria1.add(Restrictions.eq("adminName", userName));
                    criteria1.add(Restrictions.eq("adminPass", userPass));
                    List list1 = criteria1.list();
                    if(list1 != null && !list1.isEmpty())
                    {
                        AdminEntity adminEntity = (AdminEntity)list1.get(0);
                        Map sess = ActionContext.getContext().getSession();
                        sess.put("UserNow", adminEntity);
                        return "admin";
                    } else{
                        return "error";
                    }
                case "操作员":
                    Criteria criteria2 = session.createCriteria(OperatorEntity.class);
                    criteria2.add(Restrictions.eq("operatorName", userName));
                    criteria2.add(Restrictions.eq("operatorPass", userPass));
                    List list2 = criteria2.list();
                    if(list2 != null && !list2.isEmpty())
                    {
                        OperatorEntity operatorEntity = (OperatorEntity)list2.get(0);
                        Map sess = ActionContext.getContext().getSession();
                        sess.put("UserNow", operatorEntity);
                        return "operator";
                    } else{
                        return "error";
                    }
                case "提供者":
                    Criteria criteria3 = session.createCriteria(ProviderEntity.class);
                    criteria3.add(Restrictions.eq("providerName", userName));
                    criteria3.add(Restrictions.eq("providerPass", userPass));
                    List list3 = criteria3.list();
                    if(list3 != null && !list3.isEmpty())
                    {
                        ProviderEntity providerEntity = (ProviderEntity)list3.get(0);
                        Map sess = ActionContext.getContext().getSession();
                        sess.put("UserNow", providerEntity);
                        return "provider";
                    } else{
                        return "error";
                    }
                case "会员":
                    Criteria criteria4 = session.createCriteria(MemberEntity.class);
                    criteria4.add(Restrictions.eq("memberName", userName));
                    criteria4.add(Restrictions.eq("memberPass", userPass));
                    List list4 = criteria4.list();
                    if(list4 != null && !list4.isEmpty())
                    {
                        MemberEntity memberEntity = (MemberEntity)list4.get(0);
                        Map sess = ActionContext.getContext().getSession();
                        sess.put("UserNow", memberEntity);
                        return "member";
                    } else{
                        return "error";
                    }
                default:System.out.println("error");break;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return "error";
    }
}
