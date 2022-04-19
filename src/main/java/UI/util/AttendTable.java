package UI.util;

import javax.swing.*;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.Vector;

public class AttendTable extends JTable {
    private AttendTableModel tableModel;
    private Class[] classNames;
    private static JComboBox<String> emptyCB;

    public static String ABSENT="ABSENT";
    public static String NOT_CHECKED="NOT CHECKED";
    public static String ATTEND="ATTEND";




    public AttendTable(Object[][]data,Object[]colNames,Class[] classNames)
    {
        emptyCB=new JComboBox<>();
        emptyCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ABSENT,NOT_CHECKED,ATTEND }));

        AttendTableModel attendTableModel=new AttendTableModel(data,colNames,classNames);

        tableModel=attendTableModel;
        setModel(tableModel);
        this.classNames=classNames;
        //set up cell editor base on column
        for (int i=0;i<classNames.length;i++)
        {
            if(classNames[i]!=Object.class&&getColumnModel().getColumnCount()>0)
            {
                getColumnModel().getColumn(i).setCellEditor(new DefaultCellEditor(emptyCB));
                getColumnModel().getColumn(i).setCellRenderer(new CheckInRenderer());
            }
        }
        System.out.println(tableModel.toString());
    }

    public AttendTableModel getModel() {
        return tableModel;
    }

    public void setTableModel(AttendTableModel tableModel) {
        this.tableModel = tableModel;
    }

    public Class[] getClassNames() {
        return classNames;
    }

    public void setClassNames(Class[] classNames) {
        this.classNames = classNames;
        tableModel.setColumnClasses(classNames);

    }

}
