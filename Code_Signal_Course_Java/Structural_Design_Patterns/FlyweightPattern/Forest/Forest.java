package Code_Signal_Course_Java.Structural_Design_Patterns.FlyweightPattern.Forest;
import java.util.ArrayList;
import java.util.List;

public class Forest {
    public static void main(String[] args) {
        TreeType typeOak = TreeFactory.getTreeType("Oak", "Green", "Rough");
        TreeType typePine = TreeFactory.getTreeType("Pine", "Dark Green", "Needle");
        
        List<Tree> trees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            trees.add(new Tree(i * 10, i * 20, typeOak));
            trees.add(new Tree(i * 10, i * 30, typePine));
        }

        System.out.println("Drawing a massive forest with only " + TreeFactory.getCount() + " unique TreeTypes...");
        for (Tree tree : trees) { tree.draw(); }
    }
}
