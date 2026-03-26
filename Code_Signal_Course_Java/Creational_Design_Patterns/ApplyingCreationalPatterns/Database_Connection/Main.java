package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Database_Connection;

public class Main {
    public static void main(String[] args) {
        // Singleton
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.connect();

        // Factory
        BankAccount savingsAccount  = BankAccountFactory.createAccount("Savings",  "123456", 1000.00, "Individual");
        BankAccount checkingAccount = BankAccountFactory.createAccount("Checking", "654321",  500.00, "Business");
        savingsAccount.accountDetails();
        checkingAccount.accountDetails();

        // Builder
        LoanApplication loanApplication = new LoanApplication.LoanApplicationBuilder("Alice", 50000.00)
                .withTermLength(15)
                .withCollateral("House")
                .withInterestRate(3.5)
                .build();
        System.out.println(loanApplication);
    }
}