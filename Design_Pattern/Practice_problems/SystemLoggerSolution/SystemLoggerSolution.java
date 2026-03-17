package Design_Pattern.Practice_problems.SystemLoggerSolution;
import Java_Project_Package.Course.Course;

public class SystemLoggerSolution {
    public static void main(String[] args) {
        System.out.println("--- System Logger Test ---");

        // Simulate Course Management activity
        CourseManagementModule courseModule = new CourseManagementModule();
        courseModule.createCourse("Design Patterns 101");

        // Simulate Online Exam activity
        OnlineExamModule examModule = new OnlineExamModule();
        examModule.startExam("Midterm Exam");

        // Verify that same instance is used
        SystemLogger loggerInternalRef = SystemLogger.getInstance();
        System.out.println("\n--- Log Verification ---");
        System.out.println(loggerInternalRef.getLogs());

        // Check instance equality just to be sure
        SystemLogger log1 = SystemLogger.getInstance();
        SystemLogger log2 = SystemLogger.getInstance();
        if(log1 == log2) {
             System.out.println("SUCCESS: Both modules used the same SystemLogger instance.");
        } else {
             System.out.println("FAILURE: Different instances were created.");
        }
    }
}
