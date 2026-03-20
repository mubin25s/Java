package Code_Signal_Course_Java.Creational_Design_Patterns.Singleton.SessionManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Getting first instance...");
        SessionManager session1 = SessionManager.getInstance();

        System.out.println("Getting second instance...");
        SessionManager session2 = SessionManager.getInstance();

        System.out.println("Same instance? " + (session1 == session2));
    }
}