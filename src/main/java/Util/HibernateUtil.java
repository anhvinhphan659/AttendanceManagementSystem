package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static void config()
    {
        //make sessionFactory final
        if(sessionFactory==null)
        {
            try {
                Configuration configuration=new Configuration();
                configuration.configure("hibernate.cfg.xml");
                sessionFactory=configuration.buildSessionFactory();

            }catch (Exception e)
            {
                System.out.println("ERROR: error in initializing Session Factory!");
            }
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
