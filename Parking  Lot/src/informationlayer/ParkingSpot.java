package informationlayer;

public class ParkingSpot {
	private int spotNumber;
	private String vehicleType;
	private int floorNumber;
	private int tokenNumber;
	private int chargingPort=2;
	public int getSpotNumber() {
		return spotNumber;
	}
	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public int getTokenNumber() {
		return tokenNumber;
	}
	public void setTokenNumber(int tokenNumber) {
		this.tokenNumber = tokenNumber;
	}
	
	
	public int getChargingPort() {
		return chargingPort;
	}
	public void setChargingPort(int chargingPort) {
		this.chargingPort = chargingPort;
	}
	@Override
	public String toString() {
		return "ParkingSpot [spotNumber=" + spotNumber + ", vehicleType=" + vehicleType + ", floorNumber=" + floorNumber
				+ ", tokenNumber=" + tokenNumber + ",chargingPort="+chargingPort+"]";
	}

}
