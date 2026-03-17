package Design_Pattern.Practice_problems.OOP_Problems.Level1Solutions;
import Design_Pattern.Practice_Mid.Code_Smell_and_Refactoring.Area.Area;

public class Level1Solutions {
    public static void main(String[] args) {
        System.out.println("--- Level 1: Student ---");
        Student s1 = new Student();
        s1.name = "Mubin";
        s1.id = 25;
        s1.cgpa = 3.9;
        s1.display();

        System.out.println("\n--- Level 1: Calculator ---");
        Calculator calc = new Calculator();
        System.out.println("Addition (10+5): " + calc.add(10, 5));
        System.out.println("Subtraction (10-5): " + calc.subtract(10, 5));
        System.out.println("Multiplication (10*5): " + calc.multiply(10, 5));
        System.out.println("Division (10/5): " + calc.divide(10, 5));

        System.out.println("\n--- Level 1: Rectangle ---");
        Rectangle rect = new Rectangle();
        rect.length = 10.5;
        rect.width = 5.2;
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}
