package bookingdetails;

public class SeatInfo {

	
	private int seatNumber;
	private String berthType;
	
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getBerthType() {
		return berthType;
	}
	public void setBerthType(String berthType) {
		this.berthType = berthType;
	}
	@Override
	public String toString() {
		return "SeatInfo [seatNumber=" + seatNumber + ", berthType=" + berthType + "]";
	}

	
}
