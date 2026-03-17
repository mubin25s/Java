package Code_Signal_Course_Java.Polymorphism.Calculator;

public class Calculator {
    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}