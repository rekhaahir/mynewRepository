package my;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class serv
 */
@WebServlet("/check")
public class check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public check() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   response.setContentType("text/html");
		   PrintWriter System = response.getWriter();
		     
		System.println("<html>");
		System.println("<body>");
		System.println("<h1>"+"hello"+"</h1>");
		
		System.print("hiii");
		System.println("</body>");
		System.println("</html>");
		
		HttpSession session = request.getSession();
		//session.setAttribute("Uname", q.getName());
		session.setAttribute("lid", 2);
//		response.sendredirect(index.jsp);
		
	}

}