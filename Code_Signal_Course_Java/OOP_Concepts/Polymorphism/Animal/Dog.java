package Code_Signal_Course_Java.OOP_Concepts.Polymorphism.Animal;

public class Dog extends Animal {
    // Runtime polymorphism (method overriding)
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}