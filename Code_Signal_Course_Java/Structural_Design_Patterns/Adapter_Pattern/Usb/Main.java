package Code_Signal_Course_Java.Structural_Design_Patterns.Adapter_Pattern.Usb;

public class Main {
    public static void main(String[] args) {
        MicroUsb microUsb = new MicroUsb();
        Usb adapter = new Adapter(microUsb);
        adapter.connectWithUsbCable();
    }
}