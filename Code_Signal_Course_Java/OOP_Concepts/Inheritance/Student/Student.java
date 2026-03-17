package Code_Signal_Course_Java.OOP_Concepts.Inheritance.Student;
import Object_Oriented_Programming.four_pillars.Inheritance.Inheritance;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public void displayMajor() {
        System.out.println("Major: " + major);
    }
}