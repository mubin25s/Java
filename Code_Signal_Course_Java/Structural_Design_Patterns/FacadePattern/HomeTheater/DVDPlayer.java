package Code_Signal_Course_Java.Structural_Design_Patterns.FacadePattern.HomeTheater;

public class DVDPlayer {
    public void on() { System.out.println("DVD Player on"); }
    public void play(String movie) { System.out.println("Playing movie: " + movie); }
    public void stop() { System.out.println("Stopping DVD Player"); }
    public void off() { System.out.println("DVD Player off"); }
}
