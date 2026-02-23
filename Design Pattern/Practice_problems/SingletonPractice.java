
/**
 * DESIGN PATTERN: SINGLETON
 * 
 * Goal: Ensure a class has only one instance and provide a global point of access to it.
 * 
 * Practice Problem:
 * Create a 'DatabaseConnection' class that follows the Singleton pattern.
 * This ensures that multiple parts of an application share the same database connection.
 */

class DatabaseConnection {
    // 1. Private static variable to hold the unique instance
    private static DatabaseConnection instance;

    // 2. Private constructor to prevent instantiation from outside
    private DatabaseConnection() {
        System.out.println("Connecting to the Database...");
    }

    // 3. Public static method to get the instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing Query: " + sql);
    }
}

public class SingletonPractice {
    public static void main(String[] args) {
        // DatabaseConnection db1 = new DatabaseConnection(); // COMPILE ERROR: Constructor is private

        // Get the singleton instance
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        db1.query("SELECT * FROM users");
        db2.query("SELECT * FROM products");

        // Check if both references point to the same object
        if (db1 == db2) {
            System.out.println("\nSUCCESS: Both db1 and db2 point to the SAME instance.");
        } else {
            System.out.println("\nFAILURE: db1 and db2 are different instances.");
        }
    }
}
