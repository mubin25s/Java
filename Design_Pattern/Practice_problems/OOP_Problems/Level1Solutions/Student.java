package Design_Pattern.Practice_problems.OOP_Problems.Level1Solutions;
import Simple_Problems.Name;

public class Student {
    String name;
    int id;
    double cgpa;

    // Method to display student information
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }
}
