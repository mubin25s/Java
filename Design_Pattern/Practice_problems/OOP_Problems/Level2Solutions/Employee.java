package Design_Pattern.Practice_problems.OOP_Problems.Level2Solutions;
import Simple_Problems.Name;

public class Employee {
    String name;
    int id;
    double salary;

    // Default Constructor
    Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0.0;
    }

    // Parameterized Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
