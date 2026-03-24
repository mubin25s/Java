package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.Shape;

public class Circle extends Shape {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Shape cloneShape() {
        return new Circle(getColor(), radius);
    }

    public void showDetails() {
        System.out.println("Circle - Color: " + getColor() + ", Radius: " + radius);
    }
}