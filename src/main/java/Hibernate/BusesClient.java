package Hibernate; /**
 * Created by dann on 20.05.17.
 */
import org.apache.log4j.Logger;

public class BusesClient {
    private static Logger logger = Logger.getLogger(BusesClient.class.getName());
    private void logBasicSystemInfo() {
        logger.info("Launching the application...");
        logger.info("Operating System: " + System.getProperty("os.name") + " "+ System.getProperty("os.version"));logger.info("JRE: " + System.getProperty("java.version"));
        logger.info("Java Launched From: " + System.getProperty("java.home"));
        logger.info("Class Path: " + System.getProperty("java.class.path"));
        logger.info("Library Path: " + System.getProperty("java.library.path"));
        logger.info("User Home Directory: " + System.getProperty("user.home"));
        logger.info("User Working Directory: " + System.getProperty("user.dir"));
        logger.info("Test INFO logging.");
    }
    public BusesClient(){
        logger.debug("TransportClient[0]: starting application.........");
        logger.debug ("sdfsdfs");
        logger.debug("");
    }
}