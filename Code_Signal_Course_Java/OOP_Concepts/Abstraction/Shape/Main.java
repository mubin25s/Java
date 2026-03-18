package Code_Signal_Course_Java.OOP_Concepts.Abstraction.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(3);
        System.out.println("Shape Area: " + shape.area() + ", Perimeter: " + shape.perimeter());
        System.out.println(shape.description());

        shape = new Rectangle(4, 6);
        System.out.println("Shape Area: " + shape.area() + ", Perimeter: " + shape.perimeter());
        System.out.println(shape.description());
    }
}