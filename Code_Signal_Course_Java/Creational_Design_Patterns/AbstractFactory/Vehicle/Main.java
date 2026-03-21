package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle(new CarFactory());
        car.drive();

        Vehicle bike = VehicleFactory.createVehicle(new BikeFactory());
        bike.drive();
    }
}
