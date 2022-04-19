package UI.util;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

public class AttendTableModel extends DefaultTableModel {
    private Class<?>[] columnClasses={};


    private ArrayList editableRows=new ArrayList();

    public AttendTableModel(Class<?>[] columnClasses) {
        this.columnClasses=columnClasses;
    }

    public AttendTableModel(int rowCount, int columnCount,Class<?>[] columnClasses) {
        super(rowCount, columnCount);
    }

    public AttendTableModel(Vector<?> columnNames, int rowCount,Class<?>[] columnClasses) {
        super(columnNames, rowCount);
    }

    public AttendTableModel(Object[] columnNames, int rowCount,Class<?>[] columnClasses) {
        super(columnNames, rowCount);
    }

    public AttendTableModel(Vector<? extends Vector> data, Vector<?> columnNames,Class<?>[] columnClasses) {
        super(data, columnNames);
        this.columnClasses=columnClasses;
    }

    public AttendTableModel(Object[][] data, Object[] columnNames,Class<?>[] columnClasses) {
        super(data, columnNames);
        this.columnClasses=columnClasses;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClasses[columnIndex];
    }

    public void setColumnClasses(Class<?>[] columnClasses) {
        this.columnClasses = columnClasses;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return isRowEditable(row);
    }

    @Override
    public int getColumnCount() {
        return super.getColumnCount();
    }

    @Override
    public int getRowCount() {
        return super.getRowCount();
    }

    @Override
    public Object getValueAt(int row, int column) {
        return super.getValueAt(row, column);
    }

    @Override
    public void removeRow(int row) {
        super.removeRow(row);
    }

    public void removeAllRow()
    {
        for (int i=getRowCount()-1;i>=0;i--)
        {
            removeRow(i);
        }
    }

    public boolean isRowEditable(int row)
    {
        return editableRows.contains(row);
    }

    public ArrayList getEditableRows() {
        return editableRows;
    }

    public void setEditableRows(ArrayList editableRows) {
        this.editableRows = editableRows;
    }

    public void addEditableRow(int row)
    {
        if(editableRows.contains(row)==false)
            editableRows.add(row);
    }
    public ArrayList getColumnData(int column)
    {
        ArrayList ret=new ArrayList();

        for (int i=0;i<getRowCount();i++)
            ret.add(getValueAt(i,column));
        return ret;

    }

    public Object[] getRowData(int row)
    {
        Object[] ret=new Object[getColumnCount()];
        for (int i=0;i<getColumnCount();i++)
        {
            String value=String.valueOf(getValueAt(row,i));
            ret[i]=value;
            if(value.equals(AttendTable.ATTEND))
            {
                ret[i]=2;
            }
            if(value.equals(AttendTable.NOT_CHECKED))
            {
                ret[i]=1;
            }
            if(value.equals(AttendTable.ABSENT))
            {
                ret[i]=0;
            }
        }
        return ret;
    }


    @Override
    public void addRow(Object[] rowData) {
        //check student id is same
        ArrayList student=getColumnData(0);

        if(student.contains(rowData[0])==false)
            super.addRow(rowData);
    }
}
