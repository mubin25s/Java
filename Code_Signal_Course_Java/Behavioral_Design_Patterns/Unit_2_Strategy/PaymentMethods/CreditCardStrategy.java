package Code_Signal_Course_Java.Behavioral_Design_Patterns.Unit_2_Strategy.PaymentMethods;

public class CreditCardStrategy implements PaymentStrategy {
    private String name, cardNumber, cvv, dateOfExpiry;
    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
        this.name = nm; this.cardNumber = ccNum; this.cvv = cvv; this.dateOfExpiry = expiryDate;
    }
    @Override public void pay(int amount) { System.out.println(amount + " paid with credit card"); }
}
