/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.minister;
import javax.swing.*;
/**
 *
 * @author Windows 10
 */
public class MinisterMenuPanel extends JPanel {

    /**
     * Creates new form MinistryPanel
     */
    public MinisterMenuPanel() {
        initComponents();
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

        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        modifySubjectBtn = new JButton();
        modifyClassBtn = new JButton();
        studentAttendBtn = new JButton();
        changePassBtn = new JButton();
        jButton1 = new JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("ADMIN MENU");
        jPanel2.add(jLabel1);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        modifySubjectBtn.setText("Modify Subject");
        modifySubjectBtn.setMaximumSize(new java.awt.Dimension(300, 50));
        modifySubjectBtn.setMinimumSize(new java.awt.Dimension(200, 50));
        modifySubjectBtn.setPreferredSize(new java.awt.Dimension(150, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(modifySubjectBtn, gridBagConstraints);

        modifyClassBtn.setText("Modify Class");
        modifyClassBtn.setMaximumSize(new java.awt.Dimension(300, 50));
        modifyClassBtn.setMinimumSize(new java.awt.Dimension(200, 50));
        modifyClassBtn.setPreferredSize(new java.awt.Dimension(150, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(modifyClassBtn, gridBagConstraints);

        studentAttendBtn.setText("Student Attendance");
        studentAttendBtn.setMaximumSize(new java.awt.Dimension(300, 50));
        studentAttendBtn.setMinimumSize(new java.awt.Dimension(200, 50));
        studentAttendBtn.setPreferredSize(new java.awt.Dimension(150, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(studentAttendBtn, gridBagConstraints);

        changePassBtn.setText("Change Password");
        changePassBtn.setMaximumSize(new java.awt.Dimension(300, 50));
        changePassBtn.setMinimumSize(new java.awt.Dimension(200, 50));
        changePassBtn.setPreferredSize(new java.awt.Dimension(150, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(changePassBtn, gridBagConstraints);

        jButton1.setText("Sign out");
        jButton1.setMaximumSize(new java.awt.Dimension(300, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(200, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jButton1, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton changePassBtn;
    private JButton jButton1;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JButton modifyClassBtn;
    private JButton modifySubjectBtn;
    private JButton studentAttendBtn;
    // End of variables declaration//GEN-END:variables
}