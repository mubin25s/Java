package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Device;

public class CameraModule extends DeviceDecorator {
    public CameraModule(Device device) {
        super(device);
    }

    @Override
    public String specs() {
        return super.specs() + " + High-Resolution Camera";
    }
}