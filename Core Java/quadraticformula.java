package quadraticformula;

import java.util.Scanner;


public class quadraticformula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
	    Scanner input = new Scanner(System.in);
		
	    System.out.println("Enter value of a:");

		
	    int a = input.nextInt();
	    
 System.out.println("Enter value of b:");

		
	    int b = input.nextInt();
	    
 System.out.println("Enter value of c:");

		
	    int c = input.nextInt();
	    
	   
	    
	    System.out.println("The equation is: "+a+"x"+ "\u00B2"+" + "+b+"x +"+c+" = 0" );
	    
	   double d = (b*b)- (4*a*c);
	    double root1 = ((-b + (Math.sqrt(d)))/2*a) ;

	    double root2 = ((-b - (Math.sqrt(d)))/2*a) ;
	    
	    System.out.println("The roots of the equation are: "+ root1 +" and "+root2+"." );
	    
	    input.close();
	    

	}

}
