package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;

public class StockFileApplication {
	
	public static void main(String args[]) throws IOException{
		StockFileReader fr = new StockFileReader("table.csv");
		
		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		System.out.println(dataResult.size());
	}
	/**
	 * Complete the method body so that it returns the given structure needed to 
	 * populate the data field in the StockFileData class. 
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines)throws IOException{
		List<HashMap<String, Double>> dataResult = new ArrayList<>();
		for(String line:lines)
		{
			int cnt=0;
			HashMap<String, Double>headerValue=new HashMap<>();
			String [] values=line.split(",");
			for(String value:values)
			{
				double dval=Double.parseDouble(value);
				headerValue.put(headers.get(cnt),dval);
				cnt++;
			}
			dataResult.add(headerValue);
		}
		return dataResult;
	}
	
	
}
