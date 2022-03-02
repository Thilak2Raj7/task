package pack;

import java.io.Serializable;

public class CustomerDetails implements Serializable {
private int customerId;
private	String customerName;
private	int  age;
private	String Address;
private long mobileNumber;
private boolean customerStatus=true;

public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getCustomerId() {
	
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public boolean isCustomerStatus() {
	return customerStatus;
}
public void setCustomerStatus(boolean customerStatus) {
	this.customerStatus = customerStatus;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
@Override
public String toString() {
	return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age
			+ ", Address=" + Address + ", mobileNumber=" + mobileNumber + ", customerStatus=" + customerStatus + "]";
}



}



