package fourWayStreetLights.service;

public class SouthStreetLight implements StreetLightsStateI{

StretLightsContext Obj1 ;
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
return new DefaultStreetLight(Obj1);}

}