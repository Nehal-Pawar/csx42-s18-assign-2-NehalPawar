package fourWayStreetLights.service;

public class WestStreetLight implements StreetLightsStateI{

StretLightsContext Obj1 ;
public DefaultStreetLight (StretLightsContext Obj2){
this.Obj1=Obj2;
}


public StreetLightsStateI goNorth(){}

public void goWest(){}

public void goSouth(){}

public void goEast(){}

public void goRed(){}



}