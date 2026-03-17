package Design_Pattern.Practice_problems.OOP_Problems.Level3Solutions;

public class ConcreteRectangle extends AbstractShape {
    double l, w;
    ConcreteRectangle(double l, double w) { this.l = l; this.w = w; }
    @Override
    double area() { return l * w; }
}
