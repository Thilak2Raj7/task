package pack;

public class AccountDetails {
	private int accountId;
	private  long accountNumber;
	private  double accountBalance;
	private  String branch;
	private  int customerId;
	
	
	
	public int getAccountId() {
		return accountId;
	}
	
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "[accountId=" + accountId + ", accountNumber=" + accountNumber + ", accountBalance="
				+ accountBalance + ", branch=" + branch + ", customerId=" + customerId + "]";
	}
	
	
	
}
	/*private String accountId;  
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}*/
	
	