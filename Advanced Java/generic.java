import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 */

/**
 * @author root
 *
 */
public class generic extends GenericServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter pwriter=res.getWriter();
		pwriter.print("<html>");
		pwriter.print("<body>");
		pwriter.print("<h2>Generic Servlet Example</h2>");
		pwriter.print("Padmesh Bhalla, Welcome to my Servlet.");
		pwriter.print("</body>");
		pwriter.print("</html>");
		}
}
