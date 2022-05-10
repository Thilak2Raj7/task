package informationlayer;

import java.time.LocalTime;
import java.util.Date;

public class SlotAllotment {
	
	
	private String vehicleType;
	private long time;
	private int spotNumber;
	private int floorNumber;
    private String vehicleNumber;
    private int customerId;
    
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
    
    
	public int getSpotNumber() {
		return spotNumber;
	}
	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicletype) {
		this.vehicleType = vehicletype;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "SlotAllotment [vehicleType=" + vehicleType +", vehicleNumber=" + vehicleNumber + ", time=" + new Date(time) + ", spotNumber=" + spotNumber
				+ ", floorNumber=" + floorNumber + ",customerId="+ customerId +"]";
	}
	
	
	

}
