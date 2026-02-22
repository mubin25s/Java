/**
 * BASICS: Classes and Objects
 * A class is a blueprint, and an object is an instance of that blueprint.
 */
class Car {
    // Attributes (State)
    String color;
    String model;

    // Methods (Behavior)
    void drive() {
        System.out.println("The " + color + " " + model + " is driving.");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // Creating an object of class Car
        Car myCar = new Car();
        
        // Setting attributes
        myCar.color = "Red";
        myCar.model = "Toyota";

        // Calling behavior
        myCar.drive();
    }
}
