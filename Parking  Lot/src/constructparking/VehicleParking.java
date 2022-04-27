package constructparking;

import java.util.List;
import java.util.Map;



public class VehicleParking {
 Cache storage=new Cache();
	
public void slotAllotment(String vehicleName) throws Exception
{
	storage.slotAllotment(vehicleName);
}
public void  parkingPayment(int tokenNumber)
{
	storage.slotRefreshed(tokenNumber);
}

public void  getSlotMap()
{
	storage.getSlotMap();
}
public void getFilledMap()
{
	storage.getFilledMap();
}

}

