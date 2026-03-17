package Design_Pattern.Practice_Mid.Prototype.Admin2;

public class SuperAdmin implements Admin {
    private String name;
    private String role;
    private String permissions;

    public SuperAdmin(String name, String role, String permissions) {
        this.name = name;
        this.role = role;
        this.permissions = permissions;
    }

    @Override
    public Admin clone() {
        return new SuperAdmin(name, role, permissions);
    }

    @Override
    public String toString() {
        return "SuperAdmin [name=" + name + ", role=" + role + ", permissions=" + permissions + "]";
    }
}
