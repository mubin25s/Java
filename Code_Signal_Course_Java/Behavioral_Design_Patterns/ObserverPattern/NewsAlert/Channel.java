package Code_Signal_Course_Java.Behavioral_Design_Patterns.ObserverPattern.NewsAlert;

public class Channel implements Observer {
    private String name;
    public Channel(String name) { this.name = name; }
    @Override public void update(String news) { System.out.println(name + " received news: " + news); }
}
