package Code_Signal_Course_Java.OOP_Concepts.Polymorphism.Animal;

public class Animal {
    // Compile-time polymorphism (method overloading)
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public void makeSound(String sound) {
        System.out.println("Animal says: " + sound);
    }
}