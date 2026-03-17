package Code_Signal_Course_Java.OOP_Concepts.Inheritance.Employee;
import Object_Oriented_Programming.four_pillars.Inheritance.Inheritance;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, String employeeId, String department, int teamSize) {
        super(name, age, employeeId, department);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Team Size: " + teamSize);
    }
}