package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Beverage;

public class BeverageDecorator implements Beverage {
    private Beverage decoratedBeverage;

    public BeverageDecorator(Beverage beverage) {
        this.decoratedBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription();
    }
}