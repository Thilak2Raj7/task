package Machine;

public class Transaction {
//private long accountNumber;
//private long receiverAccountNumber;
private String description;
private long closingBalance;
private String transferType;
private int amount;
private int transactionNumber;
public int getTransactionNumber() {
	return transactionNumber;
}
public void setTransactionNumber(int transactionNumber) {
	this.transactionNumber = transactionNumber;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
//public long getAccountNumber() {
//	return accountNumber;
//}
//public void setAccountNumber(long accountNumber) {
//	this.accountNumber = accountNumber;
//}

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public long getClosingBalance() {
	return closingBalance;
}
public void setClosingBalance(long closingBalance) {
	this.closingBalance = closingBalance;
}
public String getTransferType() {
	return transferType;
}
public void setTransferType(String transferType) {
	this.transferType = transferType;
}
@Override
public String toString() {
	return "Transaction [ description=" + description + ", closingBalance=" + closingBalance + ", transferType=" + transferType
			+ ", amount=" + amount + "]";
}


}
