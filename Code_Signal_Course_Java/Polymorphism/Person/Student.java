package Code_Signal_Course_Java.Polymorphism.Person;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am a student");
    }
}