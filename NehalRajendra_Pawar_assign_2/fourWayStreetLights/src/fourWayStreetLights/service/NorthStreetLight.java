package fourWayStreetLights.service;
import fourWayStreetLights.util.MyLogger;
import java.util.*;
import fourWayStreetLights.util.Results;

public class NorthStreetLight implements StreetLightsStateI
{
    StretLightsContext Obj1;
        public static List<String> NorthCars = new ArrayList<>();
        public NorthStreetLight(StretLightsContext Obj2)
        {
            this.Obj1 = Obj2;
        }

        public StreetLightsStateI goNorth()
        {
            //System.out.println("Already North is greeen.");
            MyLogger.writeMessage("Already North is greeen.", MyLogger.DebugLevel.AllStates);
            return new NorthStreetLight(Obj1);
        }
        public StreetLightsStateI goWest()
        {
            Results.storeNewResult("Current Context State changed to West Green");
            return new WestStreetLight(Obj1);
        }
        public StreetLightsStateI goSouth()
        {
            Results.storeNewResult("Current Context State changed to South Green");
            return new SouthStreetLight(Obj1);
        }
        public StreetLightsStateI goEast()
        {
            Results.storeNewResult("Current Context State changed to East Green");
            return new EastStreetLight(Obj1);
        }

        public StreetLightsStateI goRed()
        {
            Results.storeNewResult("Context State change North Signal is Red.");

            //System.out.println("Signal Already Red.");
            return new DefaultStreetLight(Obj1);
        }
        public void RemoveCars()
        {
	    if(NorthCars.size()>=2){
            NorthCars.remove(0);
            NorthCars.remove(0);
	    }
	    else if(NorthCars.size()==1){
	    NorthCars.remove(0);
	    }
	    else{
	    Results.storeNewResult("No Cars in queue.");
	    }
        }
}