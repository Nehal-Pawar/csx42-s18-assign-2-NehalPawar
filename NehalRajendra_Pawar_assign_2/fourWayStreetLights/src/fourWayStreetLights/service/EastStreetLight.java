package fourWayStreetLights.service;
import fourWayStreetLights.util.MyLogger;

public class EastStreetLight implements StreetLightsStateI{

StretLightsContext Obj1 ;
public static List<String> EastCars = new ArrayList<>();
public  EastStreetLight (StretLightsContext Obj2){
this.Obj1=Obj2;
}

public StreetLightsStateI goNorth(){
	return new NorthStreetLight(Obj1);
}

public StreetLightsStateI goWest(){
return new WestStreetLight(Obj1);
}

public StreetLightsStateI goSouth(){
return new SouthStreetLight(Obj1);}

public StreetLightsStateI goEast(){
System.out.println("Already East is greeen.");
	return Obj1;
}

public StreetLightsStateI goRed(){
MyLogger.writeMessage ("East Signal is Red.",MyLogger.DebugLevel.AllStates);
return new DefaultStreetLight(Obj1);}

public void RemoveCars(){
EastCars.remove(0);
}
}