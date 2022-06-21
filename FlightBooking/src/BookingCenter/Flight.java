package BookingCenter;

public class Flight {
private String flightName;
private int numberOfSeats;
private int businessClassSeats;
private int economyClassSeats;
public String getFlightName() {
	return flightName;
}
public void setFlightName(String flightName) {
	this.flightName = flightName;
}
public int getNumberOfSeats() {
	return numberOfSeats;
}
public void setNumberOfSeats(int numberOfSeats) {
	this.numberOfSeats = numberOfSeats;
}
public int getBusinessClassSeats() {
	return businessClassSeats;
}
public void setBusinessClassSeats(int businessClassSeats) {
	this.businessClassSeats = businessClassSeats;
}
public int getEconomyClassSeats() {
	return economyClassSeats;
}
public void setEconomyClassSeats(int economyClassSeats) {
	this.economyClassSeats = economyClassSeats;
}
@Override
public String toString() {
	return "Flight [flightName=" + flightName + ", numberOfSeats=" + numberOfSeats + ", businessClassSeats="
			+ businessClassSeats + ", economyClassSeats=" + economyClassSeats + "]";
}

}
