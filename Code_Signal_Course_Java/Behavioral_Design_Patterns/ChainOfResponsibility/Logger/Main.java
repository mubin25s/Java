package Code_Signal_Course_Java.Behavioral_Design_Patterns.ChainOfResponsibility.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        logger.setNext(fileLogger);
        fileLogger.setNext(consoleLogger);

        logger.logMessage(Logger.INFO, "This is an information.");
        logger.logMessage(Logger.DEBUG, "This is a debug level information.");
        logger.logMessage(Logger.ERROR, "This is an error information.");
    }
}
