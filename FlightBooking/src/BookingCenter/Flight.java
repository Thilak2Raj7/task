package BookingCenter;

public class Flight {
private String flightName;
private int businessPrice=0;
private int EconomyPrice=0;
private int numberOfBookings=0;
public int getNumberOfBookings() {
	return numberOfBookings;
}
public void setNumberOfBookings(int numberOfBookings) {
	this.numberOfBookings = numberOfBookings;
}
public String getFlightName() {
	return flightName;
}
public void setFlightName(String flightName) {
	this.flightName = flightName;
}
public int getBusinessPrice() {
	return businessPrice;
}
public void setBusinessPrice(int businessPrice) {
	this.businessPrice = businessPrice;
}
public int getEconomyPrice() {
	return EconomyPrice;
}
public void setEconomyPrice(int economyPrice) {
	EconomyPrice = economyPrice;
}
@Override
public String toString() {
	return "Flight [flightName=" + flightName + ", businessPrice=" + businessPrice + ", EconomyPrice=" + EconomyPrice
			+ ", numberOfBookings=" + numberOfBookings + "]";
}


}
