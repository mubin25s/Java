package Code_Signal_Course_Java.Structural_Design_Patterns.CompositePattern.Employee;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "John Doe", "Pro Developer");
        Developer dev2 = new Developer(101, "Jane Smith", "Entry Developer");
        Manager man1 = new Manager(200, "Bob Brown", "Senior Manager");

        CompanyDirectory directory = new CompanyDirectory("Engineering Department");
        directory.addEmployee(dev1);
        directory.addEmployee(dev2);
        directory.addEmployee(man1);

        directory.showEmployeeDetails();
    }
}