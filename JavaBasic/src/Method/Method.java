package Method;


public class Method {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Util util=new Util();//Default constructor will call when creating Object
		//Util.printSomeJunk("20");non static method
		util.printSomeJunk("hello this is the junk message");
		//Util.add10(20);
		int addition=Util.addSomeNumbers(50,29);//We cat not print the value of addition because this is the
		System.out.println("addition value of given no's is :"+addition);
	}

}
