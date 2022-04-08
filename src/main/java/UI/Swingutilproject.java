/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package UI;

import UI.minister.ModifySubjectPanel;

import java.awt.Dimension;
import javax.swing.*;
public class Swingutilproject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        JFrame mainFrame=new JFrame();
        mainFrame.setSize(new Dimension(800,600));
        mainFrame.add(new ModifySubjectPanel());
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
