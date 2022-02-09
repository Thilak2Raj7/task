package pack;

public class CustomerDetails {
private int customerId;
private	String customerName;
private	int  age;
private	String Address;

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
	return "[customerId=" + customerId + ", customerName=" + customerName + ", age=" + age
			+ ", Address=" + Address + "]";
}

}



