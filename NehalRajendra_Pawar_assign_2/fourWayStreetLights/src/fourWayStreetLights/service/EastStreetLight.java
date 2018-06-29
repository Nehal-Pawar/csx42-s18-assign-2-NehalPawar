package fourWayStreetLights.service;
import fourWayStreetLights.util.MyLogger;
import java.util.*;
import fourWayStreetLights.util.Results;

public class EastStreetLight implements StreetLightsStateI
{
    StretLightsContext Obj1;
	public static int CarsPassed=2;
        public static List<String> EastCars = new ArrayList<>();
        public EastStreetLight(StretLightsContext Obj2)
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
            Results.storeNewResult("Current Context State changed to South Green");
            return new SouthStreetLight(Obj1);
        }
        public StreetLightsStateI goEast()
        {
            Results.storeNewResult("Already East is greeen.");
            return new EastStreetLight(Obj1);
        }
        public StreetLightsStateI goRed()
        {
            Results.storeNewResult("Context State change East Signal is Red.");
		CarsPassed=2;
            return new DefaultStreetLight(Obj1);
        }
        public StreetLightsStateI RemoveCars()
        {
             if(EastCars.size()>=2&&CarsPassed==2){
            EastCars.remove(0);
            EastCars.remove(0);
	    return new DefaultStreetLight(Obj1);
	    }
	    else if(EastCars.size()==1||CarsPassed==1){
		CarsPassed=1;
	    EastCars.remove(0);
	    }
	    else{
	    Results.storeNewResult("No Cars in queue.");
	    }
	    return new EastStreetLight(Obj1);
        }
}