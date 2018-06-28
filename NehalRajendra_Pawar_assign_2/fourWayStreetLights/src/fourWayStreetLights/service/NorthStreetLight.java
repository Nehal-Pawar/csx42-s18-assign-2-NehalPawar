package fourWayStreetLights.service;

public class NorthStreetLight implements StreetLightsStateI{
StretLightsContext Obj1 ;
public NorthStreetLight (StretLightsContext Obj2){
this.Obj1=Obj2;
}

public StreetLightsStateI goNorth(){
	System.out.println("Already North is greeen.");
	return Obj1;
}



public StreetLightsStateI goWest(){
return new WestStreetLight(Obj1);
}

public StreetLightsStateI goSouth(){
return new SouthStreetLight(Obj1);}

public StreetLightsStateI goEast(){
return new EastStreetLight(Obj1);}

public StreetLightsStateI goRed(){
return new DefaultStreetLight(Obj1);}


}