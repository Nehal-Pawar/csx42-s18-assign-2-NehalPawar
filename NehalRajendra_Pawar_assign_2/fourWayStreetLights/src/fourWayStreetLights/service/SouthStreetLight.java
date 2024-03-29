package fourWayStreetLights.service;
import fourWayStreetLights.util.MyLogger;
import java.util.*;
import fourWayStreetLights.util.Results;

public class SouthStreetLight implements StreetLightsStateI
{

    StretLightsContext Obj1;
	public static int CarsPassed=2;
        public static List<String> SouthCars = new ArrayList<>();
        public SouthStreetLight(StretLightsContext Obj2)
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
            Results.storeNewResult("Current Context State changed to West Green");
            return new WestStreetLight(Obj1);
        }
        public StreetLightsStateI goSouth()
        {
            Results.storeNewResult("Already South is greeen.");
            return new SouthStreetLight(Obj1);
        }
        public StreetLightsStateI goEast()
        {
            Results.storeNewResult("Current Context State changed to East Green");
            return new EastStreetLight(Obj1);
        }
        public StreetLightsStateI goRed()
        {
            Results.storeNewResult("Context State change South Signal is Red.");
		CarsPassed=2;
            return new DefaultStreetLight(Obj1);
        }
        public StreetLightsStateI RemoveCars()
        {
	    if(SouthCars.size()>=2&&CarsPassed==2){
            SouthCars.remove(0);
            SouthCars.remove(0);
		CarsPassed=0;
            return new DefaultStreetLight(Obj1);
	    }
	    else if(SouthCars.size()==1||CarsPassed==1){
	    SouthCars.remove(0);
		CarsPassed=1;
	    }
	    else{
	    Results.storeNewResult("No Cars in queue.");
	    }
	    return new SouthStreetLight(Obj1);
        }
}