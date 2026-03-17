package Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area;

public class Area {
    public static void main(String[] args) {
        java.util.List<Shape> shapes = java.util.List.of(
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 8)
        );

        for (Shape shape : shapes) {
            System.out.printf("%s area: %.2f%n",
                shape.getClass().getSimpleName(), shape.calculateArea());
        }
    }
}
