package Code_Signal_Course_Java.Applying_Design_Patterns.SmartHome.Decorator;

interface SmartDevice {
    void performAction();
}

class BasicCamera implements SmartDevice {
    @Override public void performAction() { System.out.println("Basic Camera recording..."); }
}

abstract class DeviceDecorator implements SmartDevice {
    protected SmartDevice device;
    public DeviceDecorator(SmartDevice d) { this.device = d; }
    @Override public void performAction() { device.performAction(); }
}

class NightVisionDecorator extends DeviceDecorator {
    public NightVisionDecorator(SmartDevice d) { super(d); }
    @Override public void performAction() {
        super.performAction();
        System.out.println("Activating Night Vision feature...");
    }
}
