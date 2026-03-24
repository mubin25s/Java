package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.Shape;

public abstract class Shape implements Cloneable {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract Shape cloneShape();

    @Override
    protected Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}