package com.model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceH {

    private  int customerNum;
    private Date date;
    private String customerName;

    private ArrayList<Invoice_Line> lines;

    public InvoiceH(int i_Num, String i_Date, String i_CustomerName) {
    }

    public InvoiceH(int num, Date date, String name) {
        this.customerNum = num;
        this.date = date;
        this.customerName = name;
    }
    public double getTotalInvoicePrice(){
        double total = 0.0;

        for (Invoice_Line line : lines){
            total += line.getTotalPrice();
        }

        return total;
    }

    public ArrayList<Invoice_Line> getLines() {

        if (lines == null)
        {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public int getNum() {
        return customerNum;
    }

    public void setNum(int num) {
        this.customerNum = num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return customerName;
    }

    public void setName(String name) {
        this.customerName = name;
    }

    @Override
    public String toString() {
        return "InvoiceH{" +
                "customerNum=" + customerNum +
                ", date=" + date +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public String getAsCSV(){
        return customerNum + "," + date + "," + customerName;
    }

}
