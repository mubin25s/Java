package Code_Signal_Course_Java.Structural_Design_Patterns.CompositePattern.Employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {
    private String directoryName;
    private List<Employee> employeeList;

    public CompanyDirectory(String directoryName) {
        this.directoryName = directoryName;
        this.employeeList = new ArrayList<>();
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Company Directory: " + directoryName);
        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}