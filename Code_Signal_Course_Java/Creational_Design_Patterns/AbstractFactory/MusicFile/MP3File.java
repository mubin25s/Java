package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.MusicFile;

public class MP3File extends MusicFile {
    @Override
    public void play() {
        System.out.println("Playing MP3 File.");
    }
}
