package www.yessinfo;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

//import javax.servlet.annotation.WebInitParam;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorServlet
 *///
@WebServlet("/error")

public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int flag;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorServlet() {
        super();
        // TODO Auto-generated constructor stub
        flag=0;
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
		
		pw.append("<form action=\"index.html\">");
		pw.append("Invalid User Fetched...</br></br>");
		
		
		//request.getAttribute("UserLocked");
		Boolean locked = (Boolean) request.getAttribute("UserLocked");
		if(locked != null && locked)
		{
			pw.append("User is locked so not able to login again");
		}
		else
		{
			pw.append("click <input type=\"submit\" Value=\"Login\"/> To login again");
		}
			
		pw.append("</form>");
		pw.append("</body>");
		pw.append("</html>");
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
