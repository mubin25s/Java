package Design_Pattern.Practice_problems.OOP_Problems.Level4Solutions;


import java.io.*;
import java.util.*;

public class MarksValidator {
    void validate(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100. Provided: " + marks);
        }
        System.out.println("Marks are valid: " + marks);
    }
}
