package accountInformation;

public class LoanDetails {
	
	private int    accountId;
	
	private String loanType;

	private String date;
    private long   loanAmount;
    private String loanStatus="pending";
    private long panCardId;
    public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}



	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public long getPanCardId() {
		return panCardId;
	}

	public void setPanCardId(long panCardId) {
		this.panCardId =panCardId ;
	}

	@Override
	public String toString() {
		return "LoanDetails [accountId=" + accountId + ", loanType=" + loanType + ", date=" + date + ", loanAmount="
				+ loanAmount + ", loanStatus=" + loanStatus + ", panCardId=" + panCardId + "]";
	}

	
	
}
