package Object_Oriented_Programming.ConstructorConcept;

public class Book {
    String title;
    String author;

    // Default Constructor
    Book() {
        System.out.println("A new book object is being created...");
    }

    // Parameterized Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayDetails() {
        System.out.println("Book: " + title + " by " + author);
    }
}
