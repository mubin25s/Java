package Code_Signal_Course_Java.OOP_Concepts.Encapsulation.Gadget;

public class Main {
    public static void main(String[] args) {
        Gadget gadget = new Gadget("Smartphone", 999.99);
        gadget.setName("Laptop");
        gadget.setPrice(49.99); // below minimum, will be set to 50.00

        System.out.println("Name: " + gadget.getName());
        System.out.println("Price: " + gadget.getPrice());
    }
}