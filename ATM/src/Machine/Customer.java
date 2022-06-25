package Machine;

public class Customer {
private long accountNumber;
private String name;
private  int accountBalance;
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

public int getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(int accountBalance) {
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
	return "Customer [accountNumber=" + accountNumber + ", name=" + name + ", accountBalance="
			+ accountBalance + ", pinNumber=" + pinNumber + "]";
}

}
