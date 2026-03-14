package Code_Signal_Course_Java.Encapculation.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        person.setName("Bob");
        person.setAge(25);

        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
