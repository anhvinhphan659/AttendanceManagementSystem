/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.student;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Windows 10
 */
public class AttendanceResultPanel extends JPanel {

    /**
     * Creates new form AttendanceResultPanel
     */
    public AttendanceResultPanel() {
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

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel3 = new JPanel();
        Semester = new JLabel();
        semesterCB = new JComboBox<>();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable2 = new JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(37, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(746, 70));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ATTENDANCE RESULT");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel3.setPreferredSize(new java.awt.Dimension(746, 40));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 5));

        Semester.setText("Semester:");
        jPanel3.add(Semester);

        semesterCB.setModel(new DefaultComboBoxModel<>(new String[] { "Semester 1" }));
        semesterCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterCBActionPerformed(evt);
            }
        });
        jPanel3.add(semesterCB);

        jPanel1.add(jPanel3, java.awt.BorderLayout.SOUTH);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setMinimumSize(new java.awt.Dimension(0, 400));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jTable2.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                Object.class, Object.class, Object.class, Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void semesterCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel Semester;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JTable jTable2;
    private JComboBox<String> semesterCB;
    // End of variables declaration//GEN-END:variables
}
