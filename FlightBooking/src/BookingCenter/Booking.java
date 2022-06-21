package BookingCenter;

public class Booking {
private String passengerName;
private String departure;
private String destination;
private String date;
public String getPassengerName() {
	return passengerName;
}
public void setPassengerName(String passengerName) {
	this.passengerName = passengerName;
}
public String getDeparture() {
	return departure;
}
public void setDeparture(String departure) {
	this.departure = departure;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "Booking [passengerName=" + passengerName + ", departure=" + departure + ", destination=" + destination
			+ ", date=" + date + "]";
}

}
