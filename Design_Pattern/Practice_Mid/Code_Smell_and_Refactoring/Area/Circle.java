package Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area;

public class Circle implements Shape {
    private static final double PI = Math.PI;
    private final double radius;

    public Circle(double radius) { this.radius = radius; }

    @Override
    public double calculateArea() { return PI * radius * radius; }
}
