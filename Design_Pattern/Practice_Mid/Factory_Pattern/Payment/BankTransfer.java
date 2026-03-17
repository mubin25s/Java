package Design_Pattern.Practice_Mid.Factory_Pattern.Payment;

public class BankTransfer implements payment{
    public void paid(){
        System.out.println("Paid by Bank Transfer");
    }
}
