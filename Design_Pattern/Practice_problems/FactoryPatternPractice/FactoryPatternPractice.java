package Design_Pattern.Practice_problems.FactoryPatternPractice;
import Design_Pattern.Practice_Mid.Factory_Pattern.Notification.SMS;

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
