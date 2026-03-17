package Design_Pattern.Practice_Mid.Singleton.SystemLogger;
import Design_Pattern.Practice_Mid.Singleton.Singleton;

public class OnlineExamModule {
    public void exam() {
        // Access (object) same SystemLogger instance
        SystemLogger logger = SystemLogger.methodLogger();
        logger.log("Online exam successful");
    }
}
