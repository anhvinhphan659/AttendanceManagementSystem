/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.student;

import DAO.AttendanceDAO;
import DAO.SubjectDAO;
import POJO.Attendance;
import POJO.Subject;
import UI.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TimeZone;

/**
 *
 * @author Windows 10
 */
public class CheckInPanel extends javax.swing.JPanel {


    private MainFrame mainFrame;
    /**
     * Creates new form CheckInPanel
     */
    public CheckInPanel(MainFrame mainFrame) {
        this.mainFrame=mainFrame;
        initComponents();
        setUpAction();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel2.setMaximumSize(new java.awt.Dimension(1400, 100));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel2);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel9.setPreferredSize(new java.awt.Dimension(787, 50));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/resources/previous.png"))); // NOI18N
        backBtn.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel9.add(backBtn);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CHECK IN");
        jLabel1.setMinimumSize(new java.awt.Dimension(252, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel9.add(jLabel1);

        add(jPanel9, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void setUpAction()
    {

        checkInList=new ArrayList<>();
        ArrayList<Object[]> checkIns= AttendanceDAO.getAllSubjectsStudentAttend(mainFrame.getAccount().getUsername());
        System.out.println(checkIns.size());
        for (int i=0;i<checkIns.size();i++)
        {
            Object[] rowData=checkIns.get(i);
            System.out.println((Subject)rowData[1]);
            CheckInItem checkInItem=createCheckInItem((Attendance) rowData[0],(Subject) rowData[1]);
            if(checkInItem!=null)
            {
                jPanel2.add(checkInItem);
            }
        }
//        System.out.println(subjects.size());
//        Object[] att_sub=(Object[]) subjects.get(0);
//        System.out.println(att_sub.length);
//        System.out.println(att_sub[1]);
//        System.out.println(att_sub[0]);
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.changePanel(new StudentMenuPanel(mainFrame));
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Object[]> checkInList;

    private CheckInItem createCheckInItem(Attendance attendance, Subject subject)
    {

        //check condition

        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy MM dd hh:mm a zzz");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
        java.util.Date today=new java.util.Date();
        today=new java.util.Date(today.getTime()+ CheckInItem.TIME_ZONE_7_PLUS);
        java.util.Date startDay=new java.util.Date(subject.getStartday().getTime());
        java.util.Date endDay=new java.util.Date(subject.getEndday().getTime());
        System.out.println(today);
        System.out.println(startDay);
        System.out.println(endDay);
        System.out.println(String.format("%b-%b-%b",(today.getDate()-startDay.getDate())%7!=0,
                startDay.after(today),
                today.after(endDay)));
        System.out.println(today.getDate()-startDay.getDate());
        //not date
        if((today.getDate()-startDay.getDate())%7!=0||startDay.after(today)||today.after(endDay))
            return null;


        //not in time
        int inSession=SubjectDAO.isInSession(today,SubjectDAO.convertScheduleToObject(subject.getSchedule(),1),
                SubjectDAO.convertScheduleToObject(subject.getSchedule(),2));

        System.out.println(inSession);

        CheckInItem checkInItem=new CheckInItem();
        checkInItem.setAttendance(attendance);
        checkInItem.setCourseName(subject.getSubjectName());
        checkInItem.setSchedule(subject.getSchedule());
        int thweek=(today.getDate()-startDay.getDate())/7;
        checkInItem.setThWeek(thweek);

        if(inSession==1)
            checkInItem.setCheckInState("Over time");
        else if(inSession==-1)
            checkInItem.setCheckInState("BeforeTime");
        else {//in time
            checkInItem.setCheckInState("In Time");
            checkInItem.setAttendance(attendance);
            checkInItem.setCheckInBtnEnable(true);
            //handle next time check in
            char[] attend=attendance.getAttend().toCharArray();
            if(attend[thweek]=='2')
                checkInItem.setCheckInBtnChecked();
        }

        return checkInItem;
    }
}
