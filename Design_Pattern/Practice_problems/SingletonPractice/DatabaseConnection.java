package Design_Pattern.Practice_problems.SingletonPractice;

public class DatabaseConnection {
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
