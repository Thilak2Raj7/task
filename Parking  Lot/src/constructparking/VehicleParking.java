package constructparking;

import java.util.List;
import java.util.Map;

import informationlayer.ParkingSpot;



public class VehicleParking {
 Cache storage=new Cache();
	
public void slotAllotment(String vehicleName,String vehicleNumber) throws Exception
{
	storage.slotAllotment(vehicleName,vehicleNumber);
}
public void  parkingPayment(int tokenNumber) throws Exception
{
	storage.slotRefreshed(tokenNumber);
}

public Map<Integer, Map<String, List<ParkingSpot>>>  getSlotMap()
{
	 return storage.getSlotMap();
}
public void getFilledMap()
{
	storage.getFilledMap();
}

public void rechargeWallet() throws Exception
{
	storage.rechargeCustomerAccount();
}

public void getCustomerMap()
{
	storage.getCustomerMap();
}
public void customerCheck()
{
	storage.customerCheck();
}
public void createCustomer(int tokenNumber) throws Exception
{
	storage.customerDetails(tokenNumber);
}
}
