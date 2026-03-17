package Design_Pattern.Practice_problems.SystemLoggerSolution;

public class OnlineExamModule {
    public void startExam(String examName) {
        System.out.println("Starting Exam...");
        SystemLogger logger = SystemLogger.getInstance();
        logger.log("Exam '"+ examName +"' started by OnlineExamModule.");
    }
}
