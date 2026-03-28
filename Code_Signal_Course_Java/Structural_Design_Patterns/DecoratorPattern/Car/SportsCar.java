package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Car;

public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Sports Car Features";
    }
}