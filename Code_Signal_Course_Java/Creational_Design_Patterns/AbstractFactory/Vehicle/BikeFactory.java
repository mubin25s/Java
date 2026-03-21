package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.Vehicle;

public class BikeFactory implements VehicleAbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
