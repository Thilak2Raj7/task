package bank;

import java.io.Serializable;

public class CustomerDetails implements Serializable 
{
	private int customerId;
	private	String customerName;
	private	int  age;
	private long MobileNumber;
	private	String Address;
	private boolean customerStatus=true;
	
	
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public boolean isCustomerStatus()
	{
		return customerStatus;
	}
	public void setCustomerStatus(boolean accountStatus) {
		this.customerStatus =customerStatus;
	}
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
	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age
				+ ", MobileNumber=" + MobileNumber + ", Address=" + Address + ", customerStatus=" + customerStatus
				+ "]";
	}
	
}






