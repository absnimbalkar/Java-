import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class welcome extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter pr = res.getWriter();
		pr.println("<h1>Welcome</h1>");
	}
}

