package fourWayStreetLights.service;
import fourWayStreetLights.util.MyLogger;

public class WestStreetLight implements StreetLightsStateI{

StretLightsContext Obj1 ;
public static	List<String> WestCars = new ArrayList<>();
public WestStreetLight (StretLightsContext Obj2){
this.Obj1=Obj2;
}

public StreetLightsStateI goNorth(){
	return new NorthStreetLight(Obj1);
}

public StreetLightsStateI goWest(){
System.out.println("Already West is greeen.");
	return Obj1;
}

public StreetLightsStateI goSouth(){
return new SouthStreetLight(Obj1);}

public StreetLightsStateI goEast(){
return new EastStreetLight(Obj1);}

public StreetLightsStateI goRed(){
MyLogger.writeMessage ("West Signal is Red.",MyLogger.DebugLevel.AllStates);

return new DefaultStreetLight(Obj1);}

public void RemoveCars(){
WestCars.remove(0);
}
}