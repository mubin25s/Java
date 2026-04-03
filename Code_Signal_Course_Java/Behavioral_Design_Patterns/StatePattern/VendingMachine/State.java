package Code_Signal_Course_Java.Behavioral_Design_Patterns.StatePattern.VendingMachine;

public interface State {
    void insertCoin();
    void ejectCoin();
    void pushButton();
    void dispense();
}
