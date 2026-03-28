package Code_Signal_Course_Java.Structural_Design_Patterns.Adapter_Pattern.VCLPlayer;

public class Main {
    public static void main(String[] args) {
        VLCPlayer vlcPlayer = new VLCPlayer();
        MediaPlayer adapter = new MediaPlayerAdapter(vlcPlayer);

        adapter.playAudio("song.vlc");
        adapter.playAudio("podcast.vlc");
    }
}