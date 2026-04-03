package Code_Signal_Course_Java.Structural_Design_Patterns.BridgePattern.UniversalRemote;

public interface Device {
    void on();
    void off();
    void setVolume(int volume);
}
