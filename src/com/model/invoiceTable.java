package com.model;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class invoiceTable extends AbstractTableModel {
    private ArrayList<InvoiceH> invT;
    private String[] col = {"No." , "Date" , "Customer" , "Total"};

    public invoiceTable(ArrayList<InvoiceH> inv) {
        this.invT = inv;
    }




    @Override
    public int getRowCount() {
        return invT.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columName) {
        switch (columName) {
            case 0: return "No.";
            case 1: return "Date";
            case 2: return "Customer";
            case 3: return "Total";
            default : return "";

        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceH invo= invT.get(rowIndex);
        switch (columnIndex) {
            case 0: return invo.getNum();
            case 1: return invo.getDate();
            case 2: return invo.getName();
            case 3: return invo.getTotalInvoicePrice();
            default : return "";

        }
    }
}

