/**
 * 
 */
package beans;

/**
 * @author root
 *
 */
public class sbeans implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName = null;
	   private String lastName = null;
	

	   public sbeans() {
	   }
	   public String getFirstName(){
	      return firstName;
	   }
	   public String getLastName(){
	      return lastName;
	   }
	  
	   public void setFirstName(String firstName){
	      this.firstName = firstName;
	   }
	   public void setLastName(String lastName){
	      this.lastName = lastName;
	   }
	  
}
