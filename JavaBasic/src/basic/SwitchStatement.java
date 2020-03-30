package basic;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of month :");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int month=scan.nextInt();
		switch(month)
		{
		case 1:
			System.out.println("Its January month ");
			break;
		case 2:
			System.out.println("Its February month ");
			break;
		case 3:
			System.out.println("Its March month ");
			break;
		case 4:
			System.out.println("Its April month ");
			break;
		case 5:
			System.out.println("Its may month ");
			break;
		case 6:
			System.out.println("Its June month ");
			break;
		case 7:
			System.out.println("Its July month ");
			break;
		case 8:
			System.out.println("Its August month ");
			break;
		case 9:
			System.out.println("Its September month ");
			break;
		case 10:
			System.out.println("Its October month ");
			break;
		case 11:
			System.out.println("Its November month ");
			break;
		case 12:
			System.out.println("Its December month ");
			break;
		default:
			System.out.println("Its not the month name ");
		}

	}

}
