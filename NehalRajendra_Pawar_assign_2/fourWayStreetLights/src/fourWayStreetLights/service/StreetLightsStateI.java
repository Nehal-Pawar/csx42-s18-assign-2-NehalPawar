package fourWayStreetLights.service;

public interface StreetLightsStateI{
/*
**All methods to be implemented in child class
*/

public StreetLightsStateI goNorth();

public StreetLightsStateI goWest();

public StreetLightsStateI goSouth();

public StreetLightsStateI goEast();

public StreetLightsStateI goRed();

public void RemoveCars();
}
