package constructparking;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import informationlayer.CustomerInformation;
import informationlayer.ParkingSpot;
import informationlayer.SlotAllotment;

public class Cache {

	static Map<Integer, Map<String, List<Integer>>> checkIn = new HashMap<Integer, Map<String, List<Integer>>>();
	Map<String, List<Integer>> spaceAvailable = new HashMap<String, List<Integer>>();
     String[] array= {"Compact",  "Large", "Handicapped",
    		 "MotorCycle","ElectricVehicle"};
  
   
   
   
	static Map<Integer, SlotAllotment> parked = new HashMap<Integer, SlotAllotment>();
	static Map<Integer, CustomerInformation> customerMap = new HashMap<Integer, CustomerInformation>();
	List<ParkingSpot> emptySpots = new ArrayList();
	List<ParkingSpot> occupiedSpots = new ArrayList();
	Scanner scan = new Scanner(System.in);
	int customerId = 0;
  int k=1;
	int tokenNumber = 0;
   int floorNumber=0;
   
	public Cache() {
		System.out.println("Enter the number of floors");
		 floorNumber = scan.nextInt();
		 int vehicleSlot=scan.nextInt();
		
        for(int i=0;i<floorNumber;i++)
        {
       
        	for(int j=1;j<=vehicleSlot;j++)
        	{
        	Map<String,List<Integer>> spaceAvailable=checkIn.get(i);
        		
        	if(j<=2)
        	{
        		if(spaceAvailable==null)
    		{
    			spaceAvailable=new HashMap<String,List<Integer>>();
    		}
        		
                List<Integer> slot=spaceAvailable.get("Compact");
                if(slot== null)
                {
                	slot=new ArrayList();
                	
                }
        		slot.add(j);
        		spaceAvailable.put("Compact", slot);
        	}
        	else if(j>=3 && j<=4)
        	{
        		
        		
                List<Integer> slot=spaceAvailable.get("Large");
                if(slot== null)
                {
                	slot=new ArrayList();
                	
                }
        		slot.add(j);
        		spaceAvailable.put("Large", slot);
        	}
        	else if(j>=5 && j<=6)
        	{
        		
        		
                List<Integer> slot=spaceAvailable.get("Handicapped");
                if(slot== null)
                {
                	slot=new ArrayList();
                	
                }
        		slot.add(j);
        		spaceAvailable.put("Handicapped", slot);
        	}
        	else if(j>=7 && j<=8)
        	{
        		
        		
                List<Integer> slot=spaceAvailable.get("MotorCycle");
                if(slot== null)
                {
                	slot=new ArrayList();
                	
                }
        		slot.add(j);
        		spaceAvailable.put("MotorCycle", slot);
        	}
        	else if(j>=9 && j<=10)
        	{
        		
        		
                List<Integer> slot=spaceAvailable.get("ElectricVehicle");
                if(slot== null)
                {
                	slot=new ArrayList();
                	
                }
        		slot.add(j);
        		spaceAvailable.put("ElectricVehicle", slot);
        	}
        	
        	checkIn.put(i, spaceAvailable);
        }
        }
		
		System.out.println(checkIn);
		for (int i = 0; i < floorNumber; i++) {
			for (int j = 1; j <= 10; j++) {
				ParkingSpot object = new ParkingSpot();
				if (j <= 2) {

					object.setSpotNumber(j);
					object.setVehicleType("Compact");
					object.setFloorNumber(i);

				}

				else if (j <= 4) {

					object.setSpotNumber(j);
					object.setVehicleType("Large");
					object.setFloorNumber(i);

				}

				else if (j <= 6) {

					object.setSpotNumber(j);
					object.setVehicleType("Handicapped");
					object.setFloorNumber(i);

				}

				else if (j <= 8) {

					object.setSpotNumber(j);
					object.setVehicleType("Motor Cycle");
					object.setFloorNumber(i);

				}

				else if(j<=10){
					object.setSpotNumber(j);
					object.setVehicleType("Electric vehicle");
					object.setFloorNumber(i);
				}
				emptySpots.add(object);
			}
		}
		for (int i = 0; i < emptySpots.size(); i++) {
			System.out.println(emptySpots.get(i));
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

	public void getSlotMap() {
		System.out.println(checkIn);
	}

	public void getFilledMap() {
		System.out.println(parked);
	}

	public void checkFloorNumber(Map<String, List<Integer>> mapObj) throws Exception {
		if (mapObj == null) {
			throw new Exception("Floor number does not exist " + "Enter the " + "valid floor number !");
		}

	}

	public void checkVehicleType(List listObj) throws Exception {
		if (listObj == null) {
			throw new Exception("VehicleType does not exist " + "Enter the " + "valid details !");
		}
	}

	public void rechargeCustomerAccount(int tokenNumber) {
		System.out.println("Enter the wallet amount to recharge");
		float wallet = scan.nextFloat();
		CustomerInformation cusInfo = customerMap.get(tokenNumber);
		cusInfo.setWallet(wallet);
		System.out.println("Your wallet is recharged  succesfully");
	}

	public void slotAllotment( String vehicleName) throws Exception {
		//System.out.println(floorNumber);
		System.out.println(vehicleName);
		int count=0;
		for(int i=0;i<2;i++)
		{
		Map<String, List<Integer>> mapObj = checkIn.get(i);
		checkFloorNumber(mapObj);
		List<Integer> listObj = mapObj.get(vehicleName);
		checkVehicleType(listObj);
		if (!listObj.isEmpty()) {
			int spotNumber = listObj.get(0);
			
			System.out.println(spotNumber);
			listObj.remove(0);
			mapObj.put(vehicleName, listObj);
			checkIn.put(i, mapObj);
			System.out.println(listObj);
			tokenNumber = generateTokenNumber();
			SlotAllotment obj = new SlotAllotment();

			obj.setFloorNumber(i);
			obj.setVehicleType(vehicleName);
			obj.setSpotNumber(spotNumber);
			long time = System.currentTimeMillis();
			obj.setTime(time);
			parked.put(tokenNumber, obj);

			System.out.println(parked);
			CustomerInformation customer = new CustomerInformation();
			customerId = generateCustomerId();
			customer.setTokenNumber(floorNumber);
			customer.setVehicleType(vehicleName);
			customer.setCustomerId(customerId);
			scan.nextLine();
			System.out.println("If you wish to recharge your wallet Press yes or no");
			String pay = scan.nextLine();
			if (pay.equals("yes")) {
				rechargeCustomerAccount(tokenNumber);
			}

			customerMap.put(tokenNumber, customer);
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

	public void slotRefreshed(int tokenNumber) {
		float amount = parkingPayment(tokenNumber);
		System.out.println("Amount paid by customer is" + amount);
		SlotAllotment slot = parked.get(tokenNumber);
		int floorNumber = slot.getFloorNumber();
		String vehicleType = slot.getVehicleType();
		int spotNumber = slot.getSpotNumber();
		spaceAvailable = checkIn.get(floorNumber);
		List<Integer> list = spaceAvailable.get(vehicleType);
		list.add(spotNumber);
		parked.remove(tokenNumber);
	}

	public float parkingPayment(int tokenNumber) {
		float amount = 0;
		CustomerInformation customer = customerMap.get(tokenNumber);
		float walletAmount = customer.getWallet();

		SlotAllotment slot = parked.get(tokenNumber);
		long time = slot.getTime();
		System.out.println(time);
		long time2 = System.currentTimeMillis();
		System.out.println(time2);
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
			System.out.println("calTime" + calculateTime);
			calculateTime = Math.round(calculateTime / 60);
			System.out.println("calTime" + calculateTime);
			float amt = calculateTime * 2.5f;
			System.out.println("amt" + amt);
			amount = 11.0f + amt;
			System.out.println("amount" + amount);
		}
		if (walletAmount > amount) {
			walletAmount = walletAmount - amount;
			customer.setWallet(walletAmount);
			System.out.println("walletAmount" + walletAmount);
			System.out.println("amount" + amount);
		} else {
			amount = amount - walletAmount;
			customer.setWallet(0);
			System.out.println("walletAmount" + walletAmount);
			System.out.println("amount" + amount);
		}
		System.out.println("amount" + amount);
		return amount;

	}

}
