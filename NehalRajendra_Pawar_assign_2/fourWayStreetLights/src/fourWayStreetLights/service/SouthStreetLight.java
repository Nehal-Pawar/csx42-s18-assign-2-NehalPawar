package fourWayStreetLights.service;
import fourWayStreetLights.util.MyLogger;
import java.util.*;
import fourWayStreetLights.util.Results;

public class SouthStreetLight implements StreetLightsStateI
{

    StretLightsContext Obj1;
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
            Results.storeNewResult("South Signal is Red.");
            return new DefaultStreetLight(Obj1);
        }
        public void RemoveCars()
        {
	    if(SouthCars.size()>=2){
            SouthCars.remove(0);
            SouthCars.remove(0);
	    }
	    else if(SouthCars.size()==1){
	    SouthCars.remove(0);
	    }
	    else{
	    Results.storeNewResult("No Cars in queue.");
	    }
        }
}