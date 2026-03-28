package Code_Signal_Course_Java.Structural_Design_Patterns.Adapter_Pattern.CDPlayer;
public class MusicAdapter implements MusicPlayer {
    private CDPlayer cdPlayer;

    public MusicAdapter(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    @Override
    public void playMusic() {
        cdPlayer.playCD();
    }
}