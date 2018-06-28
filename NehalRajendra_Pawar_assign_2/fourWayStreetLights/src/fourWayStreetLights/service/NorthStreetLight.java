package fourWayStreetLights.service;
import fourWayStreetLights.util.MyLogger;
import java.util.*;


public class NorthStreetLight implements StreetLightsStateI{
StretLightsContext Obj1 ;
public static List<String> NorthCars = new ArrayList<>();
public NorthStreetLight (StretLightsContext Obj2){
this.Obj1=Obj2;
}

public StreetLightsStateI goNorth(){
	//System.out.println("Already North is greeen.");
	MyLogger.writeMessage ("Already North is greeen.",MyLogger.DebugLevel.AllStates);
	return Obj1;
}



public StreetLightsStateI goWest(){
MyLogger.writeMessage ("Current Context State changed to West Green",MyLogger.DebugLevel.AllStates);
return new WestStreetLight(Obj1);
}

public StreetLightsStateI goSouth(){
MyLogger.writeMessage ("Current Context State changed to South Green",MyLogger.DebugLevel.AllStates);
return new SouthStreetLight(Obj1);}

public StreetLightsStateI goEast(){
MyLogger.writeMessage ("Current Context State changed to East Green",MyLogger.DebugLevel.AllStates);
return new EastStreetLight(Obj1);}

public StreetLightsStateI goRed(){
MyLogger.writeMessage ("North Signal is Red.",MyLogger.DebugLevel.AllStates);
return new DefaultStreetLight(Obj1);}

public void RemoveCars(){
NorthCars.remove(0);
}

}