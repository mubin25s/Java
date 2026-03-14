package Code_Signal_Course_Java.Enum.Planet;

public class main {
    public main(String[] args) {
        System.out.printf("%-8s %10s %12s %15s%n",
            "Type", "Weight(kg)", "TopSpeed(km/h)", "Acceleration");
        System.out.println("-".repeat(50));

        for (CarType car : CarType.values()) {
            System.out.printf("%-8s %10.0f %14.0f %15.4f%n",
                car,
                car.getWeight(),
                car.getTopSpeed(),
                car.acceleration());
        }
    }
}
