package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.MusicFile;

public class WAVFileFactory implements MusicFileAbstractFactory {
    @Override
    public MusicFile createMusicFile() {
        return new WAVFile();
    }
}
