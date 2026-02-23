interface notification{
    void send();
}

class Email implements notification{
    public void send(){
        System.out.println("Email");
    }
}

class SMS implements notification{
    public void send(){
        System.out.println("SMS");
    }
}

class NotificationFactory{
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

public class Notification {
    public static void main(String[] args) {
        notification n = NotificationFactory.getNotification("Email");
        n.send();
    }
}