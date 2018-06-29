package fourWayStreetLights.driver;
import fourWayStreetLights.util.FileProcessor;
import fourWayStreetLights.util.Results;
import fourWayStreetLights.util.MyLogger;
import fourWayStreetLights.service.StretLightsContext;
import fourWayStreetLights.service.*;
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

        Results Re = new Results();

        zoom = F1.openFile(INPUTFILE);
        System.out.println(zoom);
        for (String temp : zoom)
        {
            String[] splited = temp.split(" ");
            switch (splited[0])
            {
                case "North":
                    if (splited[1].equals("Green"))
                    {
			int count=NorthStreetLight.NorthCars.size();
			if(count>=2)
                        Results.storeNewResult("Cars in Queue before:North " + NorthStreetLight.NorthCars);
                        Obj1.goNorth();
                        Obj1.RemoveCars();
			if(count>=1)
                        Results.storeNewResult("Cars in Queue after:North " + NorthStreetLight.NorthCars);
                    }
                    else if (splited[1].equals("Red"))
                    {
                        if(StretLightsContext.CurrentState instanceof NorthStreetLight||StretLightsContext.CurrentState instanceof DefaultStreetLight)
                        Obj1.goRed();
			else
			Results.storeNewResult("North is Already Red. No State Change");
                    }
                    else
                    {
                        String[] splitedCars = splited[1].split(",");
                        NorthStreetLight.NorthCars.addAll(Arrays.asList(splitedCars));

                    }
                    break;

                case "East":
                    if (splited[1].equals("Green"))
                    {
			int count=EastStreetLight.EastCars.size();
			if(count>=2)
                        Results.storeNewResult("Cars in Queue before:East " + EastStreetLight.EastCars);
                        Obj1.goEast();
                        Obj1.RemoveCars();
			if(count>=1)
                        Results.storeNewResult("Cars in Queue after:East " + EastStreetLight.EastCars);
                    }
                    else if (splited[1].equals("Red"))
                    {
                        if(StretLightsContext.CurrentState instanceof EastStreetLight||StretLightsContext.CurrentState instanceof DefaultStreetLight)
                        Obj1.goRed();
			else
			Results.storeNewResult("East is Already Red. No State Change");
                    }
                    else
                    {
                        String[] splitedCars = splited[1].split(",");
                        EastStreetLight.EastCars.addAll(Arrays.asList(splitedCars));
                    }
                    break;
                case "West":
                    if (splited[1].equals("Green"))
                    {
			int count=WestStreetLight.WestCars.size();
			if(count>=2)
                        Results.storeNewResult("Cars in Queue before:West " + WestStreetLight.WestCars);
                        Obj1.goWest();
                        Obj1.RemoveCars();
			if(count>=1)
                        Results.storeNewResult("Cars in Queue after:West " + WestStreetLight.WestCars);
                    }
                    else if (splited[1].equals("Red"))
                    {
                        if(StretLightsContext.CurrentState instanceof WestStreetLight||StretLightsContext.CurrentState instanceof DefaultStreetLight)
                        Obj1.goRed();
			else
			Results.storeNewResult("West is Already Red. No State Change");

                    }
                    else
                    {
                        String[] splitedCars = splited[1].split(",");
                        WestStreetLight.WestCars.addAll(Arrays.asList(splitedCars));
                    }
                    break;
                case "South":
                    if (splited[1].equals("Green"))
                    {
			int Count=SouthStreetLight.SouthCars.size();
			if(Count>=2)
                        Results.storeNewResult("Cars in Queue before:South " + SouthStreetLight.SouthCars);
                        Obj1.goSouth();
                        Obj1.RemoveCars();
			if(Count>=1)
                        Results.storeNewResult("Cars in Queue after:South " + SouthStreetLight.SouthCars);
                    }
                    else if (splited[1].equals("Red"))
                    {
			if(StretLightsContext.CurrentState instanceof SouthStreetLight||StretLightsContext.CurrentState instanceof DefaultStreetLight)
                        Obj1.goRed();
			else
			 Results.storeNewResult("South is Already Red. No State Change");
                    }
                    else
                    {
                        String[] splitedCars = splited[1].split(",");
                        SouthStreetLight.SouthCars.addAll(Arrays.asList(splitedCars));
                    }

                    break;
                default:
                    MyLogger.writeMessage("Direction not match", MyLogger.DebugLevel.AllStates);

            }
        }
        Re.writeToFile(OUTPUTFILE);
    }
}