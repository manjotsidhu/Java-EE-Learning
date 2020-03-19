package servlets.one;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (
		description = "My First Servlet",
		urlPatterns = { "/FirstServlet" },
		initParams = {
				@WebInitParam (name = "name", value = "")
		}
)
public class FirstServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		System.out.println("FirstServlet Initialized");
		System.out.println("User: "+ getServletContext().getInitParameter("name"));
		// TODO
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Post Request");
		System.out.println("ServletContext User: "+ getServletContext().getInitParameter("name"));
		System.out.println("User: "+ request.getParameter("name"));
		
		try {
			response.sendRedirect("greet.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
