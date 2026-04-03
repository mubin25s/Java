package Code_Signal_Course_Java.Applying_Design_Patterns.SmartHome.Composite;

public class SmartLight implements DeviceComponent {
    private String location;
    public SmartLight(String loc) { this.location = loc; }
    @Override public void turnOn() { System.out.println("Light in " + location + " is ON"); }
    @Override public void turnOff() { System.out.println("Light in " + location + " is OFF"); }
}
