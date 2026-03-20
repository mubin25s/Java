package Design_Pattern.Practice_Mid.Factory_Pattern.Notification;

public interface Notification {

    void send();
} Notification {
    public static void main(String[] args) {
        Notification n = NotificationFactory.getNotification("Email");
        n.send();
    }
}
