package carshowroom;

public class Branch {
 
	String branchName;
	int availableStock;
	int soldStock=0;
	
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getAvailableStock() {
		return availableStock;
	}

	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}

	public int getSoldStock() {
		return soldStock;
	}

	public void setSoldStock(int soldStock) {
		this.soldStock = soldStock;
	}

	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", availableStock=" + availableStock + ", soldStock=" + soldStock
				+ "]";
	}
	
}
