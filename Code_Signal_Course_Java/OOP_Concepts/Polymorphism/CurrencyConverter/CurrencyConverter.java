package Code_Signal_Course_Java.OOP_Concepts.Polymorphism.CurrencyConverter;
import Object_Oriented_Programming.four_pillars.Polymorphism.Polymorphism;

public class CurrencyConverter {
    public double convert(double amount) {
        return amount * 0.84;
    }

    public double convert(double amount, double rate) {
        return amount * rate;
    }
}