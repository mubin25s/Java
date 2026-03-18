package Code_Signal_Course_Java.OOP_Concepts.Abstraction.Shape;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }

    @Override
    String description() {
        return "This is a rectangle.";
    }
}
