package Code_Signal_Course_Java.Behavioral_Design_Patterns.StatePattern.VendingMachine;

public class NoCoinState implements State {
    VendingMachine machine;
    public NoCoinState(VendingMachine m) { this.machine = m; }
    @Override public void insertCoin() { System.out.println("Coin inserted"); machine.setState(machine.getHasCoinState()); }
    @Override public void ejectCoin() { System.out.println("No coin to eject"); }
    @Override public void pushButton() { System.out.println("Insert coin first"); }
    @Override public void dispense() { System.out.println("No item dispensed"); }
}
