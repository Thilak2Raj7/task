package informationlayer;

import java.time.LocalTime;

public class SlotAllotment {
	
	private int tokenNumber;
	private String vehicleType;
	private String  time;
	private int floorNumber;

	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public int getTokenNumber() {
		return tokenNumber;
	}
	public int gettokenNumber() {
		return tokenNumber;
	}
	public void setTokenNumber(int tokenNumber) {
		this.tokenNumber = tokenNumber;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicletype) {
		this.vehicleType = vehicletype;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "SlotAllotment [tokenNumber=" + tokenNumber + ", vehicleType=" + vehicleType + ", time=" + time
				+ ", floorNumber=" + floorNumber + "]";
	}
	
	

}
