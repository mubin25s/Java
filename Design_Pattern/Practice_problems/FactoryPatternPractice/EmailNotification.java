package Design_Pattern.Practice_problems.FactoryPatternPractice;
import Design_Pattern.Practice_Mid.Factory_Pattern.Notification.Email;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification...");
    }
}
