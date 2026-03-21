package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.Notification;

public class NullNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Unsupported Notification Type.");
    }
}
