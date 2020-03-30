package www.yessinfo.services;

import java.util.List;


import www.yessinfo.dao.StudentDAO;
import www.yessinfo.model.Student;

public class StudentServices {
	StudentDAO studentDAO;
	public StudentServices() {
		// TODO Auto-generated constructor stub
		studentDAO=new StudentDAO();
	}
public int add(Student s)
{
	studentDAO.add(s);
	return 0;
}
public List<Student> list()
{
	return studentDAO.list();
}
public void close()
{
	studentDAO.close();
}

}
