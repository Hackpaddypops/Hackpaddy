import org.json.simple.JSONObject;



/**
 * 
 */

/**
 * @author padmeshbhalla
 *
 */
public class jsonencode {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		JSONObject encodingobj = new JSONObject();

	      try {
	    	  encodingobj.put("name", "foo");
	    	  encodingobj.put("num", new Integer(100));
	    	  encodingobj.put("balance", new Double(1000.21));
	    	  encodingobj.put("is_vip", new Boolean(true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      

	      System.out.print(encodingobj);	
	 	     
	      
	}

}
