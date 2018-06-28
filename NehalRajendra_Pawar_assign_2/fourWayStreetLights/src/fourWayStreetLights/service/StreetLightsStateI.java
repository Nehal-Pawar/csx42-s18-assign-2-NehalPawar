package fourWayStreetLights.service;

public interface StreetLightsStateI{
/*
**All methods to be implemented in child class
*/

public StreetLightsStateI goNorth();

public void goWest();

public void goSouth();

public void goEast();

public void goRed();

}
