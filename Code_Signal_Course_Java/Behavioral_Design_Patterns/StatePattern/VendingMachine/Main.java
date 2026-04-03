package Code_Signal_Course_Java.Behavioral_Design_Patterns.StatePattern.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine m = new VendingMachine();
        m.insertCoin();
        m.pushButton();
        m.insertCoin();
        m.ejectCoin();
    }
}
