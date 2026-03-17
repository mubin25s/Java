package Design_Pattern.Practice_problems.SystemLoggerSolution;
import Java_Project_Package.Course.Course;

public class CourseManagementModule {
    public void createCourse(String courseName) {
        System.out.println("Processing Course Creation...");
        SystemLogger logger = SystemLogger.getInstance();
        logger.log("Course '"+ courseName +"' created by CourseManagementModule.");
    }
}
