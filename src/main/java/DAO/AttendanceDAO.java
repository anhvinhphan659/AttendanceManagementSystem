package DAO;

import POJO.Attendance;
import POJO.AttendanceID;
import POJO.Subject;
import UI.util.AttendTable;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AttendanceDAO
{
    public static boolean addNewAttendance(String studentID, String subjectID, String attend)
    {
        //create student
        AccountDAO.saveOrUpdateStudent(studentID);
        Session session=HibernateUtil.getCurrentSession();
        Transaction trans=HibernateUtil.openTransaction();
        //check attendance exits
        AttendanceID attendanceID=new AttendanceID();
        attendanceID.setIdstudent(studentID);
        attendanceID.setIdsubject(subjectID);
        Attendance attendance=(Attendance) session.get(Attendance.class,attendanceID);
        if(attendance!=null)
            return true;
        try{
            attendance=new Attendance();
            attendance.setIdattendance(attendanceID);
            attendance.setAttend(attend);
            session.save(attendance);
            trans.commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            trans.rollback();
            return false;
        }
        return true;
    }
    public static boolean updateAttendance(String studentID, String subjectID, String attend)
    {
        //create student
        AccountDAO.saveOrUpdateStudent(studentID);
        Session session=HibernateUtil.getCurrentSession();
        Transaction trans=HibernateUtil.openTransaction();
        System.out.println(attend);
        try{
            session.createQuery("update attendance set attend='" +attend+
                    "'"+" where idattendance.idstudent='" +studentID+
                    "'"+ " and idattendance.idsubject='" +subjectID+
                    "'").executeUpdate();
            trans.commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            trans.rollback();
            return false;
        }
        return true;
    }

    public static ArrayList<Attendance> getAttendTableBySubject(String subjectID)
    {

        Session session=HibernateUtil.getCurrentSession();
        HibernateUtil.openTransaction();
        ArrayList<Attendance> attendances=(ArrayList<Attendance>) session.createQuery("from attendance as att where att.idattendance.idsubject='"    +subjectID+"'", Attendance.class).list();

        return attendances;
    }



    public static ArrayList<Attendance> getAttendTableByStudent(String studentID)
    {

        Session session=HibernateUtil.getCurrentSession();
        HibernateUtil.openTransaction();
        ArrayList<Attendance> attendances=(ArrayList<Attendance>) session.createQuery("from attendance as att where att.idattendance.idstudent='"    +studentID+"'", Attendance.class).list();

        return attendances;
    }

    public static Object[] convertAttendToRowData(Attendance attendance,boolean addSubject)
    {
        String attendRes=attendance.getAttend();
        int attResLength=attendRes.length();
        if(attResLength<=15)
        {
            for(int i=0;i<15-attResLength;i++)
            {
                attendRes+="0";
            }
        }
        List res=new ArrayList();
        if(addSubject)
        {
            res.add(attendance.getIdattendance().getIdsubject());
        }
        else
            res.add(attendance.getIdattendance().getIdstudent());
        for(int i=0;i<attendRes.length();i++)
        {
            int attRes=Integer.parseInt(String.valueOf(attendRes.charAt(i)));
            String attStr="";
            switch (attRes)
            {
                case 0:
                    attStr= AttendTable.ABSENT;
                    break;
                case 2:
                    attStr=AttendTable.ATTEND;
                    break;
                default:
                    attStr=AttendTable.NOT_CHECKED;

            }
            res.add(attStr);
        }



        return res.toArray();
    }

    public static void removeAllStudentOfSubject(String subjectID)
    {
        Session session=HibernateUtil.getCurrentSession();
        Transaction trans=HibernateUtil.openTransaction();
        try{
            session.createQuery("delete from attendance where idattendance.idsubject='" +
                    subjectID+
                    "'").executeUpdate();

            trans.commit();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            trans.rollback();

        }
    }

    public static void removeStudentOfSubject(String subjectID,String studentID)
    {
        Session session=HibernateUtil.getCurrentSession();
        Transaction trans=HibernateUtil.openTransaction();
        try{
            session.createQuery("delete from attendance where idattendance.idsubject='" +
                    subjectID+
                    "'"+" and idattendance.idstudent='" +studentID+
                    "'").executeUpdate();

            trans.commit();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            trans.rollback();

        }
    }


    public static Object[][] convertAttendTableTo2DObject(List<Attendance> attendTable)
    {
        List<Object[]> ret=new ArrayList();
        for(int i=0;i<attendTable.size();i++)
        {
            ret.add(convertAttendToRowData(attendTable.get(i),true));
        }
        return ret.toArray(new Object[0][]);
    }

    public static ArrayList getAllSubjectsStudentAttend(String studentID)
    {

        Session session=HibernateUtil.getCurrentSession();
        HibernateUtil.openTransaction();
        ArrayList attendances= (ArrayList) session.createQuery(
                "from attendance as att join Subject as s on att.idattendance.idstudent='"
                        +studentID+"' and att.idattendance.idsubject=s.idsubject ").getResultList();


        return attendances;
    }

}
