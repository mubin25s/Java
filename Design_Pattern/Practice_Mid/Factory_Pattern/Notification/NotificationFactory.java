package Design_Pattern.Practice_Mid.Factory_Pattern.Notification;

public class NotificationFactory{
    public static notification getNotification(String type){
        if(type.equals("Email")){
            return new Email();
        }else if(type.equals("SMS")){
            return new SMS();
        }else{
            return null;
        }
    }
}
