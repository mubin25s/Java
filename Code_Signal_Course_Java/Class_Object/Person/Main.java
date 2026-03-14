package Code_Signal_Course_Java.Class_Object.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.display();

        Person person2 = new Person("Alice", 30);
        person2.display();

        Person person3 = new Person(person2);
        person3.display();
    }
}