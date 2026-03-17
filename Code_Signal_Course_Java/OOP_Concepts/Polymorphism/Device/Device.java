package Code_Signal_Course_Java.OOP_Concepts.Polymorphism.Device;
import Object_Oriented_Programming.four_pillars.Polymorphism.Polymorphism;

public class Device {
    private String name;
    private String powerStatus;

    public Device(String name, String powerStatus) {
        this.name = name;
        this.powerStatus = powerStatus;
    }

    public void status() {
        System.out.println("Device: " + name + ", Power Status: " + powerStatus);
    }
}