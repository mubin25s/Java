package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.Notification;

public class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending Email Notification.");
    }
}
