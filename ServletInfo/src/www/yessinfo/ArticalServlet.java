package www.yessinfo;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Artical
 */
@WebServlet("/Artical")
public class ArticalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String search=request.getParameter("search");
		if(search!=null)
		{
			Cookie c=new Cookie("artical",search);
			response.addCookie(c);
		String url="http://www.google.com/search?q="+search;
		response.sendRedirect(url);
		}
		else
		{
			pw.append("<!DOCTYPE html>");
			pw.append("<html>");
			pw.append("<head>");
			pw.append("<meta charset=\"ISO-8859-1\">");
			pw.append("<title>Insert title here</title>");
			pw.append("</head>");
			pw.append("<body>");
			pw.append("<form action=\"Artical\">");
			pw.append("<input name=\"search\"/>");
			pw.append("<input type=\"submit\" value=\"Search\"/>");
			pw.append("</form>");
			Cookie []cArray=request.getCookies();
			for(Cookie c:cArray)
			{
			pw.append("<h1>"+c.getValue()+"</h1>");
			}
			pw.append("</body>");
			pw.append("</html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
