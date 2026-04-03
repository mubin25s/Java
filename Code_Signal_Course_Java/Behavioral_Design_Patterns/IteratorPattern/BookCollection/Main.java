package Code_Signal_Course_Java.Behavioral_Design_Patterns.IteratorPattern.BookCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Book {
    private String title;
    public Book(String title) { this.title = title; }
    public String getTitle() { return title; }
}

class BookCollection implements Iterable<Book> {
    private List<Book> books = new ArrayList<>();
    public void addBook(Book book) { books.add(book); }
    @Override public Iterator<Book> iterator() { return books.iterator(); }
}

public class Main {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("Design Patterns"));
        collection.addBook(new Book("Clean Code"));
        collection.addBook(new Book("Effective Java"));

        System.out.println("Iterating through book collection:");
        for (Book book : collection) { System.out.println(book.getTitle()); }
    }
}
