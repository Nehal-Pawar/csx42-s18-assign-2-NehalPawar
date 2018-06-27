package fourWayStreetLights.util;

import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Vector;

public class Results  implements FileDisplayInterface, StdoutDisplayInterface{

	private List<String> TestResult = new Vector<String>();
	String result = "";
	/*wriet to output file the list that stores result*/
	public void writeToFile(String fileName) {
		// FileOutputStream outputStream;
		try {
			BufferedWriter writer = new BufferedWriter( new FileWriter( fileName));
		for(String str : TestResult ){
				//byte[] strToBytes = str.getBytes();
				//outputStream.write(strToBytes);
				writer.write( str );
			}
			//outputStream.close();
			writer.close();	
		} catch (Exception e) {
			System.out.println("Exception while writing to file."+e.toString());
			System.exit(1);
		}		 
	}	
	/* print to console */
	public void writeToStdout(String s) {
		//for(String str : TestResult )
		System.out.println(s);
	}
	/* store and display result from all tests*/
	public void storeNewResult(String result){
		TestResult.add(result);
		writeToStdout(result);
	}
	/* write result from test in desired format*/
	public String CreateOutput(boolean res,String CaseName,String Error){
		if(res)
			result =  "\nTest : " + CaseName+ " - Passed ";
		else
			result =  "\nTest : " + CaseName+ " - Failed. Error  : "+ Error;
					
		return result;
	}	
}
