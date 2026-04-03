package Code_Signal_Course_Java.Structural_Design_Patterns.BridgePattern.UniversalRemote;

public class Radio implements Device {
    @Override public void on() { System.out.println("Radio is on"); }
    @Override public void off() { System.out.println("Radio is off"); }
    @Override public void setVolume(int volume) { System.out.println("Radio volume set to " + volume); }
}
