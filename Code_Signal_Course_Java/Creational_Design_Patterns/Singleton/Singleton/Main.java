package Code_Signal_Course_Java.Creational_Design_Patterns.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Both references point to the same Singleton instance.");
        } else {
            System.out.println("The references point to different instances.");
        }
    }
}