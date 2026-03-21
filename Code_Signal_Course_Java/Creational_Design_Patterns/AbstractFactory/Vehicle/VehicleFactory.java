package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.Vehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleAbstractFactory factory) {
        return factory.createVehicle();
    }
}
