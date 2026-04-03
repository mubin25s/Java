package Code_Signal_Course_Java.Behavioral_Design_Patterns.StatePattern.VendingMachine;

public class SoldState implements State {
    VendingMachine machine;
    public SoldState(VendingMachine m) { this.machine = m; }
    @Override public void insertCoin() { System.out.println("Wait, dispensing item"); }
    @Override public void ejectCoin() { System.out.println("Coin already accepted"); }
    @Override public void pushButton() { System.out.println("Pushing twice doesn't help"); }
    @Override public void dispense() { System.out.println("Item dispensed"); machine.setState(machine.getNoCoinState()); }
}
