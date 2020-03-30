package www.yessinfo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import www.yessinfo.model.User;
import www.yessinfo.util.Constant;

public class UserDAO {
	Connection c;
	public UserDAO()
	{
		
				
		try{
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection(Constant.DB_URL,Constant.DB_Name,Constant.DB_PASSWORD);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		// TODO Auto-generated constructor stub
		public User getDetails(String userId)
		{
			System.out.print(userId);
			User u=null;
			try{
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery("select `id`,`password`from sms.user where `name`='"+userId+"'");
			if(r.next())
			{
				int id=r.getInt(1);
				String password=r.getString(2);
			
			u=new User(userId,password);
			}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return u;
		}
	public void close() 
	{
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
