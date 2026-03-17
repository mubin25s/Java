package Object_Oriented_Programming.four_pillars.Abstraction;

public class Laptop extends Device {
    Laptop(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println("Laptop is booting up...");
    }
}
