package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Database_Connection;

public class BankAccountFactory {

    public static BankAccount createAccount(String type, String accountNumber, double balance, String accountType) {
        switch (type) {
            case "Savings":
                return new SavingsAccount(accountNumber, balance, accountType);
            case "Checking":
                return new CheckingAccount(accountNumber, balance, accountType);
            default:
                throw new IllegalArgumentException("Unknown account type: " + type);
        }
    }
}