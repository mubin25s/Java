package Code_Signal_Course_Java.Applying_Design_Patterns.SmartHome.Observer;
import java.util.ArrayList;
import java.util.List;

public class SecurityCamera {
    private List<SecurityObserver> observers = new ArrayList<>();
    public void addObserver(SecurityObserver o) { observers.add(o); }
    public void detectMotion() {
        System.out.println("Motion detected!");
        notifyObservers("ALARM: Motion detected in Backyard!");
    }
    private void notifyObservers(String msg) {
        for (SecurityObserver o : observers) { o.onEvent(msg); }
    }
}
