package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Device;

public class Main {
    public static void main(String[] args) {
        Device cameraPhone = new CameraModule(new BasicSmartphone());
        System.out.println(cameraPhone.specs()); // Basic Smartphone + High-Resolution Camera

        Device batteryPhone = new BatteryBooster(new BasicSmartphone());
        System.out.println(batteryPhone.specs()); // Basic Smartphone + Enhanced Battery Life

        // Bonus: Stack both decorators
        Device fullPhone = new BatteryBooster(new CameraModule(new BasicSmartphone()));
        System.out.println(fullPhone.specs()); // Basic Smartphone + High-Resolution Camera + Enhanced Battery Life
    }
}