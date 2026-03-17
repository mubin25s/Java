package Design_Pattern.Practice_problems.MarketplaceClient;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of $" + amount);
    }
}
