package Design_Pattern.Practice_problems.MarketplaceClient;

public class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Bank Transfer Payment of $" + amount);
    }
}
