package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Computer;
public class WorkstationComputer extends ComputerDecorator {
    public WorkstationComputer(Computer computer) {
        super(computer);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Workstation Features";
    }
}