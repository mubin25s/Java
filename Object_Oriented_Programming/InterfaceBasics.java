package advanced;

/**
 * ADVANCED: Interfaces
 * A reference type in Java, similar to a class, that can contain only
 * constants, method signatures, default methods, static methods, and nested types.
 */

interface Playable {
    // Abstract method (implicitly public and abstract)
    void play();
}

interface Stoppable {
    void stop();
}

// A class can implement multiple interfaces
class MusicPlayer implements Playable, Stoppable {
    @Override
    public void play() {
        System.out.println("Music is playing...");
    }

    @Override
    public void stop() {
        System.out.println("Music has stopped.");
    }
}

public class InterfaceBasics {
    public static void main(String[] args) {
        MusicPlayer mp3 = new MusicPlayer();
        mp3.play();
        mp3.stop();
    }
}
