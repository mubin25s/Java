package Object_Oriented_Programming.ThisAndSuperDemo;

public class Employee extends Person {
    double salary;

    // Constructor Chaining
    Employee(String name) {
        this(name, 0.0); // Calls the other constructor of Employee
    }

    Employee(String name, double salary) {
        super(name); // Calls parent (Person) constructor
        this.salary = salary;
        System.out.println("Employee constructor called with salary: " + salary);
    }

    @Override
    void greet() {
        super.greet(); // Calls parent's greet()
        System.out.println("And I am also an employee with salary " + salary);
    }
}
