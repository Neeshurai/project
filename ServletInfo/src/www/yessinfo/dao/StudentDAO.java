package www.yessinfo.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import www.yessinfo.model.Student;
import www.yessinfo.util.Constant;



public class StudentDAO
{
	Connection c;
	List<Student>list;
	public StudentDAO()
	{
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection(Constant.DB_URL,Constant.DB_Name,Constant.DB_PASSWORD);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void add(Student s)
	{try{
		//Statement st=c.createStatement();
		//String string="insert into sms.student (id,firstname,lastname,phone,email,address)values("+s.getId()+",'"+s.getFirstName()+"','"+s.getLastName()+"','"+s.getPhoneNo()+"','"+s.getEmail()+"','"+s.getAddress()+"');";
		//int r=st.executeUpdate(string);
		//String string="insert into sms.student (id,firstname,lastname,phone,email,address)values(?,?,?,?,?,?)";
		/*****Removing primary key*/
		//String string="insert into sms.student (id,firstname,lastname,phone,email,address)values(?,?,?,?,?)";
		String string="insert into sms.student (firstname,lastname,phone,email,address)values(?,?,?,?,?)";
		PreparedStatement st=c.prepareStatement(string);
		//st.setInt(1,s.getId());
		st.setString(1, s.getFirstName());
		st.setString(2, s.getLastName());
		st.setString(3, s.getPhoneNo());
		st.setString(4, s.getEmail());
		st.setString(5, s.getAddress());
		System.out.println(string);
		int r=st.executeUpdate();
		System.out.print(r +": Rows updated");
	}catch(SQLException e)
	{
		e.printStackTrace();
	}
		
	}
	
	public List<Student> list()
	{
		list=new ArrayList<Student>();
		try
		{
		Statement st=c.createStatement();
		ResultSet r=st.executeQuery("select id, firstname,lastname,phone,email,address from sms.student;");
		while(r.next())
		{
				int id=r.getInt(1);
				String Fname=r.getString(2);
				String Lname=r.getString(3);
				String Phoneno=r.getString(4);
				String Email=r.getString(5);
				String Address=r.getString(6);
				Student student=new Student(id,Fname,Lname,Phoneno,Email,Address);
				list.add(student);
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	return list;
		
	}
	
	public void close() {
		// TODO Auto-generated method stub
		if(c!=null)
		{
			try{
				c.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
