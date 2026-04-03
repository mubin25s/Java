package Code_Signal_Course_Java.Behavioral_Design_Patterns.ObserverPattern.NewsAlert;
import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Observer> channels = new ArrayList<>();
    public void addChannel(Observer channel) { channels.add(channel); }
    public void removeChannel(Observer channel) { channels.remove(channel); }
    public void notifyChannels(String news) {
        for (Observer channel : channels) { channel.update(news); }
    }
}
