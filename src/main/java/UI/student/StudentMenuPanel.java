/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.student;

import UI.ChangePassPanel;
import UI.MainFrame;
import UI.MainPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Windows 10
 */
public class StudentMenuPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    /**
     * Creates new form StudentPanel
     */
    public StudentMenuPanel(MainFrame mainFrame) {
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
        java.awt.GridBagConstraints gridBagConstraints;

        checkInBtn = new javax.swing.JButton();
        attendResultBtn = new javax.swing.JButton();
        changePassBtn = new javax.swing.JButton();
        signOutBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        checkInBtn.setText("Check In");
        checkInBtn.setMaximumSize(new java.awt.Dimension(300, 50));
        checkInBtn.setMinimumSize(new java.awt.Dimension(150, 50));
        checkInBtn.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        add(checkInBtn, gridBagConstraints);

        attendResultBtn.setText("Attendance Result");
        attendResultBtn.setMaximumSize(new java.awt.Dimension(300, 50));
        attendResultBtn.setMinimumSize(new java.awt.Dimension(150, 50));
        attendResultBtn.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        add(attendResultBtn, gridBagConstraints);

        changePassBtn.setText("Change Password");
        changePassBtn.setMaximumSize(new java.awt.Dimension(300, 50));
        changePassBtn.setMinimumSize(new java.awt.Dimension(150, 50));
        changePassBtn.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        add(changePassBtn, gridBagConstraints);

        signOutBtn.setText("Sign Out");
        signOutBtn.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        add(signOutBtn, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void setUpAction()
    {
        attendResultBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.changePanel(new AttendanceResultPanel(mainFrame));
            }
        });
        checkInBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.changePanel(new CheckInPanel(mainFrame));
            }
        });
        signOutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.changePanel(new MainPanel(mainFrame));
                mainFrame.setAccount(null);
            }
        });
        changePassBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.changePanel(new ChangePassPanel(mainFrame));
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendResultBtn;
    private javax.swing.JButton changePassBtn;
    private javax.swing.JButton checkInBtn;
    private javax.swing.JButton signOutBtn;
    // End of variables declaration//GEN-END:variables
}
