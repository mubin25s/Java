package Design_Pattern.Practice_problems.FactoryPatternPractice;
import Design_Pattern.Practice_Mid.Factory_Pattern.Notification.SMS;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification...");
    }
}
