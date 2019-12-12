package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.HibernateUtil;
import entity.MemberEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.math.BigDecimal;
import java.util.Map;

/**
 * PayAction class
 *
 * @author xiaoyang Huang
 * @date 2019/11/28
 */
public class PayAction extends ActionSupport {
    private double money;
    private int flag;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int isFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String execute() throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        Map sess = ActionContext.getContext().getSession();
        MemberEntity memberEntity = (MemberEntity) sess.get("UserNow");
        if(money < 0 || money > 9999999.99){
            return "error";
        }
        if(memberEntity != null)
        {
            double fee = memberEntity.getMemberFee();
            double result = fee + money;
            BigDecimal bg = new BigDecimal(result);
            result = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            try{
            session.beginTransaction();
            memberEntity.setMemberFee(result);
            session.merge(memberEntity);
            session.getTransaction().commit();
            flag = 1;
            return "success";
            }catch (Exception e){
                e.printStackTrace();
                flag = 0;
                session.getTransaction().rollback();
            }
        }
        return "error";
    }
}
