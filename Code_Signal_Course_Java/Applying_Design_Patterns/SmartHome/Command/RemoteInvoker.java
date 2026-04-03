package Code_Signal_Course_Java.Applying_Design_Patterns.SmartHome.Command;

public class RemoteInvoker {
    private HomeCommand slot;
    public void setCommand(HomeCommand cmd) { this.slot = cmd; }
    public void pressButton() { slot.execute(); }
    public void pressUndo() { slot.undo(); }
}
