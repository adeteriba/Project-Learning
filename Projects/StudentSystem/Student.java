package Projects.StudentSystem;

import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private int universityYear;
    private String studentID;
    public String course;
    private int balance = 0;
    private int costOfCourse = 3000;
    private static int ID = 1000;

    
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the students first name: ");
        this.firstName = sc.nextLine();

        System.out.print("Enter the students last name: ");
        this.lastName = sc.nextLine();

        System.out.print("Enter the students year in college: ");
        this.universityYear = sc.nextInt();
        generateStudentID();
    }

    // Generate a studentID
    public void generateStudentID(){
        this.studentID = Integer.toString(universityYear) + Integer.toString(ID);
    }

    //Enroll in a course
    public void enroll(){
        //Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        System.out.println("How many course do you want to enrl to: ");
        for(int i = 0;i <3;i++) {
            System.out.print("Enter a course to enroll (Press Q it quit):  ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if(!str.equals("Q")){
                course = str + "\n";
                balance = balance + costOfCourse;
            } else {
                break;
            }
            //System.out.println("Enrolled in: " + course);
            System.out.println("University Balance: " + balance);
        }
    }

    // View balanace
    public String viewBalance(){
        return  "Your balance is: " + balance;
    }

    // Pay fees
    public void payFees(){
        viewBalance();
        System.out.print("Enter how much you would like to pay: ");
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        balance = balance - str;
        System.out.println("Thanks you for your payment. Remaining Balance: " + balance);
        viewBalance();
    }

    // Show status
    public String showInfo(){
        return "name: " + firstName + " " + lastName + " " + "Student ID: " + studentID + 
                "\nCourses Enrolled: " + course + "\nBalance: $:" + balance;
    }
}
