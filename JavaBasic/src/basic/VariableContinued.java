package basic;

public class VariableContinued {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We can change the value of these variables as per our need variables are the bucket of the same datatype we can not store different type datatype values
		int var=1000000;//can content 32 bit value
		System.out.println("Integer value :"+var);
		long bigvar=1000000000000000L;//after adding L compiler will understand that this is the long it will store lorge ammount of with enough capacity value
		System.out.println("Long Variable value :"+bigvar);
		short val=32767;//short variable can store data from -32767 to 32767
		System.out.println("Short Variable value :"+val);
		byte reallysmallnum=127;//byte type datatype can store data from -128 to 12
		System.out.println("Byte Variable value :"+reallysmallnum);
		double decimalNum=394.003;
		System.out.println("Double Variable value :"+decimalNum);
		boolean decision=false;//it will store only true or false
		System.out.println("Boolean Variable value :"+decision);
		char letter='z';//anything in singe character comes under char variable
		System.out.println("Char Variable value :"+letter);
	}

}
