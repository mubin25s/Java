package Code_Signal_Course_Java.Structural_Design_Patterns.BridgePattern.UniversalRemote;

public abstract class RemoteControl {
    protected Device device;
    public RemoteControl(Device device) { this.device = device; }
    public abstract void on();
    public abstract void off();
}
