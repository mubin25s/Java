package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.DatabaseConnection;

public class DatabaseConnection {

    // Private constructor to prevent instantiation
    private DatabaseConnection() {}

    // Static inner helper class — loaded only when accessed, thread-safe by JVM class loading
    private static class SingletonHelper {
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }

    // Public access method
    public static DatabaseConnection getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void connect() {
        System.out.println("Database connected.");
    }
}