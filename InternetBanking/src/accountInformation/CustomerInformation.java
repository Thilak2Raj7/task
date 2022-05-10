package accountInformation;

public class CustomerInformation {
private int customerId;
private String customerName;
private int age;
private String password;
private boolean role=false;
private String address;
private boolean accountStatus=true;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
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
public boolean getRole() {
	return role;
}
public void setRole(boolean role) {
	this.role = role;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password =password;
}
public boolean isAccountStatus() {
	return accountStatus;
}
public void setAccountStatus(boolean accountStatus) {
	this.accountStatus = accountStatus;
}
@Override
public String toString() {
	return "CustomerInformation [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age
			+ ", password=" + password + ", role=" + role + ", address=" + address + ", accountStatus="
			+ accountStatus + "]";
}
}

