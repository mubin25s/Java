package Code_Signal_Course_Java.Enum.Planet;

public enum CarType {
    SEDAN (1500, 190),
    SUV   (2000, 180),
    TRUCK (3000, 120),
    COUPE (1400, 220),
    SPORTS(1200, 300); // ← added

    private static final double ACCELERATION_FACTOR = 2.0;

    private final double weight;
    private final double topSpeed;

    CarType(double weight, double topSpeed) {
        this.weight   = weight;
        this.topSpeed = topSpeed;
    }

    public double getWeight()   { return weight;   }
    public double getTopSpeed() { return topSpeed; }

    public double acceleration() {
        return topSpeed / (weight * ACCELERATION_FACTOR);
    }
}
