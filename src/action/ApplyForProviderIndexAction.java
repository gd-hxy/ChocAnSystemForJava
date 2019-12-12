package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.HibernateUtil;
import entity.ServiceEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import java.util.List;

/**
 * @author xiaoyang huang
 */
public class ApplyForProviderIndexAction extends ActionSupport {
    private int providerId;
    private List<ServiceEntity> lists;

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public List<ServiceEntity> getLists() {
        return lists;
    }

    public void setLists(List<ServiceEntity> list) {
        this.lists = lists;
    }

    @Override
    public String execute() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            Criteria criteria = session.createCriteria(ServiceEntity.class);
            lists = criteria.list();
            if(lists != null && !lists.isEmpty())
            {
                return "success";
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return "error";
    }
}
