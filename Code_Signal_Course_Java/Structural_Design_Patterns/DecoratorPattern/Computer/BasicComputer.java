package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Computer;

public class BasicComputer implements Computer {
    @Override
    public String assemble() {
        return "Basic Computer";
    }
}