package Design_Pattern.Practice_problems.OOP_Problems.Level3Solutions;

import Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area.Circle;
import Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area.Area;
import Design_Pattern.Practice_Mid.Factory_Pattern.shape.Rect;
import Object_Oriented_Programming.four_pillars.Abstraction.Abstraction;
import Object_Oriented_Programming.four_pillars.Inheritance.Inheritance;

public class Level3Solutions {
    public static void main(String[] args) {
        System.out.println("--- Level 3: Inheritance ---");
        Manager mgr = new Manager();
        mgr.displayInfo();

        System.out.println("\n--- Level 3: Overloading ---");
        AreaCalculator ac = new AreaCalculator();
        System.out.println("Circle Area (r=5): " + ac.area(5));
        System.out.println("Rect Area (10x5): " + ac.area(10, 5));

        System.out.println("\n--- Level 3: Overriding ---");
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound();
        myCat.makeSound();

        System.out.println("\n--- Level 3: Abstraction ---");
        Payment p1 = new CreditCardPayment();
        p1.processPayment(150.0);
        
        AbstractShape s1 = new ConcreteCircle(7);
        System.out.println("Concrete Circle Area: " + s1.area());
    }
}
