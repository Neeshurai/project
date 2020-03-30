package www.yessinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import www.yessinfo.services.StudentServices;

/**
 * Servlet implementation class Student
 */
@WebServlet("/Student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       StudentServices ss;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String fname=request.getParameter("fname");
		boolean duplicateId=false;
		if(fname!=null && fname.length()>0)
		{
			/*int lastid=Integer.parseInt(request.getParameter("Last_id"));
			int currentid=Integer.parseInt(id);
			if(currentid>lastid)
			{*/
			/*www.yessinfo.model.Student s=new www.yessinfo.model.Student(currentid,request.getParameter("fname"),request.getParameter("lname")
						,request.getParameter("phone"), request.getParameter("email"),request.getParameter("add"));*/
			www.yessinfo.model.Student s=new www.yessinfo.model.Student(0,request.getParameter("fname"),request.getParameter("lname")
								,request.getParameter("phone"), request.getParameter("email"),request.getParameter("add"));
			ss.add(s);
			/*}
			/*else
			{
				duplicateId=true;
			}*/
		}
		else
		{
			//id="0";
		}
		pw.append("<!DOCTYPE html>");
		pw.append("<html>");
		pw.append("<head>");
		pw.append("<meta charset=\"ISO-8859-1\">");
		pw.append("<title>Student Detail</title>");
		pw.append("</head>");
		pw.append("<body>");
		pw.append("<form action=\"Student\">");
		if(duplicateId==true)
		{
		pw.append("<b>Unable to add detail: As duplicate id</b></br>");
		}
		//pw.append("Id:<input name=\"id\"/></br>");
		pw.append("	First Name :<input name=\"fname\"/></br>");
		pw.append("Last Name :<input name=\"lname\"/></br>");
		pw.append("Phone Number :<input name=\"phone\"/></br>");
		pw.append("Email :<input name=\"email\"/></br>");
		pw.append("Address :<input name=\"add\"/></br>");
		pw.append("<input type=\"submit\" value=\"Add\"/>");
		//pw.append("<input type=\"hidden\" name=\"Last_id\" value=\""+id+"\"/>");
		pw.append("</form>");
		pw.append("<table>");
		pw.append("<tr>");
		//pw.append("<th>ID</th>");
		pw.append("<th>First Name</th>");
		pw.append("<th>Last Name</th>");
		pw.append("<th>Phone No</th>");
		pw.append("<th>Email</th>");
		pw.append("<th>Address</th>");
		pw.append("</tr>");
		List<www.yessinfo.model.Student>l=ss.list();
		for(www.yessinfo.model.Student s:l)
		{
		pw.append("<tr>");
		pw.append("<td>"+s.getId()+"</td>");
		pw.append("<td>"+s.getFirstName()+"</td>");
		pw.append("	<td>"+s.getLastName()+"</td>");
		pw.append("<td>"+s.getPhoneNo()+"</td>");
		pw.append("<td>"+s.getEmail()+"</td>");
		pw.append("<td>"+s.getAddress()+"</td>");
		pw.append("</tr>");
		}
		pw.append("</table>");
		pw.append("</body>");
		pw.append("</html>");
		
	}
@Override
public void init()
{
	ss =new StudentServices();
}
@Override
public void destroy()
{
	ss.close();
	ss =null;
}
/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
