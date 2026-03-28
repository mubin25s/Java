package Code_Signal_Course_Java.Creational_Design_Patterns.ApplyingCreationalPatterns.BankAccount;

public class BankAccountFactory {

    public static BankAccount createAccount(String type, String accountNumber, double balance) {
        switch (type) {
            case "Savings":
                return new SavingsAccount(accountNumber, balance);
            case "Checking":
                return new CheckingAccount(accountNumber, balance);
            default:
                throw new IllegalArgumentException("Unknown account type: " + type);
        }
    }
}               