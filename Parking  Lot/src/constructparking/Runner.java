package constructparking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import informationlayer.FloorSpace;

public class Runner {

Scanner scan=new Scanner(System.in);
VehicleParking  park=new VehicleParking();
Map<Integer,FloorSpace> floorObj=new HashMap<Integer,FloorSpace>();
public  void slotAllotment() 
{
	FloorSpace obj=new FloorSpace();
	int floors=obj.getTotalFloor();
	for(int i=0;i<floors;i++)
	{
	    floorObj.put(i, obj);
	
		
	}
	 System.out.println(floorObj);
	 park.updateFloorMap(floorObj);
	System.out.println("Enter the type of vehicle   "
			+ "1.compact"
			+"2.large"
			+"3.handicapped"
			+"4. motor cycle"
	+"5. electric vehicle"   );
	int  vehicle=scan.nextInt();
	System.out.println("Enter the floor number");
	int floorNumber=scan.nextInt();
    park.slotAllotment(vehicle,floorNumber,obj);
     obj=floorObj.get(floorNumber);
} 

public static void main(String [] args)
{
	int number=0;
	Runner run=new Runner();
	Scanner scan=new Scanner(System.in);
	boolean value=true;
	try
	{
		System.out.println("Enter the operation to perform");
		number=scan.nextInt();
	}
	catch(Exception e)
	{
		System.out.println("Enter the valid operations");
	}
while(value)	
switch(number)
{

	case 1:
		run.slotAllotment();
		break;
		
 default:
	 value=false;
	 System.out.println("Enter the valid details");
}
	
}	
}
