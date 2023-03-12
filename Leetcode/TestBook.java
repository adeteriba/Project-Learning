package Leetcode;

public class TestBook {
    public static void main(String [] args){
        //Test Author class
        Author auth = new Author("Ade Teriba", "adekunleteriba@hotmail.com", 'm');
        System.out.println(auth);

        // Declare and allocate an array of Authors
        Author[] author = new Author[2];
        author[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        author[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book var = new Book ("Ben", author, 19.95,99);
        System.out.println(var);
        
        var.setPrice(29.95);
        var.setQty(28);
        System.out.println("name is: " + var.getName());
        System.out.println("price is: " + var.getPrice());
        System.out.println("qty is: " + var.getQty());
        System.out.println("Author is: " + var.getAuthor());  // Author's toString()
        // System.out.println("Author's name is: " + var.getAuthor().getName());
        // System.out.println("Author's email is: " + var.getAuthor().getEmail());

        // Book anotherBook = new Book("More Java", 
        // new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        // System.out.println(anotherBook);
    }

}
