package Leetcode;

// https://www3.ntu.edu.sg/home/ehchua/programming/java/j3f_oopexercises.html 

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public char getGender(){
        return gender;
    }

    public String toString(){
        return "Author[Name: " + name + " Email: " + email + "]";
    }
}
