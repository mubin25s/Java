package Design_Pattern.Practice_Mid.Factory_Pattern.Notification;

public class Notification {
    public static void main(String[] args) {
        notification n = NotificationFactory.getNotification("Email");
        n.send();
    }
}
