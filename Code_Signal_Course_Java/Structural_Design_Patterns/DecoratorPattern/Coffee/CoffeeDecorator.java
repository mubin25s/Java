package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Coffee;

public abstract class CoffeeDecorator implements Beverage {
    protected Beverage decoratedCoffee;
    public CoffeeDecorator(Beverage coffee) { this.decoratedCoffee = coffee; }
    @Override public String getDescription() { return decoratedCoffee.getDescription(); }
    @Override public double cost() { return decoratedCoffee.cost(); }
}
