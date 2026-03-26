package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.BankAccount;

public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void accountType();
}