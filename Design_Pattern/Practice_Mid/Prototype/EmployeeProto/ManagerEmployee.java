package Design_Pattern.Practice_Mid.Prototype.EmployeeProto;
import Simple_Problems.Name;

public class ManagerEmployee implements Employee {
    private String name;
    private String role;
    private String project;

    public ManagerEmployee(String name, String role, String project) {
        this.name = name;
        this.role = role;
        this.project = project;
    }

    @Override
    public ManagerEmployee clone() {
        return new ManagerEmployee(name, role, project);
    }

    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void setProject(String project) { this.project = project; }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Project: " + project);
    }

    @Override
    public String toString() {
        return "ManagerEmployee{name='" + name + "', role='" + role + "', project='" + project + "'}";
    }
}
