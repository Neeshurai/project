package javaCollections;

import java.util.*;


public class ListClass {

	public ListClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>employee=new ArrayList<Employee>();
		Employee emp=new Employee("jai",37,"Pune,Maharastra",2000.50,"Cleark");
		Employee emp1=new Employee("jaya",37,"Pune,Maharastra",5500.50,"Headmaster");
		Employee emp2=new Employee("jann",37,"Pune,Maharastra",4000.50,"Teacher");
		employee.add(emp);
		employee.add(emp1);
		employee.add(emp2);
		//System.out.println(employee);
		
		
		HashSet<Employee>employ=new HashSet<Employee>();
		Employee emp3=new Employee("jai",37,"Pune,Maharastra",45200.50,"Selfemployed");
		Employee emp4=new Employee("jaya",37,"Pune,Maharastra",45200.00,"Selfemployed");
		Employee emp5=new Employee("jann",37,"Pune,Maharastra",45500.50,"Selfemployed");
		employ.add(emp3);
		employ.add(emp4);
		employ.add(emp5);
		System.out.println(employ);
		
		ArrayList<Employee> e=new ArrayList<Employee>(employ);
		Collections.sort(e);
	}

}
