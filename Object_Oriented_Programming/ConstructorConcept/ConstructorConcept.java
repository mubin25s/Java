package Object_Oriented_Programming.ConstructorConcept;

public class ConstructorConcept {
    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();
        b1.title = "Unknown";
        b1.author = "Unknown";

        // Using parameterized constructor
        Book b2 = new Book("Atomic Habits", "James Clear");

        b1.displayDetails();
        b2.displayDetails();
    }
}
