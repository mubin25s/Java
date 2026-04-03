package Code_Signal_Course_Java.Behavioral_Design_Patterns.StatePattern.VendingMachine;

public class HasCoinState implements State {
    VendingMachine machine;
    public HasCoinState(VendingMachine m) { this.machine = m; }
    @Override public void insertCoin() { System.out.println("Coin already inserted"); }
    @Override public void ejectCoin() { System.out.println("Coin ejected"); machine.setState(machine.getNoCoinState()); }
    @Override public void pushButton() { System.out.println("Button pushed"); machine.setState(machine.getSoldState()); }
    @Override public void dispense() { System.out.println("Push button first"); }
}
