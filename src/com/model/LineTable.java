package com.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class LineTable extends AbstractTableModel {

    private ArrayList<Invoice_Line> lines ;
    private String[] col = {"No." , "Item Name " , "Item Price " , "Count" , "Item Total "};

    public LineTable(ArrayList<Invoice_Line> lin) {
        this.lines = lin;
    }


    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return col.length;
    }

    @Override
    public String getColumnName(int column) {
        return col[column];
    }
    public ArrayList<Invoice_Line> getLin() {
        return lines;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice_Line line = lines.get(rowIndex);
        switch (columnIndex) {
            case 0: return line.getInvoiceH().getNum();
            case 1: return line.getName();
            case 2: return line.getPrice();
            case 3: return line.getCount();
            case 4: return line.getTotalPrice();
            default : return "";

        }
    }
}
