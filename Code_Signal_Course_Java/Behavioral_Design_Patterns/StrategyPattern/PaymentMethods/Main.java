package Code_Signal_Course_Java.Behavioral_Design_Patterns.StrategyPattern.PaymentMethods;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new PaypalStrategy("myemail@example.com", "mypwd"));
        cart.checkout(100);

        cart.setPaymentStrategy(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
        cart.checkout(200);
    }
}
