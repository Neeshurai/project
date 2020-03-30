package www.yessinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBServlet
 */
@WebServlet("/db")
public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();	
		pw.append("<!DOCTYPE html>");
		pw.append("<html>");
		pw.append("<head>");
		pw.append("<meta charset=\"ISO-8859-1\">");
		pw.append("<title>Insert title here</title>");
		pw.append("</head>");
		pw.append("<body>");
		
		pw.append("<h1 >SMS APP</h1>");
		pw.append("<form action=\"./\">");
		pw.append("<input type=\"hidden\" name=\"logout\"/> ");
		pw.append("<input type=\"submit\" value =\"Logout\" style=\"align:left\"/ > ");
		pw.append("</form>");
		pw.append("<ul>");
		pw.append("<li><a href=\"db\">Home</a></li>");
		pw.append("<li><a href=\"Student\">Student Detail</a></li>");
		pw.append("<li><a href=\"Artical\">Articals</a></li>");
		pw.append("<li><a href=\"about\">About SMS</a></li>");
		pw.append("</ul>");
		
		pw.append("</body>");
		pw.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
