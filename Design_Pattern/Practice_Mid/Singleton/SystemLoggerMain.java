package Design_Pattern.Practice_Mid.Singleton;
import Design_Pattern.Practice_Mid.Singleton.SystemLogger.CourseManagementModule;
import Design_Pattern.Practice_Mid.Singleton.SystemLogger.OnlineExamModule;
import Design_Pattern.Practice_Mid.Singleton.SystemLogger.SystemLogger;

public class SystemLoggerMain {
    public static void main(String[] args) {
        CourseManagementModule c = new CourseManagementModule();
        OnlineExamModule e = new OnlineExamModule();

        c.course();
        e.exam();

        // Checking if both modules use same logger
        SystemLogger logger1 = SystemLogger.methodLogger();
        SystemLogger logger2 = SystemLogger.methodLogger();

        System.out.println("Same instance: " + (logger1 == logger2));
    }
}