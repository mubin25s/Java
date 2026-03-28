package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Car;

public class CarDecorator implements Car {
    private Car decoratedCar;

    public CarDecorator(Car car) {
        this.decoratedCar = car;
    }

    @Override
    public String assemble() {
        return decoratedCar.assemble();
    }
}