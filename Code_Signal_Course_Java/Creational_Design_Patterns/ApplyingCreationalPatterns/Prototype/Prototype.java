package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Prototype;

public abstract class Prototype implements Cloneable {

    public abstract Prototype clonePrototype();

    @Override
    protected Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
