package Design_Pattern.Practice_problems.OOP_Problems.Level4Solutions;


import java.io.*;
import java.util.*;

public class ExceptionDemo {
    void handleArithmetic() {
        try {
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    void handleIO() {
        try (BufferedReader br = new BufferedReader(new FileReader("nonexistent.txt"))) {
            br.readLine();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    void handleNumberFormat(String s) {
        try {
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}
