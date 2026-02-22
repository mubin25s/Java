// SMELLS: long method, magic numbers, poor naming, does too many things
public class O {
    public void p(int x, int y, int t) {
        if (t == 1) {
            double r = x * 3.14159 * 3.14159;
            System.out.println("Area: " + r);
        } else if (t == 2) {
            double r = x * y;
            System.out.println("Area: " + r);
        } else if (t == 3) {
            double r = 0.5 * x * y;
            System.out.println("Area: " + r);
        }
    }
}


/*Smells identified:

Meaningless names (O, p, x, y, t)
Magic numbers (1, 2, 3, 3.14159)
One method doing everything (violates Single Responsibility)
Hard to extend (add new shape = edit this method)




/*
 * REFACTORED CODE 1:
 */

class Shape {
    protected double x, y;
    public Shape(double x, double y) { this.x = x; this.y = y; }
    public double area() { throw new UnsupportedOperationException(); }
}

class Circle extends Shape {
    public Circle(double r) { super(r, 0); }
    public double area() { return Math.PI * x * x; }
}

class Rectangle extends Shape {
    public Rectangle(double w, double h) { super(w, h); }
    public double area() { return x * y; }
}

class Triangle extends Shape {
    public Triangle(double b, double h) { super(b, h); }
    public double area() { return 0.5 * x * y; }
}

public class O {
    public void p(Shape s) {
        System.out.println("Area: " + s.area());
    }
}


/*
 * REFACTORED CODE 2:
 */

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private static final double PI = Math.PI;
    private final double radius;

    public Circle(double radius) { this.radius = radius; }

    @Override
    public double calculateArea() { return PI * radius * radius; }
}

class Rectangle implements Shape {
    private final double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() { return width * height; }
}

class Triangle implements Shape {
    private final double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() { return 0.5 * base * height; }
}

// Clean usage — open for extension, closed for modification (OCP)
public class Main {
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
