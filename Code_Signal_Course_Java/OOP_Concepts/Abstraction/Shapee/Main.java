package Code_Signal_Course_Java.OOP_Concepts.Abstraction.Shapee;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(3);
        System.out.println("Shape Area: " + shape.area() + ", Perimeter: " + shape.perimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());

        Triangle triangle = new Triangle(3);
        System.out.println("Triangle Area: " + triangle.area() + ", Perimeter: " + triangle.perimeter());
    }
}