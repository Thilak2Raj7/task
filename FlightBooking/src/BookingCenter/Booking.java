package BookingCenter;

import java.util.ArrayList;
import java.util.List;

public class Booking {
private int bookingId;
private int amount;
private String departure;
private String destination;
private String date;
private boolean mealPreference=false;
private int numberOfPassengers;
public List<String> listObj=new ArrayList<>();
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
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public boolean isMealPreference() {
	return mealPreference;
}
public void setMealPreference(boolean mealPreference) {
	this.mealPreference = mealPreference;
}

@Override
public String toString() {
	return "Booking [bookingId=" + bookingId + ", amount=" + amount + ", departure=" + departure + ", destination="
			+ destination + ", date=" + date + ", mealPreference=" + mealPreference + "]";
}
}
