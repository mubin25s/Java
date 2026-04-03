package Code_Signal_Course_Java.Structural_Design_Patterns.FacadePattern.HomeTheater;

public class SoundSystem {
    public void on() { System.out.println("Sound System on"); }
    public void setVolume(int level) { System.out.println("Sound System volume set to " + level); }
    public void off() { System.out.println("Sound System off"); }
}
