package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Database_Connection;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance, String accountType) {
        super(accountNumber, balance, accountType);
    }

    @Override
    public void accountDetails() {
        System.out.println("Checking Account [Account Number=" + accountNumber +
                           ", Balance=" + balance +
                           ", Account Type=" + accountType + "]");
    }
}