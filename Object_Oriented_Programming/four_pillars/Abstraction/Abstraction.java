package Object_Oriented_Programming.four_pillars.Abstraction;

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
