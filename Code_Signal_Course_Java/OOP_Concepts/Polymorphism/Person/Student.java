package Code_Signal_Course_Java.OOP_Concepts.Polymorphism.Person;
import Object_Oriented_Programming.four_pillars.Polymorphism.Polymorphism;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am a student");
    }
}