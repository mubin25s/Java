package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.MusicFile;

public class MP3FileFactory implements MusicFileAbstractFactory {
    @Override
    public MusicFile createMusicFile() {
        return new MP3File();
    }
}
