package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Car;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Luxury Car Features";
    }
}