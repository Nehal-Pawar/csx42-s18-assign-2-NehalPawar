package fourWayStreetLights.driver;
import fourWayStreetLights.util.FileProcessor;
import fourWayStreetLights.util.Results;
import fourWayStreetLights.MyArrayList;
import fourWayStreetLights.test.MyArrayListTest;
import java.util.*;

public class Driver
{
	public static void main(String[] args)
	{
		if (2 != args.length)
		{
			System.err.println("incorrect args passed, Expected <input.txt> <output.txt>. \n exiting \n");
			System.exit(0);
		}
		String INPUTFILE = args[0];
		String OUTPUTFILE = args[1];
		MyArrayList Obj1 = new MyArrayList();
		FileProcessor F1 = new FileProcessor();
		List<String> zoom = new ArrayList<>();
		zoom=F1.openFile(INPUTFILE);
		  System.out.println(zoom);


		
	}
}