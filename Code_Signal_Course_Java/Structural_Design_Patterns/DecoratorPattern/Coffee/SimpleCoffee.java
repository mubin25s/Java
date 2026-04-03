package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Coffee;

public class SimpleCoffee implements Beverage {
    @Override public String getDescription() { return "Simple Coffee"; }
    @Override public double cost() { return 1.0; }
}
