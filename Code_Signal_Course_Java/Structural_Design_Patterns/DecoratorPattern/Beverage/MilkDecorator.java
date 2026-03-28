package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Beverage;
public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Milk";
    }
}