package Code_Signal_Course_Java.Behavioral_Design_Patterns.StrategyPattern.PaymentMethods;

public class PaypalStrategy implements PaymentStrategy {
    private String emailId, password;
    public PaypalStrategy(String email, String pwd) { this.emailId = email; this.password = pwd; }
    @Override public void pay(int amount) { System.out.println(amount + " paid using Paypal."); }
}
