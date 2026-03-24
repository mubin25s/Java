package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car originalCar = new Car("Sedan", "V6");
        Car clonedCar = (Car) originalCar.cloneVehicle();

        originalCar.showDetails(); // Car Model: Sedan, Engine Type: V6
        clonedCar.showDetails();   // Car Model: Sedan, Engine Type: V6
    }
}