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
Map<Integer,Map<String,List<ParkingSpot>>>  checkIn=park.getSlotMap();
String[] array= {"Compact","Large","Handicapped","MotorCycle",
	 "Electric vehicle"};
public  void slotAllotment() throws Exception 
{

scan.nextLine();
System.out.println("Enter the type of vehicle");
String vehicleName=scan.nextLine();
System.out.println("Enter the vehicleNumber");
String vehicleNumber=scan.nextLine();
park.slotAllotment(vehicleName,vehicleNumber);
} 


public void parkingPayment() throws Exception
{
   System.out.println("Enter the tokenNumber");
   int tokenNumber=scan.nextInt();
   park.parkingPayment(tokenNumber);
}


public void  getSlotMap()
{
	  String[] array= {"Compact","Large","Handicapped","MotorCycle",
		 "Electric vehicle"};
for(int i=0;i<checkIn.size();i++)
{
	  Map<String,List<ParkingSpot>> obj=checkIn.get(i);
	 
for (String vehicle:array)
{
	  List<ParkingSpot> spotObj=obj.get(vehicle);
	  System.out.println("Floor  "+ i + "   Vehicle  "+ vehicle+""
	  		+ "-"+ spotObj.size());
}

}

}
public Map<Integer,Map<String,List<ParkingSpot>>> getMapDetails()
{
	return checkIn;
}

public void getFilledMap()
{
	park.getFilledMap();
}

public void getCustomerDetails()
{
	park.getCustomerMap();
}

public  void rechargeAmount() throws Exception
{

park.rechargeWallet();
}

public void customerCheck()
{
	park.customerCheck();
}

public void createCustomer() throws Exception
{
	System.out.println("Enter your token number");
	int tokenNumber=scan.nextInt();
	park.createCustomer(tokenNumber);
}

public static void main(String [] args)
{
	//VehicleParking park=new VehicleParking();
	int number=0;
	Runner run=new Runner();
	Map<Integer,Map<String,List<ParkingSpot>>> slotMap=run.getMapDetails();
      try {
		if(slotMap.isEmpty())
{
		System.out.println("Enter the valid details");
}
				
		else
		{
		Scanner scan=new Scanner(System.in);
		boolean value=true;
		boolean condition=true;
		while(value)
		{
		try
		{
			while(condition==true)
			{
			System .out.println("Press 1 for show operation");
			int pressNumber=scan.nextInt();
			
			if(pressNumber==1)
			{
			System.out.println(" 1.Slot allotment\n" +" "
					+ "2.Parking payment\n"+" " 
					+ "3. Floor wise Slots\n"+" "
					+ "4. Parking details\n"+" "
					+ "5. Recharge Wallet\n"+" "
					+"6.CustomerDetails\n"
			        +"7.Create Customer\n");
			condition=false;
			}
			else
			{
				System.out.println("For your kind information press 1 for choices to perform operation");
				condition= true;
			}
			}
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
			
		try {
			run.parkingPayment();
		} catch (Exception e1) {
			
			System.out.println(e1.getMessage());
			
		}
			
			break;
		case 3:
			run.getSlotMap();
			break;
		case 4:
			run.getFilledMap();
			break;
		
		
		case 5:
		try {
			run.rechargeAmount();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
		case 6:
		run.getCustomerDetails();
		break;
		
		case 8:
		  run.customerCheck();
		  break;
		  
		case 7:
			run.createCustomer();
			
			break;
		 default:
		 value=false;
		 System.out.println("Enter the valid details");
}
		}
		
}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
