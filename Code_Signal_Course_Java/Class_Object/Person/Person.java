package Code_Signal_Course_Java.Class_Object.Person;

public class Person {
    private String name;
    private int age;

    // No-argument constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor that initializes both data members
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}