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
	CurrentState=CurrentState.goNorth();
	return CurrentState;
}

public StreetLightsStateI goWest(){
CurrentState=CurrentState.goWest();
return CurrentState;
}

public StreetLightsStateI goSouth(){
CurrentState=CurrentState.goSouth();
return CurrentState;
}

public StreetLightsStateI goEast(){
CurrentState=CurrentState.goEast();
return CurrentState;
}

public StreetLightsStateI goRed(){
CurrentState=CurrentState.goRed();
return CurrentState;
}
public void RemoveCars(){
CurrentState.RemoveCars();}
}