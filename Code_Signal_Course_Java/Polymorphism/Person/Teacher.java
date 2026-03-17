package Code_Signal_Course_Java.Polymorphism.Person;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am a teacher");
    }
}