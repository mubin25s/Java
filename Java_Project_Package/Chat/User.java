package Chat;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        System.out.println(name + ": " + message);
    }
}
