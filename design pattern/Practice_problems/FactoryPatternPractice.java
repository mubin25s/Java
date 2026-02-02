
/**
 * DESIGN PATTERN: FACTORY METHOD
 * 
 * Goal: Define an interface for creating an object, but let subclasses decide 
 * which class to instantiate.
 * 
 * Practice Problem:
 * Create a simple notification system where a factory creates different types 
 * of notifications (Email, SMS, Push).
 */

interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification...");
    }
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification...");
    }
}

class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a Push notification...");
    }
}

// The Factory Class
class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }
        switch (channel.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel " + channel);
        }
    }
}

public class FactoryPatternPractice {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        // Let the factory handle object creation
        Notification n1 = factory.createNotification("EMAIL");
        n1.notifyUser();

        Notification n2 = factory.createNotification("PUSH");
        n2.notifyUser();

        Notification n3 = factory.createNotification("SMS");
        n3.notifyUser();
    }
}
