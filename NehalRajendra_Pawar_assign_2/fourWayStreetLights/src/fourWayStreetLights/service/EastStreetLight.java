package fourWayStreetLights.service;
import fourWayStreetLights.util.MyLogger;
import java.util.*;
import fourWayStreetLights.util.Results;

public class EastStreetLight implements StreetLightsStateI{

StretLightsContext Obj1 ;
public static List<String> EastCars = new ArrayList<>();
public  EastStreetLight (StretLightsContext Obj2){
this.Obj1=Obj2;
}

public StreetLightsStateI goNorth(){
Results.storeNewResult("Current Context State changed to North Green");
	return new NorthStreetLight(Obj1);
}

public StreetLightsStateI goWest(){
Results.storeNewResult("Current Context State changed to West Green");
return new WestStreetLight(Obj1);
}

public StreetLightsStateI goSouth(){
Results.storeNewResult("Current Context State changed to South Green");
return new SouthStreetLight(Obj1);}

public StreetLightsStateI goEast(){
Results.storeNewResult("Already East is greeen.");
	return Obj1;
}

public StreetLightsStateI goRed(){
MyLogger.writeMessage ("East Signal is Red.",MyLogger.DebugLevel.AllStates);
return new DefaultStreetLight(Obj1);}

public void RemoveCars(){
EastCars.remove(0);
}
}