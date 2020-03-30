package basic;

public class Control_Flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean decision,hungry=true;
		int hungryRate=5;
		if(hungry)
		{
			decision=true;
		}
		else
		{
			decision=false;
		}
		if(decision)
		{
			if(hungryRate>1)
			{
				System.out.println("Rate of hungryness is : "+hungryRate);
				System.out.println("i am starving");
			}
			else if(hungryRate==1)
			{
				System.out.println("Rate of hungryness is : "+hungryRate);
				System.out.println("i am little bit hungry");
			}
		}
		else
			hungryRate=0;
		if(hungryRate>=1)
		{
			System.out.println("Rate of hungryness is : "+hungryRate);
			System.out.println("i am starving");
		}
		else
		{
			System.out.println("Rate of hungryness is : "+hungryRate);
			System.out.println("Not hungry");
		}
	}
	

}
