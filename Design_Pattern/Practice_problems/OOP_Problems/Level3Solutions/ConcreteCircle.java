package Design_Pattern.Practice_problems.OOP_Problems.Level3Solutions;

public class ConcreteCircle extends AbstractShape {
    double r;
    ConcreteCircle(double r) { this.r = r; }
    @Override
    double area() { return Math.PI * r * r; }
}
