package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Database_Connection;

import java.time.LocalDateTime;

public class DatabaseConnection {

    private DatabaseConnection() {}

    private static class SingletonHelper {
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }

    public static DatabaseConnection getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void connect() {
        System.out.println("Connected to the database.");
        logConnection();
    }

    private void logConnection() {
        System.out.println("Database connection established at " + LocalDateTime.now());
    }
}