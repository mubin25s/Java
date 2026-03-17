package Design_Pattern.Practice_problems.OOP_Problems.Level3Solutions;

public class Manager extends EmployeeLevel3 {
    String department = "Engineering";

    void displayInfo() {
        System.out.println("Manager: " + name + ", ID: " + empId + ", Dept: " + department);
    }
}
