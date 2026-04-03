package Code_Signal_Course_Java.Structural_Design_Patterns.BridgePattern.UniversalRemote;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        UniversalRemote tvRemote = new UniversalRemote(tv);
        tvRemote.on();
        tvRemote.setVolume(20);
        tvRemote.off();

        Device radio = new Radio();
        UniversalRemote radioRemote = new UniversalRemote(radio);
        radioRemote.on();
        radioRemote.setVolume(15);
        radioRemote.off();
    }
}
