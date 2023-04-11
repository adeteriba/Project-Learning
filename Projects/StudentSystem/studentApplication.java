package Projects.studentSystem;
 import java.util.*;

public class studentApplication {
    public static void main(String[] args){
        // Ask how many new students we want to add
        System.out.println("Enter number of students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        Student [] students = new Student[str];

        for(int i =0; i<str; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payFees();
            System.out.println(students[i].showInfo());
        }
    }
}
