package constructparking;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import informationlayer.FloorSpace;
import informationlayer.SlotAllotment;

public class Cache {

static Map<Integer,FloorSpace>	floorObj=new HashMap <Integer,FloorSpace>();
static Map<Integer,String> count=new HashMap<Integer,String>();
static Map<Integer,SlotAllotment> parked=new HashMap<Integer,SlotAllotment>();
int tokenNumber=0;
public Cache()
{
count.put(1,"Compact");
count.put(2,"Large");
count.put(3,"Handicapped");
count.put(4,"Motor cycle");

}

public int  generateTokenNumber()
{
	tokenNumber=tokenNumber+1;
	return tokenNumber;
}
public Map<Integer,FloorSpace> updateFloorMap(Map <Integer,FloorSpace> floor)
{
	floorObj=floor;
	System.out.println(floorObj);
	return floorObj;
}
public void slotAllotment(int mapVehicle,int floorNumber,FloorSpace obj)
{
	System.out.println(floorObj);
	int space=vehicleCount(mapVehicle,floorNumber);
    if(space!=0)
    {
      SlotAllotment slot=new SlotAllotment();
   	 String type=count.get(mapVehicle);
   	 slot.setVehicleType(type);
     slot.setFloorNumber(floorNumber);
     int token=generateTokenNumber();
     slot.setTokenNumber(token);
     SimpleDateFormat simple=new SimpleDateFormat("HH:mm:ss"); 
     Date date=new Date();
     slot.setTime(simple.format(date));
     parked.put(token,slot);
     FloorSpace object=floorObj.get(floorNumber);
     System.out.println(floorObj);
     System.out.println(parked);
    }
    
    
    else
    {
   	 System.out.println("The current parking slot is  occupied");
    }
    
}

	public int vehicleCount(int mapVehicle,int floorNumber)
	{
		int count=0;
		int spaceAvailable=0;
		FloorSpace  obj=floorObj.get(floorNumber);
	switch (mapVehicle)
	{
	case 1:
		
		count=obj.getCompact();
		if(count!=0)
		{
			spaceAvailable=obj.getCompact()-1;
			obj.setCompact(spaceAvailable);
			floorObj.put(floorNumber, obj);
		}
	
		break;
	case 2:
		
		count=obj.getLarge();
		if(count!=0)
		{
		spaceAvailable=obj.getLarge()-1;
		obj.setLarge(spaceAvailable);
		}
		break;
	case 3:
		count=obj.getHandicapped();
		if(count!=0)
		{
		spaceAvailable=obj.getHandicapped()-1;
	    obj.setHandicapped(spaceAvailable);
		}
		break;
	case 4:
		count=obj.getMotorCycle();
		if(count!=0)
		{
	    spaceAvailable=obj.getMotorCycle()-1;
	    obj.setMotorCycle(spaceAvailable);
		}
		break;
		
	
	}
	
	return count;	
	}
}
	
