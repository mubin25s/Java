package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Beverage;

public class BasicCoffee implements Beverage {
    @Override
    public String getDescription() {
        return "Black Coffee";
    }
}