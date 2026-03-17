package Code_Signal_Course_Java.OOP_Concepts.Polymorphism.Device;
import Object_Oriented_Programming.four_pillars.Polymorphism.Polymorphism;

public class Laptop extends Device {
    private String operatingSystem;

    public Laptop(String name, String powerStatus, String operatingSystem) {
        super(name, powerStatus);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void status() {
        super.status();
        System.out.println("Operating System: " + operatingSystem);
    }
}