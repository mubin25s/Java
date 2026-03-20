package Code_Signal_Course_Java.Creational_Design_Patterns.Singleton.SessionManager;

public class SessionManager {

    private SessionManager() {
        System.out.println("SessionManager constructor called — only once per JVM!");
    }

    private static class SessionManagerHelper {
        private static final SessionManager INSTANCE = new SessionManager();
    }

    public static SessionManager getInstance() {
        return SessionManagerHelper.INSTANCE;
    }
}