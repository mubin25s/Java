package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Device;

public class DeviceDecorator implements Device {
    private Device decoratedDevice;

    public DeviceDecorator(Device device) {
        this.decoratedDevice = device;
    }

    @Override
    public String specs() {
        return decoratedDevice.specs();
    }
}