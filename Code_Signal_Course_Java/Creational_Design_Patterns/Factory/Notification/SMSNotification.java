package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.Notification;

public class SMSNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending SMS Notification.");
    }
}
