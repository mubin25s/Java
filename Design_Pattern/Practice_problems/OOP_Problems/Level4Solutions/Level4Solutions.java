package Design_Pattern.Practice_problems.OOP_Problems.Level4Solutions;


import java.io.*;
import java.util.*;

public class Level4Solutions {
    public static String readFirstLine(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Level 4: Interfaces ---");
        Duck d = new Duck();
        d.fly();
        d.swim();

        System.out.println("\n--- Level 4: Composition ---");
        Library lib = new Library();
        lib.addBook(new Book("Java Programming"));
        lib.addBook(new Book("Design Patterns"));
        lib.showBooks();

        System.out.println("\n--- Level 4: Exception Handling ---");
        ExceptionDemo demo = new ExceptionDemo();
        demo.handleArithmetic();
        demo.handleNumberFormat("abc");

        System.out.println("\n--- Level 4: Throw ---");
        MarksValidator mv = new MarksValidator();
        try {
            mv.validate(150);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Level 4: Throws ---");
        try {
            readFirstLine("test.txt");
        } catch (IOException e) {
            System.out.println("Handled throws from main: " + e.getMessage());
        }
    }
}
