package Design_Pattern.Practice_problems.OOP_Problems.Level4Solutions;


import java.io.*;
import java.util.*;

public class Library {
    List<Book> books = new ArrayList<>();
    void addBook(Book b) { books.add(b); }
    void showBooks() {
        for (Book b : books) System.out.println("Book: " + b.title);
    }
}
