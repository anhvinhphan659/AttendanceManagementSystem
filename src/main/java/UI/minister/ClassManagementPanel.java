/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.minister;

import UI.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Windows 10
 */
public class ClassManagementPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    /**
     * Creates new form ModifyClassPanel
     */
    public ClassManagementPanel(MainFrame mainFrame) {
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

        centerPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        editBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        applyBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        importBtn = new javax.swing.JButton();
        topPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        showClassBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        centerPanel.setMaximumSize(new java.awt.Dimension(2147483647, 400));
        centerPanel.setPreferredSize(new java.awt.Dimension(577, 300));
        centerPanel.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        editBtn.setPreferredSize(new java.awt.Dimension(80, 30));

        removeBtn.setText("Remove");
        removeBtn.setPreferredSize(new java.awt.Dimension(80, 30));

        applyBtn.setText("Apply");
        applyBtn.setPreferredSize(new java.awt.Dimension(80, 30));

        addBtn.setText("Add");
        addBtn.setPreferredSize(new java.awt.Dimension(80, 30));

        importBtn.setText("Import...");
        importBtn.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(applyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(importBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(importBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(applyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        centerPanel.add(jPanel6, java.awt.BorderLayout.WEST);

        add(centerPanel, java.awt.BorderLayout.CENTER);

        topPanel.setPreferredSize(new java.awt.Dimension(684, 100));
        topPanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(580, 200));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        jPanel4.setPreferredSize(new java.awt.Dimension(460, 100));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel2.setText("Subject:");
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel4.add(jLabel2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subject 1" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel4.add(jComboBox1);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        topPanel.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        jPanel2.setMaximumSize(new java.awt.Dimension(100, 32767));
        jPanel2.setPreferredSize(new java.awt.Dimension(125, 93));

        showClassBtn.setText("Show");
        showClassBtn.setAlignmentX(0.5F);
        showClassBtn.setPreferredSize(new java.awt.Dimension(85, 30));
        jPanel2.add(showClassBtn);

        topPanel.add(jPanel2, java.awt.BorderLayout.EAST);

        jPanel3.setPreferredSize(new java.awt.Dimension(787, 35));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/resources/previous.png"))); // NOI18N
        backBtn.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel3.add(backBtn);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CLASS MANAGEMENT");
        jLabel1.setMinimumSize(new java.awt.Dimension(252, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel3.add(jLabel1);

        topPanel.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        add(topPanel, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void setUpAction()
    {
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.changePanel(new MinisterMenuPanel(mainFrame));
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton applyBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton importBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton showClassBtn;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
