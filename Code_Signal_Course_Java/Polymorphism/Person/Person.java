package Code_Signal_Course_Java.Polymorphism.Person;

public class Person {
    private String name;
    @SuppressWarnings("unused")
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, I am a person");
    }
}