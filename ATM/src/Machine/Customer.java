package Machine;

public class Customer {
private long accountNumber;
private String name;
private int age;
private long accountBalance;
private int pinNumber;
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(long accountBalance) {
	this.accountBalance = accountBalance;
}
public int getPinNumber() {
	return pinNumber;
}
public void setPinNumber(int pinNumber) {
	this.pinNumber = pinNumber;
}
@Override
public String toString() {
	return "Customer [accountNumber=" + accountNumber + ", name=" + name + ", age=" + age + ", accountBalance="
			+ accountBalance + ", pinNumber=" + pinNumber + "]";
}

}
