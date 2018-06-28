package fourWayStreetLights.driver;
import fourWayStreetLights.util.FileProcessor;
import fourWayStreetLights.util.Results;
import fourWayStreetLights.service.StretLightsContext;
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
		StretLightsContext Obj1 = new StretLightsContext();
		FileProcessor F1 = new FileProcessor();
		List<String> zoom = new ArrayList<>();
		List<String> NorthCars = new ArrayList<>();
		List<String> EastCars = new ArrayList<>();
		List<String> WestCars = new ArrayList<>();
		List<String> SouthCars = new ArrayList<>();
		zoom=F1.openFile(INPUTFILE);
		System.out.println(zoom);
		for (String temp : zoom) {
			//System.out.println(temp);
			String[] splited = temp.split(" ");
			System.out.println(splited[0]);
			System.out.println(splited[1]);
			switch(splited[0])
        {
            case "North":
                //System.out.println("one");
		if(splited[1].equals("Green")){
			System.out.println(NorthCars);
			NorthCars.remove(NorthCars.size()-1);
			System.out.println(NorthCars);
			Obj1.goNorth();
		}
		else if(splited[1].equals("Red")){
		
		}
		else{
			String[] splitedCars = splited[1].split(",");
			NorthCars.addAll(Arrays.asList(splitedCars));
		}
                break;
            case "East":
                System.out.println("two");
                break;
            case "West":
                System.out.println("three");
                break;
       	    case "South":
                System.out.println("four");
                break;
            default:
                System.out.println("Direction not match");
        }
		}

		
	}
}