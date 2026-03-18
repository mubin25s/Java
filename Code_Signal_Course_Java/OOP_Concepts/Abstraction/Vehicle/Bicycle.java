package Code_Signal_Course_Java.OOP_Concepts.Abstraction.Vehicle;

public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle(int gearCount) {
        this.gearCount = gearCount;
    }

    @Override
    public double speed() {
        return gearCount * 3;
    }

    @Override
    public double fuelEfficiency() {
        return gearCount * 10;
    }
}