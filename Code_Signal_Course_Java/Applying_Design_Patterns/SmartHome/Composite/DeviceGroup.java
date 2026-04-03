package Code_Signal_Course_Java.Applying_Design_Patterns.SmartHome.Composite;
import java.util.ArrayList;
import java.util.List;

public class DeviceGroup implements DeviceComponent {
    private List<DeviceComponent> devices = new ArrayList<>();
    public void addDevice(DeviceComponent device) { devices.add(device); }
    @Override public void turnOn() {
        System.out.println("Turning on all devices in group:");
        for (DeviceComponent d : devices) { d.turnOn(); }
    }
    @Override public void turnOff() {
        System.out.println("Turning off all devices in group:");
        for (DeviceComponent d : devices) { d.turnOff(); }
    }
}
