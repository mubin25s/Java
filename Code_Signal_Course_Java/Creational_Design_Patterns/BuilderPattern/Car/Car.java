package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.Car;

public class Car {

    // Required parameters
    private String make;
    private String model;

    // Optional parameters
    private boolean hasSunroof;
    private boolean hasGPS;
    private boolean hasHeatedSeats;

    // Private constructor to enforce the use of the builder
    private Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.hasSunroof = builder.hasSunroof;
        this.hasGPS = builder.hasGPS;
        this.hasHeatedSeats = builder.hasHeatedSeats;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean hasSunroof() {
        return hasSunroof;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    public boolean hasHeatedSeats() {
        return hasHeatedSeats;
    }

    // ✅ Static nested CarBuilder class
    public static class CarBuilder {

        // Required parameters
        private final String make;
        private final String model;

        // Optional parameters with default values
        private boolean hasSunroof = false;
        private boolean hasGPS = false;
        private boolean hasHeatedSeats = false;

        // Constructor for required parameters
        public CarBuilder(String make, String model) {
            this.make = make;
            this.model = model;
        }

        // Setter for hasSunroof
        public CarBuilder setSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        // Setter for hasGPS
        public CarBuilder setGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        // Setter for hasHeatedSeats
        public CarBuilder setHeatedSeats(boolean hasHeatedSeats) {
            this.hasHeatedSeats = hasHeatedSeats;
            return this;
        }

        // Build method
        public Car build() {
            return new Car(this);
        }
    }
}