package Object_Oriented_Programming.four_pillars.Abstraction;

public abstract class Device {
    String brand;

    Device(String brand) {
        this.brand = brand;
    }

    // Abstract method: No implementation here, must be implemented by child classes
    abstract void turnOn();

    // Regular method
    void showBrand() {
        System.out.println("Device Brand: " + brand);
    }
}
