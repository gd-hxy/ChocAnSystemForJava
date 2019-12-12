package test;

import dao.HibernateUtil;
import entity.MemberEntity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class testMember {
    public static void main(String[] argv) throws Exception{
        Session session = HibernateUtil.getCurrentSession();
        Transaction tr = session.beginTransaction();
        try{
            Criteria criteria = session.createCriteria(MemberEntity.class);
            List<MemberEntity> list = criteria.list();
            MemberEntity memberEntity = list.get(0);
            System.out.println(memberEntity.getMemberName());
            session.close();
        } catch (Exception e){
            e.printStackTrace();
            session.close();
        }
    }
}
