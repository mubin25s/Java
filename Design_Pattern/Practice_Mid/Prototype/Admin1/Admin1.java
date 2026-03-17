package Design_Pattern.Practice_Mid.Prototype.Admin1;

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
