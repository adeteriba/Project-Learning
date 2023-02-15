package Leetcode;

public class TestRectangle {
    public static void main(String [] args){
        Rectangle shape = new Rectangle(1.2f, 3.4f);
        System.out.println(shape.toString());
        Rectangle shape2 = new Rectangle();
        System.out.println(shape2);

        // Test setters and getters
        shape.setLength(5.6f);
        shape.setWidth(7.8f);
        System.out.println(shape);
        System.out.println("Length is: " + shape.getLength());
        System.out.println("Width is: " + shape.getWidth());

        // Test getArea() and getPerimeter
        System.out.println("Area is: " + shape.getArea());
        System.out.println("Perimeter is: " + shape.getPerimeter());
        


    }
    
}
