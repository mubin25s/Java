package Code_Signal_Course_Java.OOP_Concepts.Inheritance.Student;
import Object_Oriented_Programming.four_pillars.Inheritance.Inheritance;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob", 25, "Computer Science");
        student.display();
        student.displayMajor();
    }
}