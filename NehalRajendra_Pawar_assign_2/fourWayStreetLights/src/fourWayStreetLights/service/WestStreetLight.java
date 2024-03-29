package fourWayStreetLights.service;
import fourWayStreetLights.util.MyLogger;
import java.util.*;
import fourWayStreetLights.util.Results;

public class WestStreetLight implements StreetLightsStateI
{

    StretLightsContext Obj1;
	public static int CarsPassed=2;
        public static List<String> WestCars = new ArrayList<>();
        public WestStreetLight(StretLightsContext Obj2)
        {
            this.Obj1 = Obj2;
        }

        public StreetLightsStateI goNorth()
        {
            Results.storeNewResult("Current Context State changed to North Green");
            return new NorthStreetLight(Obj1);
        }

        public StreetLightsStateI goWest()
        {
            Results.storeNewResult("Already West is greeen.");
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
            Results.storeNewResult("Context State change West Signal is Red.");
		CarsPassed=2;
            return new DefaultStreetLight(Obj1);
        }

        public StreetLightsStateI RemoveCars()
        {

	    if(WestCars .size()>=2&&CarsPassed==2){
            WestCars .remove(0);
            WestCars .remove(0);
			CarsPassed=0;
	    return new DefaultStreetLight(Obj1);
	    }
	    else if(WestCars.size()==1||CarsPassed==1){
   		CarsPassed=1;
	    WestCars .remove(0);
	    }
	    else{
	    Results.storeNewResult("No Cars in queue.");
	    }
       	    return new WestStreetLight(Obj1);
        }
}