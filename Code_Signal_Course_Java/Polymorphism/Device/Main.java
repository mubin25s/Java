package Code_Signal_Course_Java.Polymorphism.Device;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell XPS", "On", "Windows 11");
        Smartphone phone = new Smartphone("iPhone 15", "On", "Verizon");

        laptop.status();
        System.out.println();
        phone.status();
    }
}