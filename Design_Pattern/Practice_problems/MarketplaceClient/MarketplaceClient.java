package Design_Pattern.Practice_problems.MarketplaceClient;
import Design_Pattern.Practice_Mid.Factory_Pattern.Payment.BankTransfer;
import Java_Project_Package.Chat.User;

public class MarketplaceClient {
    public static void main(String[] args) {
        try {
            // User selects different payment methods
            Payment payment1 = PaymentFactory.createPayment("CreditCard");
            payment1.pay(150.00);

            Payment payment2 = PaymentFactory.createPayment("PayPal");
            payment2.pay(50.50);

            Payment payment3 = PaymentFactory.createPayment("BankTransfer");
            payment3.pay(1000.00);

            // Test unknown payment type
            // Payment payment4 = PaymentFactory.createPayment("Bitcoin");
            // payment4.pay(10.00);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
