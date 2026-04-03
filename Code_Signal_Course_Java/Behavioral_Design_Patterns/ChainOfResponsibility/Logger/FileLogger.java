package Code_Signal_Course_Java.Behavioral_Design_Patterns.ChainOfResponsibility.Logger;

public class FileLogger extends Logger {
    public FileLogger(int level) { this.level = level; }
    @Override protected void write(String message) { System.out.println("File Logger: " + message); }
}
