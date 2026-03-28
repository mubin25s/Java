package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Computer;

public class GamingComputer extends ComputerDecorator {
    public GamingComputer(Computer computer) {
        super(computer);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Gaming Features";
    }
}