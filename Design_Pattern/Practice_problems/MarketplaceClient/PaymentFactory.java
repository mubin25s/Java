package Design_Pattern.Practice_problems.MarketplaceClient;

public class PaymentFactory {
    public static Payment createPayment(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            case "banktransfer":
                return new BankTransferPayment();
            default:
                throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}
