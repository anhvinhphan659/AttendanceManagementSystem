import DAO.AccountDAO;
import POJO.Account;
import POJO.Attendance;
import POJO.AttendanceID;
import POJO.Subject;
import UI.MainFrame;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        MainFrame mainFrame=new MainFrame();

//        SessionFactory factory=HibernateUtil.getSessionFactory();
//        System.out.println(factory.toString());
//        Session session= factory.getCurrentSession();
//        session.beginTransaction();
//        AccountDAO.createStudentAccount("19120721");
//        Account account=new Account("vinhphan","678910",true,true);
//        session.saveOrUpdate(account);
//        Subject subject=new Subject();
//        subject.setIdsubject("CSC0001");
//        subject.setSubjectName("Test Subject");
//        subject.setStartday(Date.valueOf("2022-10-10"));
//        subject.setEndday(Date.valueOf("2022-10-10"));
//        subject.setSchedule("Wed 8:30");
//        subject.setRoomname("E104");
//        session.saveOrUpdate(subject);

//        Subject sub=(Subject) session.get(Subject.class,"CSC0001");
//        System.out.println(sub);


//        Attendance attendance=new Attendance();
//        AttendanceID attendanceID=new AttendanceID();
//        attendanceID.setIdstudent("vinhphan");
//        attendanceID.setIdsubject("CSC0001");
//        attendance.setIdstudent(attendanceID);
//        attendance.setAttend("0121111111");
//        session.saveOrUpdate(attendance);
//        session.getTransaction().commit();
    }
}
