package four_pillars;

/**
 * ABSTRACTION
 * Definition: Hiding the complex implementation details and showing only
 * the essential features of the object.
 * It can be achieved using Abstract Classes or Interfaces.
 */

// Abstract class cannot be instantiated
abstract class Device {
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

class Laptop extends Device {
    Laptop(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println("Laptop is booting up...");
    }
}

class Smartphone extends Device {
    Smartphone(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println("Smartphone is showing the splash screen...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Device myLaptop = new Laptop("Dell");
        Device myPhone = new Smartphone("Samsung");

        myLaptop.showBrand();
        myLaptop.turnOn();

        myPhone.showBrand();
        myPhone.turnOn();
    }
}
