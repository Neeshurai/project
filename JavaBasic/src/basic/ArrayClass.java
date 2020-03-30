package basic;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[100];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[50]=50;
		System.out.println(arr[50]);///array index out of bound exception
		String words[]=new String[]{"My","Name","is","John"};
		System.out.println(words[3]);
		words=new String[10];///values are changed when the word is initialized with new keyword
		System.out.println(words[3]);
	}

}
 