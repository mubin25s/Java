package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Car;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        System.out.println(sportsCar.assemble()); // Basic Car + Sports Car Features

        Car luxuryCar = new LuxuryCar(new BasicCar());
        System.out.println(luxuryCar.assemble()); // Basic Car + Luxury Car Features

        // Bonus: Stack both decorators
        Car sportsLuxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
        System.out.println(sportsLuxuryCar.assemble()); // Basic Car + Sports Car Features + Luxury Car Features
    }
}