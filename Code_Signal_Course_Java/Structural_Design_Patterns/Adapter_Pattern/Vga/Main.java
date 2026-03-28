package Code_Signal_Course_Java.Structural_Design_Patterns.Adapter_Pattern.Vga;

public class Main {
    public static void main(String[] args) {
        Vga vga = new Vga();
        Hdmi adapter = new HdmiAdapter(vga);
        adapter.connectWithHdmiCable(); // Connected with VGA cable.
    }
}