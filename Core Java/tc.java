import java.util.Timer;
import java.util.TimerTask;

/**
 * 
 */

/**
 * @author padmeshbhalla
 *
 */
public class tc extends TimerTask {

	/**
	 * @param args
	 */
	
	public static int time=0;

	 

    @Override
    public void run() {
        System.out.println("Task is working, seconds count = "+ time++);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Timer timer=new Timer();
	        TimerTask secondCount=new tc();
	        
	        timer.schedule(secondCount , 2000, 5000);
	}

}
