package Code_Signal_Course_Java.Polymorphism.CurrencyConverter;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println(converter.convert(100));
        System.out.println(converter.convert(100, 1.39));
    }
}