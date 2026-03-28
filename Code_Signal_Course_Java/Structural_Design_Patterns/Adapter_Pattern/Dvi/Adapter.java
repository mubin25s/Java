package Code_Signal_Course_Java.Structural_Design_Patterns.Adapter_Pattern.Dvi;

public class Adapter implements Hdmi {
    private Dvi dvi; // Fix 1: hold Dvi, not Hdmi

    public Adapter(Dvi dvi) { // Fix 2: accept Dvi in constructor
        this.dvi = dvi;
    }

    @Override
    public void connectWithHdmiCable() {
        dvi.connectWithDviCable(); // Fix 3: delegate to Dvi instead of hardcoding
    }
}