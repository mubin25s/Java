package Code_Signal_Course_Java.Behavioral_Design_Patterns.StrategyPattern.PaymentMethods;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy strategy) { this.paymentStrategy = strategy; }
    public void checkout(int amount) { paymentStrategy.pay(amount); }
}
