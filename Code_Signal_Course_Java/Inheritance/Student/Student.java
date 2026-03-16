package Code_Signal_Course_Java.Inheritance.Student;

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