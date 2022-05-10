package accountInformation;

public class TransactionDetails {
private int  amount;
private String transactionType;
private int senderAccountId;
private int receiverAccountId;
private int  balance;
private  String date;
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getTransactionType() {
	return transactionType;
}
public void setTransactionType(String transactionType) {
}
public int getSenderAccountId() {
	return senderAccountId;
}
public void setSenderAccountId( int senderAccountId) {
	this.senderAccountId = senderAccountId;
}
public int getReceiverAccountId() {
	return receiverAccountId;
}
public void setReceiverAccountId( int receiverAccountId) {
	this.receiverAccountId = receiverAccountId;
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
	return  "[Amount  " + amount + " is transfered from accountId  "+senderAccountId+" "  +" to accountId "+ receiverAccountId
			+" date= "+ date + " your accountBalance =" + balance +"]";
}


}
