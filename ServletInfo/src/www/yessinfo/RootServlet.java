package www.yessinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import www.yessinfo.model.User;

/**
 * Servlet implementation class RootServlet
 */
@WebServlet("/")
public class RootServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RootServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String logout=request.getParameter("logout");
		if(logout!=null)
		{
			HttpSession hs=request.getSession();
			
			hs.invalidate();
		}
		else
		{
			HttpSession hs=request.getSession();
			
			User u=(User)hs.getAttribute("user");
			if(u!=null)
			{
				response.sendRedirect("db");
			}
		}
		PrintWriter pw=response.getWriter();
		pw.append("<!DOCTYPE html>");
		pw.append("<html>");
		pw.append("<head>");
		pw.append("<meta charset=\"ISO-8859-1\">");
		pw.append("<title></title>");
		pw.append("</head>");
		pw.append("<body>");
		pw.append("<form action=\"login\"  method=\"get\">");
		pw.append("<b>Please Enter Login Credential</b></br></br>");
		pw.append("User Id :<input type=\"text\" name=\"User_Id\"/></br></br>");
		pw.append("Password :<input type=\"password\" name=\"Password\"/></br></br>");
		pw.append("<input type=\"submit\" value=\"Login\">");
		pw.append("</form>");
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
