package bank;

import java.io.Serializable;

public class AccountDetails implements Serializable {
	private int accountId;
	private  long accountNumber;
	private  int accountBalance=1000;
	private  String branch;
	private  int customerId;
	private boolean accountStatus=true;
	
	
	public boolean isAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}

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
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
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
		return "AccountDetails [accountId=" + accountId + ", accountNumber=" + accountNumber + ", accountBalance="
				+ accountBalance + ", branch=" + branch + ", customerId=" + customerId + ", accountStatus="
				+ accountStatus + "]";
	}


	
	
	
	
}
	/*private String accountId;  
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}*/
	
	

