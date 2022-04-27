package informationlayer;

import java.time.LocalTime;

public class SlotAllotment {
	
	
	private String vehicleType;
	private long time;
	private int spotNumber;
	private int floorNumber;
 
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
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "SlotAllotment [vehicleType=" + vehicleType + ", time=" + time + ", spotNumber=" + spotNumber
				+ ", floorNumber=" + floorNumber + "]";
	}
	
	
	

}
