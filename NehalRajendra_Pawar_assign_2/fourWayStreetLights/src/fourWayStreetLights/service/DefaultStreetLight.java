package fourWayStreetLights.service;

public class DefaultStreetLight implements StreetLightsStateI{
StretLightsContext Obj1 ;
public DefaultStreetLight (StretLightsContext Obj2){
this.Obj1=Obj2;
}
public StreetLightsStateI goNorth(){
	System.out.println("obj created");
	return new NorthStreetLight(Obj1);
}

public StreetLightsStateI goWest(){
return new WestStreetLight(Obj1);
}

public StreetLightsStateI goSouth(){
return new SouthStreetLight(Obj1);}

public StreetLightsStateI goEast(){
return new EastStreetLight(Obj1);}

public StreetLightsStateI goRed(){
System.out.println("Signal Already Red.");
	return Obj1;
}
}