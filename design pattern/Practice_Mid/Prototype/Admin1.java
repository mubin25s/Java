// Prototype interface
interface Admin {
    Admin clone();
}

// Concrete class
class UserProfile implements Admin {
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

// Usage
public class Admin1 {
    public static void main(String[] args) {
        UserProfile adminTemplate = new UserProfile("Template", "ADMIN",
            java.util.List.of("READ", "WRITE", "DELETE"));

        // Clone and customize — no expensive setup repeated
        UserProfile alice = adminTemplate.clone();
        alice.setName("Alice");

        UserProfile bob = adminTemplate.clone();
        bob.setName("Bob");

        System.out.println(alice); // UserProfile{name='Alice', role='ADMIN', ...}
        System.out.println(bob);   // UserProfile{name='Bob',  role='ADMIN', ...}
    }
}