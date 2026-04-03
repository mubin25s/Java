package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Beverage coffee) { super(coffee); }
    @Override public String getDescription() { return decoratedCoffee.getDescription() + ", Sugar"; }
    @Override public double cost() { return decoratedCoffee.cost() + 0.2; }
}
