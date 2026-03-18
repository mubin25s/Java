package Object_Oriented_Programming.four_pillars.Polymorphism;
public class Circle extends Shape {
    // Method Overriding: Child class provides its own implementation
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
