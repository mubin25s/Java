package Design_Pattern.Practice_Mid.Factory_Pattern.shape;

import Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area.Area;
import Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area.Rectangle;

public class ShapeFactory {
    public static IShape getShape(String type) {
        if (type.equals("Circle")) {
            return new Circle();
        } else if (type.equals("Square")) {
            return new Square();
        } else if (type.equals("Rectangle")) {
            return new Rect();
        } else {
            return null;
        }
    }
}
