package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log {
	
	private static final Logger logger = LogManager.getLogger();
	
	public static void logInfo(String name) {
		logger.info(name);
	}

	public static void logWarning(String name) {
		logger.warn(name);
	}
	
	public static void logError(String name) {
		logger.error(name);
	}
	
	public static void logDebug(String name) {
		logger.debug(name);
	}
}
