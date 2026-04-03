package Code_Signal_Course_Java.Structural_Design_Patterns.FlyweightPattern.Forest;
import java.util.HashMap;
import java.util.Map;

class TreeType {
    private String name, color, texture;
    public TreeType(String n, String c, String t) { this.name = n; this.color = c; this.texture = t; }
    public void draw(int x, int y) {
        System.out.println("Drawing a " + name + " (color: " + color + ", texture: " + texture + ") at [" + x + ", " + y + "]");
    }
}

class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();
    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + color + texture;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color, texture));
            System.out.println("Creating new TreeType for: " + name);
        }
        return treeTypes.get(key);
    }
    public static int getCount() { return treeTypes.size(); }
}

class Tree {
    private int x, y;
    private TreeType type;
    public Tree(int x, int y, TreeType type) { this.x = x; this.y = y; this.type = type; }
    public void draw() { type.draw(x, y); }
}

public class Forest {
    public static void main(String[] args) {
        TreeType typeOak = TreeFactory.getTreeType("Oak", "Green", "Rough");
        TreeType typePine = TreeFactory.getTreeType("Pine", "Dark Green", "Needle");
        
        java.util.List<Tree> trees = new java.util.ArrayList<>();
        for (int i = 0; i < 5; i++) {
            trees.add(new Tree(i * 10, i * 20, typeOak));
            trees.add(new Tree(i * 10, i * 30, typePine));
        }

        System.out.println("Drawing a massive forest with only " + TreeFactory.getCount() + " unique TreeTypes...");
        for (Tree tree : trees) { tree.draw(); }
    }
}
