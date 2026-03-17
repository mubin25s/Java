package Design_Pattern.Practice_problems.OOP_Problems.Level3Solutions;

public class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
