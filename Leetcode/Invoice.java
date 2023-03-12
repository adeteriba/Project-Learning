package Leetcode;

// 2.4  Ex: The Customer and Invoice classes (https://www3.ntu.edu.sg/home/ehchua/programming/java/j3f_oopexercises.html)
 
public class Invoice {
    private int id;
    private Customer cust;
    private double amount; // Disount in percent

    public Invoice(int id, Customer cust, double d){
        this.id = id;
        this.cust = cust;
        this.amount = d;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer(){
        return cust;
    }

    public void setCustomer(Customer cust){
        this.cust = cust;
    }

    public double getAmount(){
        return amount;
    }
    
    public void setDiscount(int amount){
        this.amount = amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public int getCustomerID(){
        return cust.getID();
    }

    public String getCustomerName(){
        return cust.getName();
    }

    public int getCustomerDiscount(){
        return cust.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return amount - cust.getDiscount();
    }


    public String toString(){
        return  "Invoice[ID: " + id + ", Customer: " + cust;
    }
}