/**
 * 
 */
package logclass;
import java.util.logging.Level;  

import java.util.logging.Logger;  

import java.util.logging.*;  

/**
 * @author root
 *
 */
public class logclass {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);  
log.log(Level.INFO, "My first Log Message"); 
LogManager lm = LogManager.getLogManager();

Logger lg = lm.getLogger(Logger.GLOBAL_LOGGER_NAME);  
lg.log(Level.INFO, "This is a log message");  
	   
	}

}
