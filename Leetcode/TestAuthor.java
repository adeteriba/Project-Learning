package Leetcode;

public class TestAuthor {
    public static void main (String [] args){
        Author author = new Author("Ade Teriba", "adekunleteriba@hotmail.com", 'm');
        System.out.println(author);        
        author.setEmail("adekunleteriba@hotmail.com");
        System.out.println("Name: " + author.getName());     
        System.out.println("Email: " + author.getEmail());  
        System.out.println("Gender: " + author.getGender());
    }
}
