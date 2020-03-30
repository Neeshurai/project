package www.yessinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import www.yessinfo.model.User;
import www.yessinfo.services.UserServices;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet(urlPatterns="/login",initParams={
		@WebInitParam(name="retryCount",value="3")
})
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int failedAttempt;
	private UserServices userservice;
    /**
     * Default constructor. 
     */
    public LoginServelet() {
        // TODO Auto-generated constructor stub
    	failedAttempt=0;
    	userservice=new UserServices();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter PW=response.getWriter();
		
		String user=request.getParameter("User_Id");
		String pass=request.getParameter("Password");
		ServletContext sc=getServletContext();
		//String vuser=sc.getInitParameter("userid");
		//String vpass=sc.getInitParameter("password");
		ServletConfig scg=getServletConfig();
		int retrycount=Integer.parseInt(scg.getInitParameter("retryCount"));
		//if(user.equals(vuser)&& pass.equals(vpass))
		/*Using JDBC*/
		if(userservice.login(user, pass))
		{
		User u=new User("userId","password");
		HttpSession hs=request.getSession();
		hs.setAttribute("user", u);
		PW.append("<b>Welcome to Dashbord<b></br>");
		PW.append("<b>Press Countinue To go ahead<b></br>");
		PW.append("<input type=\"submit\" value=\"Countinue\"<b></br>");
			RequestDispatcher rd=request.getRequestDispatcher("db");
			rd.forward(request, response);
		}
		else
		{
			failedAttempt++;
			if(failedAttempt>retrycount)
			{
				request.setAttribute("UserLocked", true);
			
			}
			PW.append("Invalid User");
			RequestDispatcher rd=request.getRequestDispatcher("error");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
