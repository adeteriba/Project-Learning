package Leetcode;

public class TestInvoiceItem {
    public static void main(String [] args){
        InvoiceItem item = new InvoiceItem();
        System.out.println(item);

        item.setQty(999);
        item.setUnitPrice(0.99);
        System.out.println(item.toString());
        System.out.println("ID is: " + item.getID());
        System.out.println("Desc is: " + item.getDesc());
        System.out.println("Qty is: " + item.getQty());
        System.out.println("Unit price is: " + item.getUnitPrice());
        

        System.out.println("The total is: " + item.getTotal());




    }
}
