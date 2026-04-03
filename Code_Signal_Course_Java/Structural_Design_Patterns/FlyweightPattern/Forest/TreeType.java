package Code_Signal_Course_Java.Structural_Design_Patterns.FlyweightPattern.Forest;

public class TreeType {
    private String name, color, texture;
    public TreeType(String n, String c, String t) { this.name = n; this.color = c; this.texture = t; }
    public void draw(int x, int y) {
        System.out.println("Drawing a " + name + " (color: " + color + ", texture: " + texture + ") at [" + x + ", " + y + "]");
    }
}
