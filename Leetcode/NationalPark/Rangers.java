package Leetcode.NationalPark;

// Leetcode/NationalPark/National Park Coding.docx.pdf Exercise 1
public class Rangers {
    private String name;
    private String homePhone;
    private String workPhone;

    // Instead of using variable names such as r (for radius) and c (for color) in the methods' arguments, 
    // it is better to use variable names radius (for radius) and color (for color) and use the special keyword "this" to resolve the conflict between instance variables and methods' arguments
    
    public Rangers( String name, String homePhone, String workPhone){
        //this.numOfRangers = numOfRangers;
        this.name = name;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
    }

    public String getName(){
        return name;
    }

    public String getWorkPhone(){
        return workPhone;
    }

    public String getHomePhone(){
        return homePhone;
    }
}
