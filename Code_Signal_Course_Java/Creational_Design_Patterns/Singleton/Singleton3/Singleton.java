package Code_Signal_Course_Java.Creational_Design_Patterns.Singleton.Singleton3;

public class Singleton {

    // private: no one can call new Singleton() from outside
    private Singleton() { }

    // static: loaded by JVM once, not tied to any instance
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    // static: callable without creating an instance first
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }
}