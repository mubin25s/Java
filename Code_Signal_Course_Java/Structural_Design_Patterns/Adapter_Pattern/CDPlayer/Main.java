package Code_Signal_Course_Java.Structural_Design_Patterns.Adapter_Pattern.CDPlayer;

public class Main {
    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer();
        MusicPlayer adapter = new MusicAdapter(cdPlayer);
        adapter.playMusic(); // Playing music from CD.
    }
}