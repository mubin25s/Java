public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);

        account.setAccountHolder("Bob");

        System.out.println("Holder: " + account.getAccountHolder() + ", Balance: " + account.getBalance());
    }
}