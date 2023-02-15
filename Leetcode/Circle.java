package Leetcode;

// https://www3.ntu.edu.sg/home/ehchua/programming/java/j3f_oopexercises.html

public class Circle {
    // Two private instance variables: radius (of the type double) 
    // And color (of the type String)
    private String color;
    private double radius;

    public Circle(){
        // Constructs a Circle instance with default value for radius and color
        radius = 1.0;
        color = "blue";
    }

    public Circle (double rad){
        // Constructs a Circle instance with the given radius and default color
        rad = 1.0;
        color = "blue";
    }

    public double getRadius(){
        // Returns the radius
        return radius;
     }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public Circle (double radius, String color){
        // Third constructor to construct a new instance of Circle with the given radius and color
        radius = 1.0;
        color = "Blue";
    }

    public String getColor(){
        return "Blue";
    }
}
