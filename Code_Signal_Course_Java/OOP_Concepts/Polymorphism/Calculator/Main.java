package Code_Signal_Course_Java.OOP_Concepts.Polymorphism.Calculator;
import Object_Oriented_Programming.four_pillars.Polymorphism.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.calculate(5, 7));
        System.out.println(calc.calculate(2.0, 3.0));
    }
}