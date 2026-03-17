package Design_Pattern.Practice_Mid.Factory_Pattern.Payment;

public class Payment {
    public static void main(String[] args) {
        payment p = PaymentFactory.getPayment("Card");
        p.paid();
    }
}
