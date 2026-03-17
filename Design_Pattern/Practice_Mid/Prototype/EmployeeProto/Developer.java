package Design_Pattern.Practice_Mid.Prototype.EmployeeProto;
import Simple_Problems.Name;

public class Developer implements Employee {
    private String name;
    private String role;
    private String code;

    public Developer(String name, String role, String code) {
        this.name = name;
        this.role = role;
        this.code = code;
    }

    @Override
    public Employee clone() {
        return new Developer(name, role, code);
    }

    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void setCode(String code) { this.code = code; }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Code: " + code);
    }

    @Override
    public String toString() {
        return "Developer{name='" + name + "', role='" + role + "', code='" + code + "'}";
    }
}
