package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.Vehicle;

public class CarFactory implements VehicleAbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
