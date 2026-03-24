package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.Vehicle;

public abstract class Vehicle implements Cloneable {

    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract Vehicle cloneVehicle();

    @Override
    protected Vehicle clone() {
        try {
            return (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}