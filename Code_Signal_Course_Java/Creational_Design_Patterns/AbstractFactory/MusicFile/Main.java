package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.MusicFile;

public class Main {
    public static void main(String[] args) {
        MusicFile mp3 = MusicFileFactory.createMusicFile(new MP3FileFactory());
        mp3.play();

        MusicFile wav = MusicFileFactory.createMusicFile(new WAVFileFactory());
        wav.play();

        MusicFile flac = MusicFileFactory.createMusicFile(new FLACFileFactory());
        flac.play();
    }
}
