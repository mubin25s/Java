package Code_Signal_Course_Java.OOP_Concepts.Polymorphism.Animal;

public class Main {
    public static void main(String[] args) {

        // ✅ Compile-time polymorphism (overloading) — resolved at compile time
        Animal animal = new Animal();
        animal.makeSound();              // calls makeSound()
        animal.makeSound("Roar");        // calls makeSound(String)

        System.out.println("---");

        // ✅ Runtime polymorphism (overriding) — resolved at runtime via dynamic dispatch
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();   // prints: Bark
        cat.makeSound();   // prints: Meow
    }
}