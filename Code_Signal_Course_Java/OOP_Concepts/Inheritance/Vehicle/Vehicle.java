package Code_Signal_Course_Java.OOP_Concepts.Inheritance.Vehicle;
import Object_Oriented_Programming.four_pillars.Inheritance.Inheritance;

public class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void drive() {
        System.out.println("Driving a vehicle made by " + make + " in the year " + year);
    }
}