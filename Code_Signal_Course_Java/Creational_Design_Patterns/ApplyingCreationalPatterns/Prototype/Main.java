package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Prototype;

public class Main {
    public static void main(String[] args) {
        CustomerProfile original = new CustomerProfile("Alice", "123 Main St", "ACC-001");

        CustomerProfile cloned = (CustomerProfile) original.clonePrototype();

        System.out.println("Original: " + original);
        System.out.println("Cloned:   " + cloned);
        System.out.println("Same instance: " + (original == cloned));
    }
}