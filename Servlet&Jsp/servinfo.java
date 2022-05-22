import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class servinfo extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
 
		
		PrintWriter pr = res.getWriter();
		pr.println("<html>");
		pr.println("<body>");
		pr.println("Server Name is: " + req.getServerName() +"<br>");
		pr.println("Server Port is: " + req.getServerPort() + "<br>");
		pr.println("Server Remote Addr is: " + req.getRemoteAddr() + "<br>");
		pr.println("Server Remote Host is: " + req.getRemoteHost() + "<br>");
		pr.println("</body>");
		pr.println("</html>");
	}

}
