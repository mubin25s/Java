package Code_Signal_Course_Java.Creational_Design_Patterns.Singleton.Singleton;

public class Singleton {

    private Singleton() { }

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}