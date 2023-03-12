package Leetcode;

// 2.4  Ex: The Customer and Invoice classes (https://www3.ntu.edu.sg/home/ehchua/programming/java/j3f_oopexercises.html)
 
public class Customer {
    private int id;
    private String name;
    private int discount; // Disount in percent

    public Customer(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return id;
    }

    public String getName(){
        return name;
    }

    public int getDiscount(){
        return discount;
    }
    
    public void setDiscount(int discount){
        this.discount = discount;

    }

    public String toString(){
        return  "Customer[ID: " + id + ", Name: " + name + " Discount: " + discount;
    }
}