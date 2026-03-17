package Design_Pattern.Practice_Mid.Factory_Pattern.shape;

import Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area.Area;
import Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area.Rectangle;

public class Rect implements IShape {
    public void draw() {
        System.out.println("Rectangle");
    }
}
