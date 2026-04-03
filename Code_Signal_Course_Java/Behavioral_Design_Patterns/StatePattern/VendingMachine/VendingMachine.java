package Code_Signal_Course_Java.Behavioral_Design_Patterns.StatePattern.VendingMachine;

public class VendingMachine {
    private State noCoinState, hasCoinState, soldState, state;
    public VendingMachine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        state = noCoinState;
    }
    public void setState(State state) { this.state = state; }
    public void insertCoin() { state.insertCoin(); }
    public void ejectCoin() { state.ejectCoin(); }
    public void pushButton() { state.pushButton(); state.dispense(); }
    public State getNoCoinState() { return noCoinState; }
    public State getHasCoinState() { return hasCoinState; }
    public State getSoldState() { return soldState; }
}
