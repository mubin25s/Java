package Code_Signal_Course_Java.Structural_Design_Patterns.BridgePattern.UniversalRemote;

public class TV implements Device {
    @Override public void on() { System.out.println("TV is on"); }
    @Override public void off() { System.out.println("TV is off"); }
    @Override public void setVolume(int volume) { System.out.println("TV volume set to " + volume); }
}
