package Design_Pattern.Practice_Mid.Singleton.SystemLogger;

import Java_Project_Package.Course.Course;
import Design_Pattern.Practice_Mid.Singleton.Singleton;

public class CourseManagementModule {
    public void course() {
        // Access (object) same SystemLogger instance
        SystemLogger logger = SystemLogger.methodLogger();
        logger.log("Course management successful");
    }
}
