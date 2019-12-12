package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.HibernateUtil;
import entity.ServicerecordEntity;
import org.hibernate.Session;

import java.util.Map;

public class SaveRecordAction extends ActionSupport {
    @Override
    public String execute() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            Map sess = ActionContext.getContext().getSession();
            ServicerecordEntity servicerecordEntity = (ServicerecordEntity)sess.get("Record");
            if(servicerecordEntity != null)
            {
                session.beginTransaction();
                session.save(servicerecordEntity);
                session.getTransaction().commit();
                return "success";
            }
        } catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "error";
    }
}
