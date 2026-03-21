package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.Notification;

public class NotificationFactory {
    public enum NotificationType {
        SMS, EMAIL
    }

    public static Notification getNotification(NotificationType type) {
        if (type == null) {
            return new NullNotification();
        }
        switch (type) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            default:
                return new NullNotification();
        }
    }
}
