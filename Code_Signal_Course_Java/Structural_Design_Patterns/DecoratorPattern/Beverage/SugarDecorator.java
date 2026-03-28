package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Beverage;

public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Sugar";
    }
}