package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.MusicFile;

public class MusicFileFactory {
    public static MusicFile createMusicFile(MusicFileAbstractFactory factory) {
        return factory.createMusicFile();
    }
}
