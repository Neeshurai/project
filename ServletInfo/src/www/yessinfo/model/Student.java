package www.yessinfo.model;

public class Student {

	private int id;
	private String FirstName;
	private String LastName;
	private String PhoneNo;
	private String email;
	private String Address;
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(int id, String firstName, String lastName, String phoneNo,
			String email, String address) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		PhoneNo = phoneNo;
		this.email = email;
		Address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
