package informationlayer;

public class CustomerInformation {

private String name;
private long mobileNumber;
private int customerId;
private float wallet=0;
//private int customerId;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber2) {
	this.mobileNumber = mobileNumber2;
}

public float getWallet() {
	return wallet;
}
public void setWallet(float wallet) {
	this.wallet = wallet;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
@Override
public String toString() {
	return "CustomerInformation [name=" + name + ", mobileNumber=" + mobileNumber +  ", wallet="
			+ wallet +", customerId=" + customerId+"]";
}
}




