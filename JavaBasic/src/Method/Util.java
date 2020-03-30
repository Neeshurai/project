package Method;

public class Util {

	//public static void printSomeJunk(String Args)
	public void printSomeJunk(String Args)//after removing static keyword in main method we can not call directly with class name we have to create instance of the class
	{
		// TODO Auto-generated method stub
	System.out.println("The Junk of the Method is : "+Args);	
	
	}
	protected static int addSomeNumbers(int a, int b)
	{
		// TODO Auto-generated method stub
		int c=a+b;
	//System.out.println("addition of "+a+" and "+b+" is : "+c);	
	return c;
	}
	//private modifier is accessible only its own class we cannot access its in other class
	@SuppressWarnings("unused")
	private static void add10(int a)//when we will change the access modifier from public to protected or private it will give visibility error
	{
		// TODO Auto-generated method stub
		//int c=a+b;
	System.out.println("value after adding no 10 in given number "+a+"  is : "+(a+10));	
	
	}
}
