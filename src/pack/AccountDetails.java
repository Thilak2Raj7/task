package pack;

import java.io.Serializable;

public class AccountDetails implements Serializable  {
   private int accountId=100;
	
	private  long accountNumber;
	private  int accountBalance=1000;
	private  String branch;
	private  int customerId;
	private  boolean accountStatus=true;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public  void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getBranch() {
		return branch;
	}
   public void setBranch(String branch) {
		this.branch = branch;
	}
	public  int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public boolean isAccountStatus() {
		return accountStatus;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountId=" + accountId + ", accountNumber=" + accountNumber + ", accountBalance="
				+ accountBalance + ", branch=" + branch + ", customerId=" + customerId + ", accountStatus="
				+ accountStatus + "]";
	}
	
	
	
}
	

	
	
	
	

	