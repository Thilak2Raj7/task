package accountInformation;

public class TransactionDetails {
private int  amount;
private String transType;

private int accountId;
private int  balance;
private  String date;
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getTransType() {
	return transType;
}
public void setTransType(String transType) {
	this.transType = transType;
}
public int getAccountId() {
	return accountId;
}
public void setAccountId( int accountId) {
	this.accountId = accountId;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return  "[Amount  " + amount + " is transfered  "+ transType+" accountId "+ accountId
			+" date= "+ date + " your accountBalance =" + balance +"]";
}


}
