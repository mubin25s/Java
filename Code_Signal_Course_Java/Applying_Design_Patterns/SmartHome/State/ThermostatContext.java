package Code_Signal_Course_Java.Applying_Design_Patterns.SmartHome.State;

interface BasicState {
    void handle();
}

class DeviceOnState implements BasicState {
    @Override public void handle() { System.out.println("The device is now ON and operational."); }
}

class DeviceOffState implements BasicState {
    @Override public void handle() { System.out.println("The device is now OFF and in sleep mode."); }
}

public class ThermostatContext {
    private BasicState state;
    public ThermostatContext() { state = new DeviceOffState(); }
    public void setState(BasicState st) { this.state = st; }
    public void performAction() { state.handle(); }
}
