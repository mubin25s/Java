package Design_Pattern.Practice_problems.OOP_Problems.Level3Solutions;

import Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area.Area;
import Design_Pattern.Practice_problems.OOP_Problems.Level1Solutions.Level1Solutions;
import Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area.Circle;
import Design_Pattern.Practice_problems.OOP_Problems.Level1Solutions.Rectangle;

public class AreaCalculator {
    // Circle area
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle area
    double area(double length, double width) {
        return length * width;
    }
}
