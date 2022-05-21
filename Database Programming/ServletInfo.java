import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletInfo extends HttpServlet
{
	public void doGet(HttpServletRequest in,HttpServletResponse out)throws ServletException,IOException

	{

	out.setContentType("text/html");
	PrintWriter p = out.getWriter();
	
	p.println("<HTML>");
	p.println("<BODY>");
	p.println("Info of client:<br>");
	p.println("IP Address:"+in.getRemoteAddr()+"\n<br>");

	p.println("Name: "+ in.getRemoteHost() + "\n<br>");
	p.println("Browser: "+ in.getHeader("User-Agent") + "\n<br>");
	p.println("\nInformation of the server: <br>");
	p.println("Name: "+ in.getServerName() + "\n<br>");
	p.println("Port: "+ in.getServerPort() + "\n<br>");
	p.println("</body>");
	p.println("</html>");
		
	}
}
