package Code_Signal_Course_Java.OOP_Concepts.Polymorphism.Device;
import Object_Oriented_Programming.four_pillars.Polymorphism.Polymorphism;

public class Smartphone extends Device {
    private String carrier;

    public Smartphone(String name, String powerStatus, String carrier) {
        super(name, powerStatus);
        this.carrier = carrier;
    }

    @Override
    public void status() {
        super.status();
        System.out.println("Carrier: " + carrier);
    }
}