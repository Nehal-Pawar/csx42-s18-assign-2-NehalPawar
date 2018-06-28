package fourWayStreetLights.service;

public class DefaultStreetLight implements StreetLightsStateI{
StretLightsContext Obj1 ;
public DefaultStreetLight (StretLightsContext Obj2){
this.Obj1=Obj2;
}
public StreetLightsStateI goNorth(){
	return new NorthStreetLight();
}


public void goWest(){}

public void goSouth(){}

public void goEast(){}

public void goRed(){}



}