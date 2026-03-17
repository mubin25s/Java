package Design_Pattern.Practice_Mid.Prototype.Admin1;

public class UserProfile implements Admin {
    private String name;
    private String role;
    private java.util.List<String> permissions;

    public UserProfile(String name, String role, java.util.List<String> permissions) {
        this.name = name;
        this.role = role;
        this.permissions = new java.util.ArrayList<>(permissions); // deep copy
    }

    @Override
    public UserProfile clone() {
        return new UserProfile(this.name, this.role, this.permissions);
    }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "UserProfile{name='" + name + "', role='" + role + "', permissions=" + permissions + "}";
    }
}
