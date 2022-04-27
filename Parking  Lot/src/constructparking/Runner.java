package constructparking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import informationlayer.ParkingSpot;

public class Runner {

Scanner scan=new Scanner(System.in);
VehicleParking  park=new VehicleParking();

public  void slotAllotment() throws Exception 
{

scan.nextLine();
System.out.println("Enter the type of vehicle");
String vehicleName=scan.nextLine();
park.slotAllotment(vehicleName);
} 


public void parkingPayment()
{
	System.out.println("Enter the tokenNumber");
	int tokenNumber=scan.nextInt();
	
park.parkingPayment(tokenNumber);


	
}

public void getSlotMap()
{
	park.getSlotMap();
}

public void getFilledMap()
{
	park.getFilledMap();
}

public static void main(String [] args)
{
	//VehicleParking park=new VehicleParking();
	int number=0;
	Runner run=new Runner();
	Scanner scan=new Scanner(System.in);
	
	boolean value=true;
	while(value)
	{
	try
	{
		System.out.println("Enter the operation to perform");
		number=scan.nextInt();
	}
	catch(Exception e)
	{
		System.out.println("Enter the valid operations");
	}
	
switch(number)
{

	case 1:
	try {
		run.slotAllotment();
	} catch (Exception e) {
		System.out.print(e.getMessage());
		e.printStackTrace();
	}
		break;
	case 2:
		
		run.parkingPayment();
		
		break;
	case 3:
		run.getSlotMap();
		break;
	case 4:
		run.getFilledMap();
		break;
	
     default:
	 value=false;
	 System.out.println("Enter the valid details");
}
	}
	
}	
}
