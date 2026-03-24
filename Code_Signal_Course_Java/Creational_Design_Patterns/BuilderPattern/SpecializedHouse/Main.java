package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.SpecializedHouse;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        HouseBuilder brickBuilder = new BrickHouseBuilder();
        director.setBuilder(brickBuilder);
        House brickHouse = director.construct();
        System.out.println("Constructed: " + brickHouse);

        HouseBuilder woodBuilder = new WoodHouseBuilder();
        director.setBuilder(woodBuilder);
        House woodHouse = director.construct();
        System.out.println("Constructed: " + woodHouse);
    }
}
