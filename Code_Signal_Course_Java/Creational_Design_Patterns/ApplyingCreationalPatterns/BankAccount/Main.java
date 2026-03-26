package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = BankAccountFactory.createAccount("Savings", "SAV-001", 5000.00);
        savings.accountType();

        BankAccount checking = BankAccountFactory.createAccount("Checking", "CHK-001", 3000.00);
        checking.accountType();
    }
}