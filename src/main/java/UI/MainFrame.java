package UI;

import POJO.Account;
import Util.HibernateUtil;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Account account;
    public MainFrame()
    {
        HibernateUtil.config();

        //handle if session error
        if(HibernateUtil.getSessionFactory()==null)
        {
            System.out.println("Error in initializing Session Factory!");
            JOptionPane.showMessageDialog(null,"Error connect with database! \nPlease check your database again!","Error",JOptionPane.ERROR_MESSAGE);
            dispose();
            return;
        }
        setUpDisplay();

    }

    private void setUpDisplay()
    {
        setSize(new Dimension(800,600));
        setLayout(new BorderLayout());
        setDefaultLookAndFeelDecorated(true);
        add(new MainPanel(this));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setTitle("Student Attendance Management System");
    }

    public void changePanel(JPanel panel)
    {
        getContentPane().removeAll();
        add(panel);
        setVisible(true);
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
