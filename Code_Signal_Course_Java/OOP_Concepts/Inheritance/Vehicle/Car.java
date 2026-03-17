package Code_Signal_Course_Java.OOP_Concepts.Inheritance.Vehicle;
import Object_Oriented_Programming.four_pillars.Inheritance.Inheritance;

public class Car extends Vehicle {
    private String model;

    public Car(String make, int year, String model) {
        super(make, year);
        this.model = model;
    }

    public void displayDetails() {
        drive();
        System.out.println("The model is " + model);
    }
}