package Code_Signal_Course_Java.OOP_Concepts.Inheritance.Employee;
import Object_Oriented_Programming.four_pillars.Inheritance.Inheritance;
import Simple_Problems.Name;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}