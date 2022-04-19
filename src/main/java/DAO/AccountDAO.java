package DAO;

import POJO.Account;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.google.common.hash.Hashing;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


public class AccountDAO {
    public static Account signIn(String username,String password)
    {
        Session session=HibernateUtil.getCurrentSession();
        HibernateUtil.openTransaction();
        Account account=(Account)session.get(Account.class,username);
        if(account!=null)
        {
            if(hashPassword(password).equals(account.getPassword())==false)
            {
                return null;
            }
        }
        return account;
    }

    public static void createStudentAccount(String studentID)
    {
        Account account=new Account();
        account.setUsername(studentID);
        account.setPassword(hashPassword(studentID));
        account.setIsactive(false);
        account.setIsadmin(false);

        Session session=HibernateUtil.getCurrentSession();
        Transaction trans=HibernateUtil.openTransaction();
        session.saveOrUpdate(account);
        trans.commit();
    }

    public static void saveOrUpdateStudent(String studentID)
    {
        Session session=HibernateUtil.getCurrentSession();
        Transaction trans=HibernateUtil.openTransaction();
        Account account=(Account) session.get(Account.class,studentID);
        if(account==null)
            createStudentAccount(studentID);



    }

    public static boolean createAdminAccount(String username,String password)
    {
        Account account=new Account();
        account.setUsername(username);
        account.setPassword(hashPassword(password));
        account.setIsadmin(true);
        account.setIsactive(true);

        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction trans=HibernateUtil.openTransaction();
        try{
            session.save(account);
            trans.commit();
        }catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    public static String hashPassword(String password)
    {
        return Hashing.sha256().hashString(password,StandardCharsets.UTF_8).toString();
    }

    public static void changePassword(Account account,String newPassword)
    {
        account.setPassword(AccountDAO.hashPassword(newPassword));
        account.setIsactive(true);
        Session session=HibernateUtil.getCurrentSession();
        Transaction trans=HibernateUtil.openTransaction();
        session.saveOrUpdate(account);
        trans.commit();
        System.out.println(session.getTransaction().getStatus());

    }
    public static List<Account> getAllAdminAccounts()
    {
        List<Account> ret=new ArrayList<>();
        Session session=HibernateUtil.getCurrentSession();
        HibernateUtil.openTransaction();
        ret=(List<Account>) session.createQuery("from Account where isadmin=true ").list();
        return ret;
    }

    public static Object[] convertAccountToRowData(Account account)
    {
        return new Object[]{account.getUsername(),account.getIsadmin(),account.getIsactive()};
    }

    public static void resetPassword(String username){
        Session session=HibernateUtil.getCurrentSession();
        Transaction trans=HibernateUtil.openTransaction();
        String hashPassword=hashPassword(username);
        session.createQuery("update Account as ac set ac.password='" +
                hashPassword+
                "' where ac.username='" +
                username+ "'").executeUpdate();

        trans.commit();
    }
}
