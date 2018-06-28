package fourWayStreetLights.driver;
import fourWayStreetLights.util.FileProcessor;
import fourWayStreetLights.util.Results;
import fourWayStreetLights.util.MyLogger;
import fourWayStreetLights.service.StretLightsContext;
import fourWayStreetLights.test.MyArrayListTest;
import java.util.*;

public class Driver
{
	public static void main(String[] args)
	{
		if (3 != args.length)
		{
			System.err.println("incorrect args passed, Expected <input.txt> <output.txt> <debug value>. \n exiting \n");
			System.exit(0);
		}
		String INPUTFILE = args[0];
		String OUTPUTFILE = args[1];
		MyLogger.setDebugValue(Integer.parseInt(args[2]));
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
			//System.out.println(splited[0]);
			//System.out.println(splited[1]);
			switch(splited[0])
        {
            case "North":
                //System.out.println("one");
		if(splited[1].equals("Green")){
			NorthCars.remove(NorthCars.size()-1);
			Obj1.goNorth();
		}
		else if(splited[1].equals("Red")){
			Obj1.goRed();

		}
		else{
			String[] splitedCars = splited[1].split(",");
			NorthCars.addAll(Arrays.asList(splitedCars));
		}
                break;

            case "East":
               if(splited[1].equals("Green")){
			EastCars.remove(EastCars .size()-1);
			Obj1.goEast();
		}
		else if(splited[1].equals("Red")){
			Obj1.goRed();

		}
		else{
			String[] splitedCars = splited[1].split(",");
			EastCars.addAll(Arrays.asList(splitedCars));
		}
                break;
            case "West":
                if(splited[1].equals("Green")){
			WestCars.remove(WestCars.size()-1);
			Obj1.goWest();
		}
		else if(splited[1].equals("Red")){
			Obj1.goRed();
		}
		else{
			String[] splitedCars = splited[1].split(",");
			WestCars.addAll(Arrays.asList(splitedCars));
		}
                break;
       	    case "South":
                if(splited[1].equals("Green")){
			SouthCars.remove(SouthCars.size()-1);
			Obj1.goSouth();
		}
		else if(splited[1].equals("Red")){
			Obj1.goRed();
		}
		else{
			String[] splitedCars = splited[1].split(",");
			SouthCars.addAll(Arrays.asList(splitedCars));
		}

                break;
            default:
                System.out.println("Direction not match");
        }
	}		
	}
}