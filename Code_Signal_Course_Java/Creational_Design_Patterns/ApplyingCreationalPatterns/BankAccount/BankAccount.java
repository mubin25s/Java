package Code_Signal_Course_Java.Creational_Design_Patterns.ApplyingCreationalPatterns.BankAccount;

public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void accountType();
}