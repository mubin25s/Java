package Code_Signal_Course_Java.Applying_Design_Patterns.SmartHome.Command;

public class OpenGateCommand implements HomeCommand {
    private SmartGate gate;
    public OpenGateCommand(SmartGate g) { this.gate = g; }
    @Override public void execute() { gate.open(); }
    @Override public void undo() { gate.close(); }
}
