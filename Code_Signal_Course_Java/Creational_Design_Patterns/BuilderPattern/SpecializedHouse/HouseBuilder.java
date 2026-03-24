package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.SpecializedHouse;

public interface HouseBuilder {
    void buildWalls();
    void buildRoof();
    void buildFloor();
    House getHouse();
}
