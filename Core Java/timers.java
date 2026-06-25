import java.util.TimerTask;

/**
 * 
 */

/**
 * @author padmeshbhalla
 *
 */
public class timers extends TimerTask{

	/**
	 * @param args
	 */
	
	public static int i = 0;  

    public void run()  

    {  

        System.out.println("Timer ran " + ++i);  

        if(i == 4)  

        {  

            synchronized(Test.obj)  

            {  

                Test.obj.notify();  

            }  

        }  

    }  
	
}
