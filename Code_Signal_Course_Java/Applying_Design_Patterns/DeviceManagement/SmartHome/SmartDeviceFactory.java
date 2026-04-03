package Code_Signal_Course_Java.Applying_Design_Patterns.Unit_2_DeviceManagement.SmartHome;

public class SmartDeviceFactory {
    public SmartDevice createDevice(String type) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("LIGHT")) return new SmartLight();
        if (type.equalsIgnoreCase("THERMOSTAT")) return new SmartThermostat();
        return null;
    }
}
