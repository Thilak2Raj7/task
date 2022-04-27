package informationlayer;

public class CustomerInformation {

	
private String vehicleType;

private int tokenNumber;
private float wallet=0;
private int customerId;



public String getVehicleType() {
	return vehicleType;
}


public void setVehicleType(String vehicleType) {
	this.vehicleType = vehicleType;
}


public int getTokenNumber() {
	return tokenNumber;
}

public void setTokenNumber(int tokenNumber) {
	this.tokenNumber = tokenNumber;
}

public float getWallet() {
	return wallet;
}
public void setWallet(float wallet)
{
  this.wallet=wallet;	
}

public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId=customerId;
}
@Override
public String toString() {
	return "CustomerInformation [vehicleType=" + vehicleType +  ", tokenNumber="
			+ tokenNumber + ", wallet=" +wallet + 
			 "]";
}
}
