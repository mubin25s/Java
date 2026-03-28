package Code_Signal_Course_Java.Structural_Design_Patterns.Adapter_Pattern.Vga;

public class HdmiAdapter implements Hdmi {
    private Vga vga;

    public HdmiAdapter(Vga vga) {
        this.vga = vga;
    }

    @Override
    public void connectWithHdmiCable() {
        vga.connectWithVgaCable();
    }
}