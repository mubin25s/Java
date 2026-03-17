package Design_Pattern.Practice_problems.SingletonPractice;

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
