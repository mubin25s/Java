package Design_Pattern.Practice_Mid.Prototype.EmployeeProto;

import Design_Pattern.Practice_problems.OOP_Problems.Level3Solutions.Level3Solutions;
import Design_Pattern.Practice_problems.OOP_Problems.Level3Solutions.Manager;

public class EmployeeProto {
    public static void main(String[] args) {
        Developer developer = new Developer("John", "Developer", "Java");
        ManagerEmployee manager = new ManagerEmployee("Jane", "Manager", "Project A");

        Employee developer2 = developer.clone();
        ManagerEmployee manager2 = manager.clone();

        System.out.println(developer);
        System.out.println(manager);
        System.out.println(developer2);
        System.out.println(manager2);
    }
}
