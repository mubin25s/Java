package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.SpecializedHouse;

public class Director {
    private HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) { this.builder = builder; }

    public House construct() {
        builder.buildFloor();
        builder.buildWalls();
        builder.buildRoof();
        return builder.getHouse();
    
}
}