package javaCollections;
import java.util.*;
public class HashMapCollections {

	public static void main(String[] args) {
		
		HashMap<Integer,String>hashMap=new HashMap<Integer,String>();
		hashMap.put(1,"Neeshu");
		hashMap.put(2,"Jai");
		hashMap.put(3,"Shiva");
		hashMap.put(4,"Shashank");
		for(int n:hashMap.keySet())
		{
			
		System.out.println(hashMap.get(n));
		}
		for(Map.Entry<Integer, String> entry:hashMap.entrySet())
		{
			System.out.print(" " +entry.getKey()+" ");
			System.out.print(": "+entry.getValue());
		}
			
			
			
			
			
			
	}

}
