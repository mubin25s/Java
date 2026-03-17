package Design_Pattern.Practice_problems.OOP_Problems.Level3Solutions;

public class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
