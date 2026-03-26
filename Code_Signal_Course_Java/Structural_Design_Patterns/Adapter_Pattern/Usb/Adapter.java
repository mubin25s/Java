package Code_Signal_Course_Java.Structural_Design_Patterns.Adapter_Pattern.Usb;

public class Adapter implements Usb {
    private MicroUsb microUsb;

    public Adapter(MicroUsb microUsb) {
        this.microUsb = microUsb;
    }

    @Override
    public void connectWithUsbCable() {
        microUsb.connectWithMicroUsbCable();
    }
}