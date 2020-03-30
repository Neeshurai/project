package oops_concept;

class Super 
{
	String Name;
	String Address;
	int street, banglowNo;
	
	void detail(String Name,String Address,int street,int banglowNo)
	{
		System.out.println("Name :"+Name);
		System.out.println("Address :"+Address);
		System.out.println("banglowNumber :"+banglowNo);
		System.out.println("Street :"+street);
		System.out.println("This is the Detail of the Fater class");
	}
	
}
	class Sub extends Super
	{
		String Name;
		public Sub()
		{
			System.out.println("This is the SubClass or Derived class constructor");
			
		}
		void StuDetail(String Father_Name,String Name,String Address,int street,int banglowNo)
		{
			
			Father_Name=super.Name;
			this.Name=Name;
			Address=super.Address;
			banglowNo=super.banglowNo;
			street=super.street;
			System.out.println("Father's Name of the student is :" +Father_Name);
			System.out.println("Name :"+Name);
			System.out.println("Father Name :"+super.Name);
			System.out.println("Address :"+super.Address);
			System.out.println("banglowNumber :"+super.banglowNo);
			System.out.println("Street :"+super.street);
			System.out.println("This is the Detail of the Student class");
		}
		
	}
	class Inheritence{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Super S=new Super();
		
		Sub Student=new Sub();
		
		Student.detail("Name","Address",54,758623);
		
		
		
	}

}
