package Object_Oriented_Programming.four_pillars.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Inherited field from Animal
        myDog.name = "Buddy";
        
        // Inherited method from Animal
        myDog.eat();
        
        // Specific method from Dog
        myDog.bark();
    }
}
