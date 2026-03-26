package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Database_Connection;

public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;
    protected String accountType;

    public BankAccount(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public abstract void accountDetails();
}