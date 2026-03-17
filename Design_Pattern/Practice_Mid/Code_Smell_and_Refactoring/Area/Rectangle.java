package Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area;

public class Rectangle implements Shape {
    private final double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() { return width * height; }
}
