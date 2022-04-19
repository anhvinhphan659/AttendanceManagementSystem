package UI.util;

import javax.swing.*;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
import java.util.Vector;

public class CheckInRenderer extends DefaultTableCellRenderer {


    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c= super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
        System.out.println(value);
        c.setBackground(Color.WHITE);
        if(value==null)
            value="ABSENT";

        value=String.valueOf(value);
        if(value=="ABSENT")
        {
            c.setBackground(Color.YELLOW);
        }
        else if(value=="NOT CHECKED")
        {


        }
        else
        {
            c.setBackground(new Color(55, 191, 10));
        }

        return c;
    }

}
