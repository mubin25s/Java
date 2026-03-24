package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.Vehicle;

public class Car extends Vehicle {

    private String engineType;

    public Car(String model, String engineType) {
        super(model);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public Vehicle cloneVehicle() {
        return (Car) this.clone();
    }

    public void showDetails() {
        System.out.println("Car Model: " + getModel() + ", Engine Type: " + engineType);
    }
}