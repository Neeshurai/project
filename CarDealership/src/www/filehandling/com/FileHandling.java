package www.filehandling.com;

import java.io.*;
import java.util.Scanner;

public class FileHandling {

	public FileHandling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub

		File file=new File("myFile.txt");
		FileReader filereader=new FileReader(file);
		BufferedReader bufferedreader=new BufferedReader(filereader);
		//BufferedReader bufferedreader=new BufferedReader(filereader);
		
		try {
			do
			{
				System.out.print((String)bufferedreader.readLine());
			}while(bufferedreader.readLine()!=null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(file);
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}
	}

}
