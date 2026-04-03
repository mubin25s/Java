package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Beverage coffee) { super(coffee); }
    @Override public String getDescription() { return decoratedCoffee.getDescription() + ", Milk"; }
    @Override public double cost() { return decoratedCoffee.cost() + 0.5; }
}
