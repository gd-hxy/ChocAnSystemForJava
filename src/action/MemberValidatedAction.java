package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.HibernateUtil;
import entity.MemberEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class MemberValidatedAction extends ActionSupport {
    private int member_id;
    private String state;

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String execute() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        try{
            Criteria criteria = session.createCriteria(MemberEntity.class);
            criteria.add(Restrictions.eq("memberId", member_id));
            List list = criteria.list();
            if(list != null && !list.isEmpty())
            {
                MemberEntity memberEntity = (MemberEntity)list.get(0);
                state = memberEntity.getMemberState();
                if(state.equals("Validated"))
                {
                    return "success";
                } else {
                    return "error";
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return "error";
    }
}
