package Design_Pattern.Practice_problems.SystemLoggerSolution;

public class SystemLogger {
    private static SystemLogger instance;
    private StringBuilder logs;

    // Private constructor to prevent direct instantiation
    private SystemLogger() {
        logs = new StringBuilder();
        System.out.println("System Logger initialized.");
    }

    // Public method to provide global access to the instance
    public static synchronized SystemLogger getInstance() {
        if (instance == null) {
            instance = new SystemLogger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        logs.append(message).append("\n");
        System.out.println("LOG: " + message);
    }

    // Method to simulate retrieving logs
    public String getLogs() {
        return logs.toString();
    }
}
