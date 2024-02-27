import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 
 */

/**
 * @author padmeshbhalla
 *
 */
public class Test {

	/**
	 * @param args
	 */
	
	 protected static Test obj;  
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		obj = new Test();  

        

        //creating a new instance of timer class  

        Timer timer = new Timer();  

        TimerTask task = new timers();  

   

        //instance of date object for fixed-rate execution  

        Date date = new Date();  

   

        timer.scheduleAtFixedRate(task, date, 5000);  

           

        System.out.println("Timer running");  

        synchronized(obj)  

        {  

            //make the main thread wait  

            obj.wait();  

               

            //once timer has scheduled the task 4 times,   

            //main thread resumes  

            //and terminates the timer  

            timer.cancel();  

               

            //purge is used to remove all cancelled   

            //tasks from the timer'stak queue  

            System.out.println(timer.purge());  

        }  
	}

}
