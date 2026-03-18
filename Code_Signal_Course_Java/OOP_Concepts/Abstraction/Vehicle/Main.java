package Code_Signal_Course_Java.OOP_Concepts.Abstraction.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(3.5);
        Bicycle bicycle = new Bicycle(15);

        System.out.println("Car Speed: " + car.speed() + ", Fuel Efficiency: " + car.fuelEfficiency());
        System.out.println("Bicycle Speed: " + bicycle.speed() + ", Fuel Efficiency: " + bicycle.fuelEfficiency());

        Vehicle vehicle = new Car(2.0);
        System.out.println("Vehicle Speed: " + vehicle.speed() + ", Fuel Efficiency: " + vehicle.fuelEfficiency());
    }
}