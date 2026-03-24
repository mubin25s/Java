package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.SpecializedHouse;

public class BrickHouseBuilder implements HouseBuilder {
    private House house = new House();

    @Override
    public void buildWalls() { house.setWalls("brick walls"); }
    @Override
    public void buildRoof() { house.setRoof("tile roof"); }
    @Override
    public void buildFloor() { house.setFloor("concrete floor"); }
    @Override
    public House getHouse() { return house; }
}
