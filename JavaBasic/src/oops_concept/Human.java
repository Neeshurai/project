package oops_concept;

public class Human {
	String name;
	int age;
	int height;
	String bodyColor;
	
	public Human(String name, int age, int height, String bodyColor) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.bodyColor = bodyColor;
	}

	public void speak()
	{
		System.out.println("Hello My Name is :" +name);
		System.out.println("My age is :" +age);
		System.out.println("My height is :" +height);
		System.out.println("My bodyColor is :" +bodyColor);
	}

}
