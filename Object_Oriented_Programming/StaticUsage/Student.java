package Object_Oriented_Programming.StaticUsage;
import Simple_Problems.Name;

public class Student {
    String name; // Instance variable
    static String college = "University of Tech"; // Static variable (shared)

    Student(String name) {
        this.name = name;
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
        // name = "XYZ"; // COMPILE ERROR: Static methods cannot access instance variables
    }

    void display() {
        System.out.println("Name: " + name + ", College: " + college);
    }
}
