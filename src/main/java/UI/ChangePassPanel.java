/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import DAO.AccountDAO;
import UI.minister.MinisterMenuPanel;
import UI.student.StudentMenuPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Windows 10
 */
public class ChangePassPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    /**
     * Creates new form ChangePassPanel
     */
    public ChangePassPanel(MainFrame mainFrame) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newPassPF = new javax.swing.JPasswordField();
        oldPassPF = new javax.swing.JPasswordField();
        reNewPassPF = new javax.swing.JPasswordField();
        changePassBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setText("Old Password:");

        jLabel2.setText("New Password:");

        jLabel3.setText("Retype New Password:");

        newPassPF.setPreferredSize(new java.awt.Dimension(150, 31));
        newPassPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPassPFActionPerformed(evt);
            }
        });

        oldPassPF.setPreferredSize(new java.awt.Dimension(150, 31));

        reNewPassPF.setPreferredSize(new java.awt.Dimension(150, 31));

        changePassBtn.setText("Change Pass");
        changePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassBtnActionPerformed(evt);
            }
        });

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/resources/previous.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPassPF, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reNewPassPF, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldPassPF, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changePassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(oldPassPF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassPF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(reNewPassPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(changePassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void changePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePassBtnActionPerformed

    private void oldPassPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPassPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldPassPFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setUpAction()
    {
        boolean isActive=mainFrame.getAccount().getIsactive();
        backBtn.setEnabled(isActive);
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isAdmin=mainFrame.getAccount().getIsadmin();

                if(isAdmin)
                {
                    mainFrame.changePanel(new MinisterMenuPanel(mainFrame));
                }
                else
                {
                    mainFrame.changePanel(new StudentMenuPanel(mainFrame));
                }
            }
        });

        changePassBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oldPass=String.valueOf(oldPassPF.getPassword());
                String newPass=String.valueOf(newPassPF.getPassword());
                String reNewPass=String.valueOf(reNewPassPF.getPassword());

                //check password and renew password
                if(newPass.equals(reNewPass)==false)
                {
                    JOptionPane.showMessageDialog(null,
                            "The new password is not the same with renew password.\n" +
                                    "Please retype new password and renew password.","Message",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                //check old password
                if(mainFrame.getAccount().getPassword().equals(AccountDAO.hashPassword(oldPass))==false)
                {
                    JOptionPane.showMessageDialog(null,
                            "The old password is not correct!",
                            "Message",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                AccountDAO.changePassword(mainFrame.getAccount(),newPass);
                JOptionPane.showMessageDialog(null,
                        "The password is changed successfully",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                //empty password
                oldPassPF.setText("");
                newPassPF.setText("");
                reNewPassPF.setText("");

                backBtn.setEnabled(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePassBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField oldPassPF;
    private javax.swing.JPasswordField newPassPF;
    private javax.swing.JPasswordField reNewPassPF;
    // End of variables declaration//GEN-END:variables
}
