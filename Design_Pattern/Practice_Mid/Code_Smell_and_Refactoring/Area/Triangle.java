package Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area;

public class Triangle implements Shape {
    private final double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() { return 0.5 * base * height; }
}
