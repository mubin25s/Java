package Code_Signal_Course_Java.Applying_Design_Patterns.SmartHome.DeviceFactory;

public class SmartLight implements SmartDevice {
    @Override public void turnOn() { System.out.println("Smart Light is turned ON"); }
    @Override public void turnOff() { System.out.println("Smart Light is turned OFF"); }
}
