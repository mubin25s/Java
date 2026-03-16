package Code_Signal_Course_Java.Inheritance.Employee;

public class Employee extends Person {
    private String employeeId;
    private String department;

    public Employee(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    public void displayEmployeeDetails() {
        display();
        System.out.println("Employee ID: " + employeeId + ", Department: " + department);
    }
}