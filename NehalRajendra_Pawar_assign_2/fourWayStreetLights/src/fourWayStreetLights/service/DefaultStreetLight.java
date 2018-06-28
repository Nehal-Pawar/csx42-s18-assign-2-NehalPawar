package fourWayStreetLights.service;
import fourWayStreetLights.util.MyLogger;

public class DefaultStreetLight implements StreetLightsStateI{
StretLightsContext Obj1 ;
public DefaultStreetLight (StretLightsContext Obj2){
this.Obj1=Obj2;
}
public StreetLightsStateI goNorth(){
	//System.out.println("obj created");
	MyLogger.writeMessage ("Current Context State changed to North Green",MyLogger.DebugLevel.AllStates);
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
Results.storeNewResult("Current Context State changed to East Green");
return new EastStreetLight(Obj1);}

public StreetLightsStateI goRed(){
Results.storeNewResult("Signal Already Red.");

//System.out.println("Signal Already Red.");
	return Obj1;
}

public void RemoveCars(){}
}