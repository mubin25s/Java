package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.Car;

public class Main {
    public static void main(String[] args) {
        // Building a Car object using the CarBuilder
        Car car = new Car.CarBuilder("Toyota", "Camry")
                .setSunroof(true)
                .setGPS(true)
                .setHeatedSeats(true)
                .build();

        // Printing Car properties using getters
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Has sunroof: " + car.hasSunroof());
        System.out.println("Has GPS: " + car.hasGPS());
        System.out.println("Has heated seats: " + car.hasHeatedSeats());
    }
}