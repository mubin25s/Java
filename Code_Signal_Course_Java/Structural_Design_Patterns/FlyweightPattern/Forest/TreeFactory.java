package Code_Signal_Course_Java.Structural_Design_Patterns.FlyweightPattern.Forest;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
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
