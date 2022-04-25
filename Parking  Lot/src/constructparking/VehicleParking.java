package constructparking;

import java.util.Map;

import informationlayer.FloorSpace;

public class VehicleParking {
 Cache storage=new Cache();
	
public void slotAllotment(int vehicle,int floorNumber,FloorSpace obj)
{
	storage.slotAllotment(vehicle,floorNumber,obj);
	
}
public void updateFloorMap(Map<Integer,FloorSpace> floor)	
{
	storage.updateFloorMap(floor);
}
}
