package Code_Signal_Course_Java.Applying_Design_Patterns.SmartHome.CentralizedHub;

public class CentralHub {
    private static CentralHub instance;
    private String hubName;

    private CentralHub() {
        this.hubName = "SmartHome Central Hub v1.0";
        System.out.println("Central Hub initialized.");
    }

    public static synchronized CentralHub getInstance() {
        if (instance == null) {
            instance = new CentralHub();
        }
        return instance;
    }

    public void showStatus() {
        System.out.println("Hub: " + hubName + " - Status: All systems operational.");
    }
}
