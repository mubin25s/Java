package Code_Signal_Course_Java.OOP_Concepts.Polymorphism.Calculator;
import Object_Oriented_Programming.four_pillars.Polymorphism.Polymorphism;

public class Calculator {
    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}