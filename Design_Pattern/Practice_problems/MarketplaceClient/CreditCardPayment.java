package Design_Pattern.Practice_problems.MarketplaceClient;
import Design_Pattern.Practice_Mid.Factory_Pattern.Payment.Card;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount);
    }
}
