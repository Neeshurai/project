package javaCollections;

public class Employee implements Comparable<Employee> {
	private String name;
	private int age;
	private String address;
	private double salary;
	private String departmentName;
	public Employee(String name, int age, String address,double sallary, String departmentName) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary=sallary;
		this.departmentName=departmentName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double sallary) {
		this.salary = sallary;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address="
				+ address + ", salary=" + salary + ", departmentName="
				+ departmentName + "]";
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if(this.salary>e.salary)
		{
			return -1;
		}
		else if(this.salary<e.salary)
		{
			return 1;
		}
		return 0;
	}
	
}
