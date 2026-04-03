package Code_Signal_Course_Java.Behavioral_Design_Patterns.ChainOfResponsibility.Logger;

public abstract class Logger {
    public static int INFO = 1, DEBUG = 2, ERROR = 3;
    protected int level;
    protected Logger next;

    public void setNext(Logger l) { this.next = l; }
    public void logMessage(int level, String message) {
        if (this.level <= level) { write(message); }
        if (next != null) { next.logMessage(level, message); }
    }
    protected abstract void write(String message);
}
