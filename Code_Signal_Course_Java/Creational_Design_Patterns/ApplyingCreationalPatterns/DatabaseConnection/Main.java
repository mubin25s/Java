package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection instance1 = DatabaseConnection.getInstance();
        DatabaseConnection instance2 = DatabaseConnection.getInstance();

        // Verify both instances are the same object
        System.out.println("Same instance: " + (instance1 == instance2));

        // Test the connect method
        instance1.connect();
    }
}