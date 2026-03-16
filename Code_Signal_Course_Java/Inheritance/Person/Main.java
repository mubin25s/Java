package Code_Signal_Course_Java.Inheritance.Person;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob", 25, "Computer Science");
        student.display();
        student.displayMajor();
    }
}