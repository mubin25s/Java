package Code_Signal_Course_Java.Creational_Design_Patterns.ApplyingCreationalPatterns.BankAccount;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void accountType() {
        System.out.println("This is a Savings Account");
    }
}