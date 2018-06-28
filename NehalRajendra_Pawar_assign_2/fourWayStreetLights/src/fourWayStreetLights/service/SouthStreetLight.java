package fourWayStreetLights.service;
import fourWayStreetLights.util.MyLogger;

public class SouthStreetLight implements StreetLightsStateI{

StretLightsContext Obj1 ;
public static List<String> SouthCars = new ArrayList<>();
public SouthStreetLight (StretLightsContext Obj2){
this.Obj1=Obj2;
}

public StreetLightsStateI goNorth(){
	return new NorthStreetLight(Obj1);
}

public StreetLightsStateI goWest(){
return new WestStreetLight(Obj1);
}

public StreetLightsStateI goSouth(){
System.out.println("Already South is greeen.");
	return Obj1;
}

public StreetLightsStateI goEast(){
return new EastStreetLight(Obj1);}

public StreetLightsStateI goRed(){
MyLogger.writeMessage ("South Signal is Red.",MyLogger.DebugLevel.AllStates);
return new DefaultStreetLight(Obj1);}

public void RemoveCars(){
SouthCars.remove(0);}

}