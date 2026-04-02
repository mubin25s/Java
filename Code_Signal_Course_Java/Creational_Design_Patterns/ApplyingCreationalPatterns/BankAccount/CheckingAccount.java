package Code_Signal_Course_Java.Creational_Design_Patterns.ApplyingCreationalPatterns.BankAccount;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void accountType() {
        System.out.println("This is a Checking Account");
    }
}
