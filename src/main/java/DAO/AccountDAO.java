package DAO;

import POJO.Account;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;


public class AccountDAO {
    public static Account signIn(String username,String password)
    {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session= sessionFactory.getCurrentSession();
        session.beginTransaction();

        Account account=(Account)session.get(Account.class,username);
        if(account!=null)
        {
            if(hashPassword(password).equals(account.getPassword())==false)
            {
                return null;
            }
        }
        session.getTransaction().commit();


        return account;
    }

    public static void createStudentAccount(String studentID)
    {
        Account account=new Account();
        account.setUsername(studentID);
        account.setPassword(hashPassword(studentID));
        account.setIsactive(false);
        account.setIsadmin(false);

        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(account);
        session.getTransaction().commit();
    }

    public static void createAdminAccount(String username,String password)
    {
        Account account=new Account();
        account.setUsername(username);
        account.setPassword(hashPassword(password));
        account.setIsadmin(true);
        account.setIsactive(true);

        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(account);
        session.getTransaction().commit();
    }

    public static String hashPassword(String password)
    {
        return Hashing.sha256().hashString(password,StandardCharsets.UTF_8).toString();
    }

}
