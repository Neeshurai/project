package www.yessinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class AboutServlet
 */
@WebServlet("/about")
public class AboutServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public AboutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		pw.append("<!DOCTYPE html>");
		pw.append("<html>");
		pw.append("<head>");
		pw.append("<meta charset=\"ISO-8859-1\">");
		pw.append("<title>SMS About</title>");
		pw.append("</head>");
		pw.append("<body>");
		pw.append("<h1>About SMS App</h1>");
		pw.append("<h2>SMS is School Management System</h2>");
		pw.append("<h3>It Automates all school activity</h3>");
		pw.append("</body>");
		pw.append("</html>");
	}

}
