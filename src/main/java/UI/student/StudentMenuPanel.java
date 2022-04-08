package UI.student;
import javax.swing.*;

public class StudentMenuPanel extends JPanel {

    /**
     * Creates new form StudentPanel
     */
    public StudentMenuPanel() {
        initComponents();
    }

    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        checkInBtn = new JButton();
        attendResultBtn = new JButton();
        changePassBtn = new JButton();

        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 150, 0};
        layout.rowHeights = new int[] {0, 80, 0};
        setLayout(layout);

        checkInBtn.setText("Check In");
        checkInBtn.setMaximumSize(new java.awt.Dimension(300, 50));
        checkInBtn.setMinimumSize(new java.awt.Dimension(150, 50));
        checkInBtn.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        add(checkInBtn, gridBagConstraints);

        attendResultBtn.setText("Attendance Result");
        attendResultBtn.setMaximumSize(new java.awt.Dimension(300, 50));
        attendResultBtn.setMinimumSize(new java.awt.Dimension(150, 50));
        attendResultBtn.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        add(attendResultBtn, gridBagConstraints);

        changePassBtn.setText("Change Password");
        changePassBtn.setMaximumSize(new java.awt.Dimension(300, 50));
        changePassBtn.setMinimumSize(new java.awt.Dimension(150, 50));
        changePassBtn.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        add(changePassBtn, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton attendResultBtn;
    private JButton changePassBtn;
    private JButton checkInBtn;
    // End of variables declaration//GEN-END:variables
}
