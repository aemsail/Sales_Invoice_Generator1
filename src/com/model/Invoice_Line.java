package com.model;

public class Invoice_Line {
    private int itemNum;
    String itemName;
    int itemCount;
    double price;
    InvoiceH invoiceH;



    public Invoice_Line(int itemNum,String name, int count, double price, InvoiceH invoiceH) {

        this.itemNum = itemNum;
        this.itemName = name;
        this.itemCount = count;
        this.price = price;
        this.invoiceH = invoiceH;
    }

    public double getTotalPrice(){
        return itemCount * price;
    }


    public int getIteNum() {
        return itemNum;
    }

    public void setItemNum(int itemnum) {
        this.itemNum = itemnum;
    }

    public String getName() {
        return itemName;
    }

    public void setName(String name) {
        this.itemName = name;
    }

    public int getCount() {
        return itemCount;
    }

    public void setCount(int count) {
        this.itemCount = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InvoiceH getInvoiceH() {
        return invoiceH;
    }

    public void setInvoiceH(InvoiceH invoiceH) {
        this.invoiceH = invoiceH;
    }



    public String getAsCSV(){
        return itemNum + "," + itemName + "," + price + "," + itemCount;
    }

    @Override
    public String toString() {
        return "Invoice_line{" +
                "name='" + itemName + '\'' +
                ", count=" + itemCount +
                ", price=" + price +
                '}';
    }
}
