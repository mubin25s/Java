package Design_Pattern.Practice_Mid.Prototype.Admin2;

public class Moderator implements Admin {
    private String name;
    private String role;
    private String section;

    public Moderator(String name, String role, String section) {
        this.name = name;
        this.role = role;
        this.section = section;
    }

    @Override
    public Admin clone() {
        return new Moderator(name, role, section);
    }

    @Override
    public String toString() {
        return "Moderator [name=" + name + ", role=" + role + ", section=" + section + "]";
    }
}
