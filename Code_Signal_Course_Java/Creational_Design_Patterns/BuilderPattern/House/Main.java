package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.House;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder(4, 3)
                .setGarage(true)
                .setSwimmingPool(true)
                .setGarden(true)
                .setSecuritySystem(true)
                .build();

        System.out.println("House has " + house.getRooms() + " rooms.");
        System.out.println("House has " + house.getBathrooms() + " bathrooms.");
        System.out.println("House has a garage: " + house.hasGarage());
        System.out.println("House has a swimming pool: " + house.hasSwimmingPool());
        System.out.println("House has a garden: " + house.hasGarden());
        System.out.println("House has a security system: " + house.hasSecuritySystem());
    }
}