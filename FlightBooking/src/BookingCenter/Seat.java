

package BookingCenter;

public class Seat {
private String seatName;
private String classType;
private String seatType;
private String flightName;
private int amount;


public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getFlightName() {
	return flightName;
}
public void setFlightName(String flightName) {
	this.flightName = flightName;
}
public String getSeatName() {
	return seatName;
}
public void setSeatName(String seatName) {
	this.seatName = seatName;
}
public String getClassType() {
	return classType;
}
public void setClassType(String classType) {
	this.classType = classType;
}
public String getSeatType() {
	return seatType;
}
public void setSeatType(String seatType) {
	this.seatType = seatType;
}
@Override
public String toString() {
	return "Seat [seatName=" + seatName + ", classType=" + classType + ", seatType=" + seatType + ", flightName="
			+ flightName + "]";
}



}
