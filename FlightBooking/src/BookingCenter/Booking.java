package BookingCenter;

import java.util.*;
public class Booking {
private int bookingId;
private int amount;
private String departure;
private String destination;
private Date date;
private boolean mealPreference=false;
private int numberOfPassengers;
private String flightName;
private String seatName;


public List<String> list=new ArrayList<>();
public List<Passenger> passengerList=new ArrayList<>();
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
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
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public boolean isMealPreference() {
	return mealPreference;
}
public void setMealPreference(boolean mealPreference) {
	this.mealPreference = mealPreference;
}
public String getFlightName() {
	return flightName;
}
public void setFlightName(String flightName) {
	this.flightName = flightName;
}

public int getNumberOfPassengers() {
	return numberOfPassengers;
}
public void setNumberOfPassengers(int numberOfPassengers) {
	this.numberOfPassengers = numberOfPassengers;
}
@Override
public String toString() {
	return "Booking [bookingId=" + bookingId + ", amount=" + amount + ", departure=" + departure + ", destination="
			+ destination + ", date=" +date+ ", mealPreference=" + mealPreference + "]";
}
}
