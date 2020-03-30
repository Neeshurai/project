package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SimpleCollections {

	public SimpleCollections() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>arr=new ArrayList<String>();
		//this variable will not store integer value arr.add(10);
		arr.add("Jai");
		//arr.add(20);
		//arr.add(10);
		arr.add("Missing");
		//arr.add(20);
		//arr.add(10);
		arr.add("you");
		
		arr.add("Janu");
		
		System.out.println("List is :"+arr);
		
		
		
		HashSet<Integer>set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		
		set.add(10);
		set.add(20);
		set.add(30);

		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println("Set is :"+set);
		ArrayList<Integer>setList=new ArrayList<Integer>(set);
		System.out.println("Set is :"+setList);
		Collections.sort(setList);
		System.out.println("Set is :"+setList);
	}

}
