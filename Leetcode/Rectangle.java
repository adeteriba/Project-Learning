package Leetcode;
 
// https://www3.ntu.edu.sg/home/ehchua/programming/java/j3f_oopexercises.html 

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length, float width){
        length = 1.0f;
        width = 1.0f;
    }

    public float getLength(){
        return 1.0f;
    }

    public void setLength(float length){
        this.length = length;
    }
    
    public float getWidth(){
        return 1.0f;
    } 

    public void setWidth(float width){
        this.width  = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * width + 2 * length;
    }

    public String toString(String rect){
        return rect.toString();
    }
}
