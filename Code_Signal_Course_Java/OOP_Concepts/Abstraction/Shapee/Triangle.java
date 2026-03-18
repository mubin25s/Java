package Code_Signal_Course_Java.OOP_Concepts.Abstraction.Shapee;

public class Triangle extends Shape {
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double perimeter() {
        return 3 * side;
    }
}