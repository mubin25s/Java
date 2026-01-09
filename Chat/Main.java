package Chat;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Alice");
        User u2 = new User("Bob");

        u1.sendMessage("Hello Bob!");
        u2.sendMessage("Hi Alice!");
    }
}
