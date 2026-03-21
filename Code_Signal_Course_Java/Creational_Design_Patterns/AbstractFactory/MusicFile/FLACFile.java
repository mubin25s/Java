package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.MusicFile;

public class FLACFile extends MusicFile {
    @Override
    public void play() {
        System.out.println("Playing FLAC File.");
    }
}
