package Machine;

public class Transaction {
private long accountNumber;
private long receiverAccountNumber;
private long amountTransfered;
private long closingBalance;
private String transferType;
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public long getReceiverAccountNumber() {
	return receiverAccountNumber;
}
public void setReceiverAccountNumber(long receiverAccountNumber) {
	this.receiverAccountNumber = receiverAccountNumber;
}
public long getAmountTransfered() {
	return amountTransfered;
}
public void setAmountTransfered(long amountTransfered) {
	this.amountTransfered = amountTransfered;
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
	return "Transaction [accountNumber=" + accountNumber + ", receiverAccountNumber=" + receiverAccountNumber
			+ ", amountTransfered=" + amountTransfered + ", closingBalance=" + closingBalance + ", transferType="
			+ transferType + "]";
}

}
