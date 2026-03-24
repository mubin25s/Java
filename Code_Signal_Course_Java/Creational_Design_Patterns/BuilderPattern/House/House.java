package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.House;

public class House {

    private int rooms;
    private int bathrooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;
    private boolean hasSecuritySystem;   

    private House(HouseBuilder builder) {
        this.rooms = builder.rooms;
        this.bathrooms = builder.bathrooms;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
        this.hasSecuritySystem = builder.hasSecuritySystem;
    }

    public int getRooms() { return rooms; }
    public int getBathrooms() { return bathrooms; }
    public boolean hasGarage() { return hasGarage; }
    public boolean hasSwimmingPool() { return hasSwimmingPool; }
    public boolean hasGarden() { return hasGarden; }
    public boolean hasSecuritySystem() { return hasSecuritySystem; }

    public static class HouseBuilder {

        private final int rooms;
        private final int bathrooms;
        private boolean hasGarage = false;
        private boolean hasSwimmingPool = false;
        private boolean hasGarden = false;
        private boolean hasSecuritySystem = false;

        public HouseBuilder(int rooms, int bathrooms) {
            this.rooms = rooms;
            this.bathrooms = bathrooms;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setSecuritySystem(boolean hasSecuritySystem) {
            this.hasSecuritySystem = hasSecuritySystem;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}