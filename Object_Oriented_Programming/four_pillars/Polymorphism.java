package four_pillars;

/**
 * POLYMORPHISM
 * Definition: The ability of an object to take on many forms.
 * 1. Compile-time Polymorphism (Method Overloading)
 * 2. Runtime Polymorphism (Method Overriding)
 */

class MathOperations {
    // Method Overloading: Same name, different parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Shape {
    void draw() {
        System.out.println("Drawing a generic shape");
    }
}

class Circle extends Shape {
    // Method Overriding: Child class provides its own implementation
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}

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
