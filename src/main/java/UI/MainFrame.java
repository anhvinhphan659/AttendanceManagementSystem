package UI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame()
    {
        setUpDisplay();
    }

    private void setUpDisplay()
    {
        setSize(new Dimension(800,600));
        setDefaultLookAndFeelDecorated(true);
        add(new MainPanel(this));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void changePanel(JPanel panel)
    {
        getContentPane().removeAll();
        add(panel);
        setVisible(true);
    }
}
