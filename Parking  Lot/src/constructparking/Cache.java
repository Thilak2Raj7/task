package constructparking;



import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import informationlayer.CustomerInformation;
import informationlayer.ParkingSpot;
import informationlayer.SlotAllotment;

public class Cache {

	Map<Integer, Map<String, List<ParkingSpot>>> checkIn = new HashMap<Integer, Map<String, List<ParkingSpot>>>();
	Map<String, List<ParkingSpot>>spaceAvailable = new HashMap<String, List<ParkingSpot>>();
    Map<Integer,Map<String,List<ParkingSpot>>> filled=new HashMap<Integer,Map<String,List<ParkingSpot>>>();
    Map<Integer,Integer> checkCustomer=new HashMap<Integer,Integer>();
    Map<Long,Integer>  referNumber=new HashMap<Long,Integer> ();
    Map<Integer,CustomerInformation> customerInfo=new HashMap<Integer,CustomerInformation>();
    Map<Integer, SlotAllotment> parked = new HashMap<Integer, SlotAllotment>();
 
	Scanner scan = new Scanner(System.in);
	  int customerId = 0;
      int k=1;
	  int tokenNumber = 0;
      int floorNumber=0;
   
	public Cache() {
		System.out.println("Enter the number of floors");
		floorNumber = scan.nextInt();
		System.out.println("Enter the number of slots");
		int vehicleSlot=scan.nextInt();
		 if(vehicleSlot<5 || floorNumber<1)
		 {
		System.out.println( "Slots should be minimum 5  and floor number should be greater than 0");
		 }
		 else
		 {
		 int spot=vehicleSlot/5;
		 int spot1=vehicleSlot%5;
		
		
        for(int i=0;i<floorNumber;i++)
        {
        	int k=1;
        	Map<String,List<ParkingSpot>> spaceAvailable=checkIn.get(i);
        	for(int j=1;j<=spot;j++)
        	{
        
        		
        	
        		if(spaceAvailable==null)
    		{
    			spaceAvailable=new HashMap<String,List<ParkingSpot>>();
    		}
        		
                List<ParkingSpot> slot=spaceAvailable.get("Compact");
                if(slot== null)
                {
                	slot=new ArrayList<ParkingSpot>();
                	
                }
                ParkingSpot object = new ParkingSpot();
        		object.setSpotNumber(k++);
        		object.setVehicleType("Compact");
        		object.setFloorNumber(i);
        		slot.add(object);
        		spaceAvailable.put("Compact", slot);
        		checkIn.put(i, spaceAvailable);
        		
				
				//emptySpots.add(object);
        	}
        	for(int j=1;j<=spot;j++)
        	{
        	List<ParkingSpot> slot=spaceAvailable.get("Large");
                if(slot== null)
                {
                	slot=new ArrayList<>();
                	
                }
                ParkingSpot object=new ParkingSpot();
                object.setSpotNumber(k++);
				object.setVehicleType("Large");
				object.setFloorNumber(i);
        		slot.add(object);
        		spaceAvailable.put("Large", slot);
        		checkIn.put(i, spaceAvailable);
        		//emptySpots.add(object);
        	}
        	
        	for(int j=1;j<=spot;j++)
        	{
        		List<ParkingSpot>slot=spaceAvailable.get("Handicapped");
                if(slot== null)
                {
                	slot=new ArrayList<ParkingSpot>();
                	
                }
                ParkingSpot object = new ParkingSpot();
            	object.setSpotNumber(k++);
				object.setVehicleType("Handicapped");
				object.setFloorNumber(i);
        		slot.add(object);
        		spaceAvailable.put("Handicapped", slot);
        		checkIn.put(i, spaceAvailable);
        		//emptySpots.add(object);
        	}
        	
        	for(int j=1;j<=spot+spot1;j++)
        	{
        		System.out.println(k);
        		List<ParkingSpot> slot=spaceAvailable.get("MotorCycle");
                if(slot== null)
                {
                	slot=new ArrayList<>();
                	
                }
                ParkingSpot object = new ParkingSpot();
            	object.setSpotNumber(k++);
				object.setVehicleType("MotorCycle");
				object.setFloorNumber(i);
			
        		slot.add(object);
        		spaceAvailable.put("MotorCycle", slot);
        		checkIn.put(i, spaceAvailable);
        		//emptySpots.add(object);
        	}
        	for(int j=1;j<=spot;j++)
        	{
        		List<ParkingSpot> slot=spaceAvailable.get("Electric vehicle");
                if(slot== null)
                {
                	slot=new ArrayList<>();
                	
                }
                ParkingSpot object = new ParkingSpot();
            	object.setSpotNumber(k++);
				object.setVehicleType("Electric vehicle");
				object.setFloorNumber(i);
        		slot.add(object);
        		spaceAvailable.put("Electric vehicle", slot);
        		checkIn.put(i, spaceAvailable);
        		//emptySpots.add(object);
        	}
        	
        }
        
      for(int i=0;i<checkIn.size();i++)
       {
    	   System.out.println("Floor number  "+i+ checkIn.get(i));
     }
      
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
//		for (int i = 0; i < emptySpots.size(); i++) {
//			System.out.println(emptySpots.get(i));
//		}
		 }
		 }

	

	public int generateCustomerId() {
		customerId = customerId + 1;
		return customerId;
	}

	public int generateTokenNumber() {
		tokenNumber = tokenNumber + 1;
		return tokenNumber;
	}

	public Map<Integer, Map<String, List<ParkingSpot>>>  getSlotMap() {
		
		   
	      for(int i=0;i<checkIn.size();i++)
	       {
	    	   System.out.println("Floor number  "+i+ checkIn.get(i));
	     }
	      return checkIn;
	}

	public void getFilledMap() {
		System.out.println(filled);
	}
	
 public void  getCustomerMap()
 {
	 System.out.println(customerInfo);
 }
public void checkCustomerDetails(int customerId) throws Exception
{
	if(!customerInfo.containsKey(customerId))
	{
		
      throw new Exception("Entered details is not correct");
	}

	
}
	
	public void checkVehicleType(List<ParkingSpot> listObj) throws Exception {
		if (listObj == null) {
			throw new Exception("VehicleType does not exist " + "Enter the " + "valid details !");
		}
	}

	public float rechargeCustomerAccount() throws Exception {
      // checkCustomerId(customerId,password);
		System.out.println("Enter your customer id");
		int customerId=scan.nextInt();
		
		checkCustomerDetails(customerId);
		System.out.println("Enter the wallet amount to recharge");
		float wallet = scan.nextFloat();
	    CustomerInformation cusInfo = customerInfo.get(customerId);
	    float walletAmount=cusInfo.getWallet();
		cusInfo.setWallet(wallet+walletAmount);
		System.out.println("Your wallet is recharged  succesfully");
		return wallet;
	}
	

	
	public float  customerDetails(int tokenNumber) throws Exception
	{
		
	    if(!parked.containsKey(tokenNumber))
	    {
	    	throw new Exception("Token number is not valid");
	    }
		scan.nextLine();
        System.out.println("Enter the name");
        String name=scan.nextLine();
        
        System.out.println("Enter the mobile number");
         long mobileNumber=scan.nextLong();
         scan.nextLine();
        
		 if(referNumber.containsKey(mobileNumber))
		 {
			 int customerId=referNumber.get(mobileNumber);
			 //CustomerInformation cus=customerInfo.get(customerId);
			 
			 
		 }
		 else
		 {
			 CustomerInformation customer = new CustomerInformation(); 
			 customer.setName(name);
	         customer.setMobileNumber(mobileNumber);
	         customerId=generateCustomerId();
	         customer.setCustomerId(customerId);
	         customerInfo.put(customerId, customer);
	         referNumber.put(mobileNumber,customerId);
	         
		 }
	   
         checkCustomer.put(tokenNumber, customerId);
		scan.nextLine();
		System.out.println("To recharge your account  press 1 for yes "  );
		int  recharge=scan.nextInt();
		float wallet=0;
		if(recharge==1)
		{
		
		 wallet=rechargeCustomerAccount();
		}
		else 
		{
			System.out.println(" If you want to recharge your account in future kindly done through your customer info portal");
		}
					
		
		return wallet;
		
	}
	public void slotAllotment(String vehicleName,String vehicleNumber) throws Exception {
		
		System.out.println(vehicleName);
		int count=0;
		for(int i=0;i<floorNumber;i++)
		{
		Map<String, List<ParkingSpot>> mapObj = checkIn.get(i);
		List<ParkingSpot> listObj = mapObj.get(vehicleName);
		checkVehicleType(listObj);
		System.out.println(listObj.size());
		if (!listObj.isEmpty()) {
			
			ParkingSpot spotObj=listObj.get(0);
			int spotNumber=spotObj.getSpotNumber();
			System.out.println(spotObj);
			Map<String,List<ParkingSpot>>  filledMap=filled.get(i);
			if(filledMap== null)
			{
				filledMap=new HashMap<String,List<ParkingSpot>>();
			}
			List<ParkingSpot> park=filledMap.get(vehicleName);
			if(park == null)
			{
				park=new ArrayList<ParkingSpot>();
			}
			park.add(spotObj);
			filledMap.put(vehicleName,park);
			filled.put(i,filledMap);
			listObj.remove(0);
		    mapObj.put(vehicleName, listObj);
			checkIn.put(i, mapObj);
			System.out.println(listObj);
			tokenNumber = generateTokenNumber();
			SlotAllotment obj = new SlotAllotment();
			
			obj.setFloorNumber(i);
			obj.setVehicleType(vehicleName);
			obj.setVehicleNumber(vehicleNumber);
			obj.setSpotNumber(spotNumber);
			long time = System.currentTimeMillis();
			obj.setTime(time);
			parked.put(tokenNumber, obj);
			System.out.println(parked);
			break;
		} 
		else
		{
		count++;	
		}
		}
		if(count==floorNumber)
		{
			System.out.println("Slot is not available");
		}
		
	}
	
	

	public void slotRefreshed(int tokenNumber) throws Exception {
		
		boolean check=parkingPayment(tokenNumber);
		
		 if(check == true)
		 {
		   SlotAllotment slot = parked.get(tokenNumber);
			int floorNumber = slot.getFloorNumber();
			String vehicleType = slot.getVehicleType();
			int spotNumber = slot.getSpotNumber();
			
			//System.out.println("Coming");
			Map<String,List<ParkingSpot>> filledSpot=filled.get(floorNumber);
			List<ParkingSpot> listObj=filledSpot.get(vehicleType);
			for(int i=0;i<listObj.size();i++)
			{
				ParkingSpot obj=listObj.get(i);
				if(spotNumber==obj.getSpotNumber())
				{
				
				spaceAvailable=checkIn.get(floorNumber);
				List<ParkingSpot> list=spaceAvailable.get(vehicleType);
				list.add(obj);
				spaceAvailable.put(vehicleType,list);
				checkIn.put(floorNumber, spaceAvailable);
			    listObj.remove(obj);
				filledSpot.put(vehicleType, listObj);
				filled.put(floorNumber, filledSpot);
				
				}
			}
			
			
		}
		 
		 parked.remove(tokenNumber);
		 System.out.println("FilledMap-" +filled);
		 System.out.println("SlotMap-" +checkIn);
		 System.out.println("Token Alloted-" +parked);
	}
		
		
		
	
		
		

	public boolean parkingPayment(int tokenNumber) throws Exception {
		float amount = 0;
		float walletAmount=0;
	     walletAmount=customerDetails(tokenNumber);
			
		SlotAllotment slot = parked.get(tokenNumber);
		long time = slot.getTime();
		
		long time2 = System.currentTimeMillis();
	
		long diff = Math.abs(time - time2);
		diff = diff / 1000;
		

		if (diff <= 60) {
			amount = 4.0f;
		} else if (diff <= 120) {
			amount = 7.5f;
		} else if (diff <= 180) {
			amount = 11.0f;
		} else if (diff > 180) {
			float calculateTime = diff - 180;
		
			calculateTime = Math.round(calculateTime / 60);
			
			float amt = calculateTime * 2.5f;
			System.out.println("amt" + amt);
			amount = 11.0f + amt;
			System.out.println("amount" + amount);
		}
		System.out.println("Amount to pay" + amount);
	     walletAmount=walletAmount-amount;
	     if(walletAmount>=0)
	     {
	    	 System.out.println("Parking fee for your vehicle " + amount);
	    	 System.out.println("Payment Successful and amount received");
	    	 long mobileNumber=checkCustomer.get(tokenNumber);
	    	 CustomerInformation customer=customerInfo.get(customerId);
	    	 customer.setWallet(walletAmount);
	     }
	     
	     else if(walletAmount <0)
	     {
	    	 System.out.println(walletAmount);
	    	 System.out.println("Parking fee for your vehicle is "+Math.abs(walletAmount));
	    	System.out.println("Enter the option to choose for your payment " +"Press 1 for Cash or Press  2 for Card" );
	    	int option=scan.nextInt();
	    	boolean value=true;
	    	float amountToPay=0;
	    	amount=Math.abs(walletAmount);
	    	
	    		
	    	if(option==1)
	    	{
	    		System.out.println("Enter the amount for your payment");
	    		 amountToPay=scan.nextFloat();
	    	
	    	}
	    	else if(option==2)
	    		{
	    		System.out.println("Enter the card details for payment");
	    		long card=scan.nextLong();
	    		 System.out.println("Enter the amount for payment");
	    		 amountToPay=scan.nextFloat();
	    		 
	    	}
	    	while(value==true)
	    	{
	    	if(amountToPay!= amount)
    		{
    			System.out.println("Enter the  correct amount for your payment");
    			amountToPay=scan.nextFloat();
    			value=true;
    		}
    		else {
    			System.out.println("Amount Received ");
    			value=false;
    		}
	    	
	    	}
	     }
		
		return true;

	}
	
public void customerCheck()
{
	System.out.println(checkCustomer);
}
	
}
