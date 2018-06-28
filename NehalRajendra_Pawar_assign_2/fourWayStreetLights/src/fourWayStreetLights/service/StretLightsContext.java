package fourWayStreetLights.service;


public class StretLightsContext implements StreetLightsStateI{

StreetLightsStateI North,East,West,South,CurrentState,Default;
public StretLightsContext (){


North=new NorthStreetLight(this);
West=new WestStreetLight(this);
South=new SouthStreetLight(this);
East=new EastStreetLight(this);
Default=new DefaultStreetLight(this);
CurrentState=Default;
}
public StreetLightsStateI goNorth(){
	return CurrentState.goNorth();
}

public StreetLightsStateI goWest(){}

public StreetLightsStateI goSouth(){}

public StreetLightsStateI goEast(){}

public StreetLightsStateI goRed(){}

}