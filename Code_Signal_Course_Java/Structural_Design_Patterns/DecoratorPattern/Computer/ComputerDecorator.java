package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Computer;

public abstract class ComputerDecorator implements Computer {
    protected Computer decoratedComputer;

    public ComputerDecorator(Computer computer) {
        this.decoratedComputer = computer;
    }

    @Override
    public String assemble() {
        return decoratedComputer.assemble(); // Fix: delegate, don't overwrite
    }
}