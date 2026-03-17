package Design_Pattern.Practice_Mid.Singleton.SystemLogger;
import Design_Pattern.Practice_Mid.Singleton.Singleton;

public class SystemLogger {
    // private object
    private static SystemLogger instance;

    // private constructor
    private SystemLogger() {
        System.out.println("Login successful");
    }

    // public method for creating OBJECT
    public static SystemLogger methodLogger() {
        if (instance == null) {
            instance = new SystemLogger();
        }
        return instance;
    }

    // method normal
    public void log(String msg) {
        System.out.println(msg);
    }
}
