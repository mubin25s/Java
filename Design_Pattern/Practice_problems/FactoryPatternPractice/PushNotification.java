package Design_Pattern.Practice_problems.FactoryPatternPractice;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a Push notification...");
    }
}
