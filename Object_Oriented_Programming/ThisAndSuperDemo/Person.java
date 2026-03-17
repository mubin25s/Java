package Object_Oriented_Programming.ThisAndSuperDemo;

public class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called for: " + name);
    }

    void greet() {
        System.out.println("Hello, I am a person.");
    }
}
