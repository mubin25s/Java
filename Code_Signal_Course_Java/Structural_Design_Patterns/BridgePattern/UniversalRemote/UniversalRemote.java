package Code_Signal_Course_Java.Structural_Design_Patterns.BridgePattern.UniversalRemote;

public class UniversalRemote extends RemoteControl {
    public UniversalRemote(Device device) { super(device); }
    @Override public void on() { System.out.println("Remote: turning on..."); device.on(); }
    @Override public void off() { System.out.println("Remote: turning off..."); device.off(); }
    public void setVolume(int volume) { System.out.println("Remote: setting volume..."); device.setVolume(volume); }
}
