package Object_Oriented_Programming.four_pillars.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        // Compile-time Polymorphism Example
        MathOperations math = new MathOperations();
        System.out.println("Addition (2 numbers): " + math.add(5, 10));
        System.out.println("Addition (3 numbers): " + math.add(5, 10, 15));

        // Runtime Polymorphism Example (Dynamic Method Dispatch)
        Shape myShape;

        myShape = new Circle();
        myShape.draw(); // Calls Circle's draw

        myShape = new Square();
        myShape.draw(); // Calls Square's draw
    }
}
