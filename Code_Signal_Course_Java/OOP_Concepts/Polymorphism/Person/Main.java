package Code_Signal_Course_Java.OOP_Concepts.Polymorphism.Person;
import Object_Oriented_Programming.four_pillars.Polymorphism.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Student("Alice", 30);
        Person person2 = new Teacher("Bob", 25);

        person1.introduce();
        person2.introduce();
    }
}