/**
 * 
 */
package arraylistprac;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author padmeshbhalla
 *
 */
public class arraylistprac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    Collections.sort(cars);  
	    for (String i : cars) {
	      System.out.println(i);
	    }
	    
	    cars.set(0, "Opel"); 

	    System.out.println(cars);
	    
	    cars.remove(0);
	    System.out.println(cars);
	    cars.clear(); 
	    System.out.println(cars);
	    
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(10);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(25);
	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	}

}
