package Code_Signal_Course_Java.OOP_Concepts.Class_Object.Car;

public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Copy constructor
    public Car(Car other) {
        this.brand = other.brand;
        this.year = other.year;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}