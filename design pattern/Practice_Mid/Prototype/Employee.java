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

    public String toString() {
        return "Developer [name=" + name + ", role=" + role + ", code=" + code + "]";
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

    public Employee clone() {
        return new Manager(name, role, project);
    }

    public String toString() {
        return "Manager [name=" + name + ", role=" + role + ", project=" + project + "]";
    }
}

public class Prototype {
    public static void main(String[] args) {
        Employee developer = new Developer("John", "Developer", "Java");
        Employee manager = new Manager("Jane", "Manager", "Project A");

        Employee developer2 = developer.clone();
        Employee manager2 = manager.clone();

        System.out.println(developer);
        System.out.println(manager);
        System.out.println(developer2);
        System.out.println(manager2);
    }
}