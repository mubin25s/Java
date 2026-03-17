package Java_Project_Package.ATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(1000.0);
        atm.checkBalance();
        atm.deposit(500);
        atm.withdraw(200);
        atm.checkBalance();
    }
}
