package Code_Signal_Course_Java.Polymorphism.CurrencyConverter;

public class CurrencyConverter {
    public double convert(double amount) {
        return amount * 0.84;
    }

    public double convert(double amount, double rate) {
        return amount * rate;
    }
}