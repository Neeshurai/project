package basic;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//integer variable
		int x=24;//assignment Operator
		System.out.println("Value of x :"+x);
		x=34;//Value of variable may be change
		System.out.println("New Value of x :"+x);
		//Use of arithmetic operator
		System.out.println("Plus Operator :"+(x+4));
		System.out.println("Minus Operator :"+(x-4));
		System.out.println("Post Increment Operator :"+(x++));
		System.out.println("PreIncrement Operator :"+(++x));
		System.out.println("Post Decrement Operator :"+(x--));
		System.out.println("Pre Decrement Operator :"+(--x));
		//String variable
		String Word;
		Word="I Love my India";
		
		System.out.println(Word);
		//String Operator
		Word="This is my world "+Word;//Concatenation
		System.out.println("New String"+Word);
		System.out.println("Size of String :"+Word.length());
		
	}

}
