package fourWayStreetLights.service;

public interface StreetLightsStateI
{
    /*
    **All methods to be implemented 
    */
	
	/*
	//Go to NorthStreetLight state 
	*/

    public StreetLightsStateI goNorth();

	/*
	//Go to WestStreetLight state 
	*/

    public StreetLightsStateI goWest();
	/*
	//Go to SouthStreetLight state 
	*/

    public StreetLightsStateI goSouth();
	/*
	//Go to EastStreetLight state 
	*/

    public StreetLightsStateI goEast();
	/*
	//Go to DefaultStreetLight state 
	*/

    public StreetLightsStateI goRed();
	/*
	//Remove cars from current state 
	*/

    public StreetLightsStateI RemoveCars();
	
}
