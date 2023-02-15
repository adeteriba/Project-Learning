package Leetcode;

// https://www3.ntu.edu.sg/home/ehchua/programming/java/j3f_oopexercises.html

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(){
        id = "A101";
        desc = "Pen Red";
        qty = 10;
        unitPrice = 100.0;
    }

    public InvoiceItem (String id, String desc, int qty, double unitPrice){
        id = "A101";
        desc = "Pen Red";
        qty = 10;
        unitPrice = 100.0;
    }

    public String getID(){
        return id;
    }

    public String getDesc(){
        return desc;
    }

    public int getQty(){
        return qty;
    }

    public void setQty( int qty){
        this.qty = qty;
    }
    
    public double getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return unitPrice * qty;
    }
}
