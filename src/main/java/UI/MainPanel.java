/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import DAO.AccountDAO;
import POJO.Account;
import UI.minister.AdminManagementPanel;
import UI.minister.MinisterMenuPanel;
import UI.student.StudentMenuPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Windows 10
 */
public class MainPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    /**
     * Creates new form mainPanel
     */
    public MainPanel(MainFrame mainFrame) {
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
        topPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        centerPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        usernameTF = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        passwordTF = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        signInBtn = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.BorderLayout());

        topPanel.setMaximumSize(new java.awt.Dimension(800, 200));
        topPanel.setPreferredSize(new java.awt.Dimension(800, 150));
        topPanel.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon icon=new javax.swing.ImageIcon(getClass().getResource("/UI/resources/sams_logo.png"));
        Image image=icon.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH);

        jLabel3.setIcon(new ImageIcon(image)); // NOI18N
        topPanel.add(jLabel3, java.awt.BorderLayout.CENTER);

        add(topPanel, java.awt.BorderLayout.NORTH);

        jPanel6.setBackground(new java.awt.Color(198, 241, 231));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 150, 20, 150));
        jPanel6.setLayout(new java.awt.BorderLayout());

        centerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        centerPanel.setMinimumSize(new java.awt.Dimension(400, 200));
        centerPanel.setPreferredSize(new java.awt.Dimension(400, 350));
        centerPanel.setLayout(new java.awt.GridLayout(1, 3));

        jPanel1.setBackground(new java.awt.Color(198, 241, 231));
        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jLabel1.setBackground(new java.awt.Color(198, 241, 231));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Username: ");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setAlignmentY(30.0F);
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(new javax.swing.border.EmptyBorder(10,10,12,10)
        );
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1);
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setBackground(new java.awt.Color(198, 241, 231));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password: ");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(new javax.swing.border.EmptyBorder(12,10,10,10)
        );
        jPanel1.add(jLabel2);

        centerPanel.add(jPanel1);

        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        jPanel4.setBackground(new java.awt.Color(198, 241, 231));
        jPanel4.setMaximumSize(new java.awt.Dimension(200, 32767));
        jPanel4.setMinimumSize(new java.awt.Dimension(150, 0));

        usernameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        usernameTF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameTF.setMaximumSize(new java.awt.Dimension(300, 30));
        usernameTF.setMinimumSize(new java.awt.Dimension(64, 24));
        usernameTF.setPreferredSize(new java.awt.Dimension(150, 24));
        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(163, Short.MAX_VALUE)
                                .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
        );

        usernameTF.getAccessibleContext().setAccessibleDescription("");

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(198, 241, 231));
        jPanel5.setMaximumSize(new java.awt.Dimension(200, 32767));
        jPanel5.setMinimumSize(new java.awt.Dimension(150, 0));

        passwordTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        passwordTF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordTF.setMaximumSize(new java.awt.Dimension(300, 30));
        passwordTF.setMinimumSize(new java.awt.Dimension(64, 24));
        passwordTF.setPreferredSize(new java.awt.Dimension(150, 24));
        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(174, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);

        centerPanel.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(198, 241, 231));
        jPanel3.setBorder(new javax.swing.border.EmptyBorder(0,20,0,20)
        );
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        signInBtn.setText("Sign in");
        signInBtn.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        signInBtn.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
        signInBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signInBtn.setMaximumSize(new java.awt.Dimension(80, 52));
        signInBtn.setPreferredSize(new java.awt.Dimension(80, 52));
        signInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBtnActionPerformed(evt);
            }
        });
        jPanel3.add(signInBtn);

        centerPanel.add(jPanel3);

        jPanel6.add(centerPanel, java.awt.BorderLayout.CENTER);

        add(jPanel6, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void setUpAction()
    {
        topPanel.setBackground(new Color(198,241,231));
        signInBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //check signin information
                String username=usernameTF.getText();
                String password=passwordTF.getText();
                if(username.equals("")||password.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Username or password is empty","Message",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    Account account=AccountDAO.signIn(username,password);
                    if(account==null)
                    {
                        JOptionPane.showMessageDialog(null,"Account is not existed!","Message",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    else
                    {
                        System.out.println("Account existed!");
                        mainFrame.setAccount(account);
                        //load panel
                        if(account.getIsadmin())
                        {
                            mainFrame.changePanel(new MinisterMenuPanel(mainFrame));
                        }
                        else
                        {
                            if(account.getIsactive()==false)
                            {
                                mainFrame.changePanel(new ChangePassPanel(mainFrame));
                            }
                            else
                            {
                                mainFrame.changePanel(new StudentMenuPanel(mainFrame));
                            }

                        }
                    }
                }
            }
        });
    }

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTFActionPerformed

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFActionPerformed

    private void signInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JButton signInBtn;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
