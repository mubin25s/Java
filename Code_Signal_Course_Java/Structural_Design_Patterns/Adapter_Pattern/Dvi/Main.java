package Code_Signal_Course_Java.Structural_Design_Patterns.Adapter_Pattern.Dvi;

public class Main {
    public static void main(String[] args) {
        Dvi dvi = new Dvi();
        Hdmi adapter = new Adapter(dvi);
        adapter.connectWithHdmiCable(); // Connected with DVI cable.
    }
}