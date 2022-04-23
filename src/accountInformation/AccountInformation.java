package accountInformation;

public class AccountInformation {

	private int accountId;
	private int accountBalance=1000;
    private int customerId;
	private String branch;
	private boolean accountStatus= true;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public boolean isAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}
	@Override
	public String toString() {
		return "AccountInformation [accountId=" + accountId + ", accountBalance=" + accountBalance + ", customerId="
				+ customerId + ", branch=" + branch + ", accountStatus=" + accountStatus + "]";
	}


	
}
