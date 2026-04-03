package Code_Signal_Course_Java.Applying_Design_Patterns.SmartHome.Observer;

public class CentralMonitoringService implements SecurityObserver {
    @Override public void onEvent(String msg) {
        System.out.println("Central Service received event: " + msg);
        System.out.println("Alerting Authorities...");
    }
}
