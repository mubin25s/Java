package Object_Oriented_Programming.InterfaceBasics;

public class MusicPlayer implements Playable, Stoppable {
    @Override
    public void play() {
        System.out.println("Music is playing...");
    }

    @Override
    public void stop() {
        System.out.println("Music has stopped.");
    }
}
