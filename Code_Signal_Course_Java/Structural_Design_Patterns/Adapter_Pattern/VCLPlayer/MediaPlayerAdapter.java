package Code_Signal_Course_Java.Structural_Design_Patterns.Adapter_Pattern.VCLPlayer;

public class MediaPlayerAdapter implements MediaPlayer {
    private VLCPlayer vlcPlayer;

    public MediaPlayerAdapter(VLCPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void playAudio(String filename) {
        vlcPlayer.playVLCFile(filename);
    }
}