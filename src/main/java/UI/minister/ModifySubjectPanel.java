/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.minister;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Windows 10
 */
public class ModifySubjectPanel extends JPanel {

    /**
     * Creates new form ModifySubjectPanel
     */
    public ModifySubjectPanel() {
        initComponents();
    }

    private void initComponents() {

        jLabel11 = new JLabel();
        topPanel = new JPanel();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jPanel3 = new JPanel();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel3 = new JLabel();
        jLabel7 = new JLabel();
        subjectIDTF = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        subjectNameTF = new JTextField();
        jComboBox1 = new JComboBox<>();
        jPanel4 = new JPanel();
        jLabel6 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jComboBox2 = new JComboBox<>();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jTextField7 = new JTextField();
        jPanel2 = new JPanel();
        addSubjectBtn = new JButton();
        centerPanel = new JPanel();
        jPanel5 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jPanel6 = new JPanel();
        editBtn = new JButton();
        removeBtn = new JButton();
        applyBtn = new JButton();

        jLabel11.setText("jLabel11");

        setLayout(new java.awt.BorderLayout());

        topPanel.setPreferredSize(new java.awt.Dimension(684, 160));
        topPanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("SUBJECT MANAGEMENT");
        topPanel.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setPreferredSize(new java.awt.Dimension(580, 200));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        jPanel3.setLayout(new java.awt.GridLayout(2, 5, 20, 0));

        jLabel2.setText("Subject ID:");
        jPanel3.add(jLabel2);

        jLabel4.setText("Start Date:");
        jPanel3.add(jLabel4);

        jLabel5.setText("End day:");
        jPanel3.add(jLabel5);

        jLabel3.setText("Subject Name:");
        jPanel3.add(jLabel3);

        jLabel7.setText("Number of weeks:");
        jPanel3.add(jLabel7);

        subjectIDTF.setMinimumSize(new java.awt.Dimension(80, 24));
        subjectIDTF.setPreferredSize(new java.awt.Dimension(81, 24));
        jPanel3.add(subjectIDTF);

        jTextField3.setMinimumSize(new java.awt.Dimension(80, 24));
        jTextField3.setPreferredSize(new java.awt.Dimension(81, 24));
        jPanel3.add(jTextField3);

        jTextField4.setMinimumSize(new java.awt.Dimension(80, 24));
        jTextField4.setPreferredSize(new java.awt.Dimension(81, 24));
        jPanel3.add(jTextField4);

        subjectNameTF.setMinimumSize(new java.awt.Dimension(80, 24));
        subjectNameTF.setPreferredSize(new java.awt.Dimension(81, 24));
        subjectNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectNameTFActionPerformed(evt);
            }
        });
        jPanel3.add(subjectNameTF);

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        jPanel3.add(jComboBox1);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        jPanel4.setPreferredSize(new java.awt.Dimension(460, 100));
        jPanel4.setLayout(new java.awt.GridLayout(2, 5, 10, 5));

        jLabel6.setText("Day in Week:");
        jPanel4.add(jLabel6);

        jLabel8.setText("Start Time:");
        jPanel4.add(jLabel8);

        jLabel9.setText("End time:");
        jPanel4.add(jLabel9);

        jLabel10.setText("Room Name:");
        jPanel4.add(jLabel10);

        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        jPanel4.add(jComboBox2);

        jTextField5.setMinimumSize(new java.awt.Dimension(80, 24));
        jTextField5.setPreferredSize(new java.awt.Dimension(81, 24));
        jPanel4.add(jTextField5);

        jTextField6.setMinimumSize(new java.awt.Dimension(80, 24));
        jTextField6.setPreferredSize(new java.awt.Dimension(81, 24));
        jPanel4.add(jTextField6);

        jTextField7.setMinimumSize(new java.awt.Dimension(80, 24));
        jTextField7.setPreferredSize(new java.awt.Dimension(81, 24));
        jPanel4.add(jTextField7);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        topPanel.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setMaximumSize(new java.awt.Dimension(100, 32767));
        jPanel2.setPreferredSize(new java.awt.Dimension(125, 93));

        addSubjectBtn.setText("Add");
        addSubjectBtn.setPreferredSize(new java.awt.Dimension(72, 25));
        jPanel2.add(addSubjectBtn);

        topPanel.add(jPanel2, java.awt.BorderLayout.EAST);

        add(topPanel, java.awt.BorderLayout.PAGE_START);

        centerPanel.setMaximumSize(new java.awt.Dimension(2147483647, 400));
        centerPanel.setPreferredSize(new java.awt.Dimension(577, 300));
        centerPanel.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        centerPanel.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setMaximumSize(new java.awt.Dimension(150, 32767));
        jPanel6.setMinimumSize(new java.awt.Dimension(125, 100));
        jPanel6.setPreferredSize(new java.awt.Dimension(125, 300));

        editBtn.setText("Edit");

        removeBtn.setText("Remove");

        applyBtn.setText("Apply");

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(applyBtn)
                    .addComponent(removeBtn)
                    .addComponent(editBtn))
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(editBtn)
                .addGap(18, 18, 18)
                .addComponent(removeBtn)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addComponent(applyBtn)
                .addGap(16, 16, 16))
        );

        centerPanel.add(jPanel6, java.awt.BorderLayout.EAST);

        add(centerPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void subjectNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectNameTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton addSubjectBtn;
    private JButton applyBtn;
    private JPanel centerPanel;
    private JButton editBtn;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JButton removeBtn;
    private JTextField subjectIDTF;
    private JTextField subjectNameTF;
    private JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
