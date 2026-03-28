package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Device;

public class BatteryBooster extends DeviceDecorator {
    public BatteryBooster(Device device) {
        super(device);
    }

    @Override
    public String specs() {
        return super.specs() + " + Enhanced Battery Life";
    }
}