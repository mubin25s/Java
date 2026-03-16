package Code_Signal_Course_Java.Inheritance.Employee;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        Employee employee = new Employee("Bob", 40, "E123", "Engineering");
        Manager manager = new Manager("Charlie", 50, "M456", "HR", 10);

        manager.displayManagerDetails();
    }
}