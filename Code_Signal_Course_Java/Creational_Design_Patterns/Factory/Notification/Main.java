package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.Notification;

public class Main {
    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.getNotification(NotificationFactory.NotificationType.SMS);
        smsNotification.send();

        Notification emailNotification = NotificationFactory.getNotification(NotificationFactory.NotificationType.EMAIL);
        emailNotification.send();

        Notification unsupportedNotification = NotificationFactory.getNotification(null);
        unsupportedNotification.send();
    }
}
