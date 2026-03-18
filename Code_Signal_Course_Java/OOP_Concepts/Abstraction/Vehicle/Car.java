package Code_Signal_Course_Java.OOP_Concepts.Abstraction.Vehicle;

public class Car extends Vehicle {
    private double engineDisplacement;

    public Car(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public double speed() {
        return engineDisplacement * 2;
    }

    @Override
    public double fuelEfficiency() {
        return engineDisplacement * 5;
    }
}