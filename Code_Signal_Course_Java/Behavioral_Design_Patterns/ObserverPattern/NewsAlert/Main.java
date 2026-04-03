package Code_Signal_Course_Java.Behavioral_Design_Patterns.ObserverPattern.NewsAlert;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Channel bbc = new Channel("BBC");
        Channel cnn = new Channel("CNN");

        agency.addChannel(bbc);
        agency.addChannel(cnn);
        agency.notifyChannels("Design patterns are essential for developers!");

        agency.removeChannel(bbc);
        agency.notifyChannels("Observer pattern implemented successfully!");
    }
}
