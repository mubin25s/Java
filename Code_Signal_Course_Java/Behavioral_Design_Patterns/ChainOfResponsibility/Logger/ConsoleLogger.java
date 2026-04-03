package Code_Signal_Course_Java.Behavioral_Design_Patterns.ChainOfResponsibility.Logger;

public class ConsoleLogger extends Logger {
    public ConsoleLogger(int level) { this.level = level; }
    @Override protected void write(String message) { System.out.println("Standard Console Logger: " + message); }
}
