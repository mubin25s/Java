package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Bank_Account;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount.AccountBuilder("123456789", 1000.00)
                .withOverdraftProtection(true)
                .withInternationalTransactions(true)
                .withOnlineBankingAccess(true)
                .build();

        System.out.println(account);
    }
}