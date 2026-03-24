package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.SpecializedHouse;

public class WoodHouseBuilder implements HouseBuilder {
    private House house = new House();

    @Override
    public void buildWalls() { house.setWalls("wooden walls"); }
    @Override
    public void buildRoof() { house.setRoof("shingle roof"); }
    @Override
    public void buildFloor() { house.setFloor("wooden floor"); }
    @Override
    public House getHouse() { return house; }
}
