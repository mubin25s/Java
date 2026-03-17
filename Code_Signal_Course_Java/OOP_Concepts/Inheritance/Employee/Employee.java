package Code_Signal_Course_Java.OOP_Concepts.Inheritance.Employee;

import Design_Pattern.Practice_problems.OOP_Problems.Level4Solutions.Level4Solutions;
import Design_Pattern.Practice_problems.OOP_Problems.Level4Solutions.Department;
import Object_Oriented_Programming.four_pillars.Inheritance.Inheritance;

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