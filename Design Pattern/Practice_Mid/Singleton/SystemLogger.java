public class SystemLogger {
    // private object
    private static SystemLogger instance;

    // private constructor
    private SystemLogger() {
        System.out.println("Login successfull");
    }

    // public method for creating OBJECT
    public static SystemLogger methodLogger() {
        if (instance == null) {
            instance= new SystemLogger();
        }
        return instance;
    }

    // method normal
    public void log(String msg) {
        System.out.println(msg);
    }
}

class CourseManagementModule {
    public void cousrse() {
        // Access (object) same SystemLogger instance
        SystemLogger logger = SystemLogger.methodLogger();
        logger.log("Course management successful");
    }
}

class OnlineExamModule {
    public void exam() {
        // Access (object) same SystemLogger instance
        SystemLogger logger = SystemLogger.methodLogger();
        logger.log("Online exam successful");
    }
}

class Main{
    public static void main(String[] args) {
        CourseManagementModule c= new CourseManagementModule();
        OnlineExamModule e= new OnlineExamModule();

        c.cousrse();
        e.exam();

        // Checking if both modules use same logger
        SystemLogger logger1= SystemLogger.methodLogger();
        SystemLogger logger2= SystemLogger.methodLogger();

        System.out.println(logger1==logger2);
    }
} {
    
}
