package Object_Oriented_Programming.four_pillars.Abstraction;

public class Smartphone extends Device {
    Smartphone(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println("Smartphone is showing the splash screen...");
    }
}
