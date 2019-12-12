package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.imageio.spi.ServiceRegistry;

/**
 * 连接数据库类
 *
 * @author xiaoyang Huang
 * @date 2019/11/28
 */
public class HibernateUtil {
    public static final SessionFactory sessionFactory;
    //ThreadLocal可以隔离多个线程的数据共享，因此不需要对线程进行同步
    public static ThreadLocal<Session> session = new ThreadLocal<Session>();
    static
    {
        try{
            //使用默认配置文件创建Configuration实例
            Configuration cfg = new Configuration()
                    .configure();
            sessionFactory = cfg.buildSessionFactory();
        } catch (Throwable ex){
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static Session getCurrentSession() throws HibernateException {

        Session s = session.get();
        //如果该线程还没有Session，则创建一个新的Session
        if (s == null)
        {
            s = sessionFactory.openSession();
            //将获得的Session变量存储在ThreadLocal变量session里
            session.set(s);
        }
        return s;
    }

    public static void clossSession() throws HibernateException {
        Session s = session.get();
        if (s != null)
        {
            s.close();
        }
        session.set(null);
    }
}