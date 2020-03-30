package www.yessinfo.services;



import www.yessinfo.dao.UserDAO;
import www.yessinfo.model.User;

public class UserServices {
	UserDAO userdao;
	public UserServices()
	{
		userdao=new UserDAO();
	}
	public void close()
	{
		userdao.close();
	}
	public boolean login(String userId,String password)
	{
		boolean result=false;
		User u=userdao.getDetails(userId);
		if(u!=null)
		{
			if(password.equals(u.getPassword()))
			{
				result=true;
			}
		}
		return result;
	}

}
