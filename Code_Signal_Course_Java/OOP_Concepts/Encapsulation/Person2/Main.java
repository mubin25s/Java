package Code_Signal_Course_Java.OOP_Concepts.Encapsulation.Person2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        person.setName("Bob");
        person.setAge(25);

        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}