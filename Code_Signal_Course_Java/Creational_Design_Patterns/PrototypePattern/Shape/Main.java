package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.Shape;

public class Main {
    public static void main(String[] args) {
        // Circle
        Circle originalCircle = new Circle("Red", 10);
        Circle clonedCircle = (Circle) originalCircle.cloneShape();

        originalCircle.showDetails(); // Circle - Color: Red, Radius: 10
        clonedCircle.showDetails();   // Circle - Color: Red, Radius: 10

        // Rectangle
        Rectangle originalRectangle = new Rectangle("Blue", 20, 15);
        Rectangle clonedRectangle = (Rectangle) originalRectangle.cloneShape();

        originalRectangle.showDetails(); // Rectangle - Color: Blue, Width: 20, Height: 15
        clonedRectangle.showDetails();   // Rectangle - Color: Blue, Width: 20, Height: 15
    }
}