package Code_Signal_Course_Java.Inheritance.Vehicle;

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