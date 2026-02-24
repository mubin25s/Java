interface Employee {
    Employee clone();
}

class Developer implements Employee {
    private String name;
    private String role;
    private String code;

    public Developer(String name, String role, String code) {
        this.name = name;
        this.role = role;
        this.code = code;
    }

    public Employee clone() {
        return new Developer(name, role, code);
    }

    public void setname(String name) {
        this.name = name;
    }
    public void setrole(String role) {
        this.role = role;
    }
    public void setcode(String code) {
        this.code = code;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Code: " + code);
    }
}
class Manager implements Employee {
    private String name;
    private String role;
    private String project;

    public Manager(String name, String role, String project) {
        this.name = name;
        this.role = role;
        this.project = project;
    }

    public Manager clone() {
        return new Manager(name, role, project);
    }

    public void setname(String name) {
        this.name = name;
    }
    public void setrole(String role) {
        this.role = role;
    }
    public void setproject(String project) {
        this.project = project;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Project: " + project);
    }
public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("John", "Developer", "Java");
        Manager manager = new Manager("Jane", "Manager", "Project A");

        Employee developer2 = (Employee) developer.clone();
        Manager manager2 = (Manager) manager.clone();

        System.out.println(developer);
        System.out.println(manager);
        System.out.println(developer2);
        System.out.println(manager2);
    }
}

}