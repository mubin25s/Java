package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.SpecializedHouse;

public class House {
    private String walls;
    private String roof;
    private String floor;

    public void setWalls(String walls) { this.walls = walls; }
    public void setRoof(String roof) { this.roof = roof; }
    public void setFloor(String floor) { this.floor = floor; }

    @Override
    public String toString() {
        return "House with " + walls + ", " + roof + " and " + floor + ".";
    }
}
