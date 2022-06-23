package BookingCenter;

public class Passenger {
private String passengerName;
private String address;
private int age;

public String getPassengerName() {
	return passengerName;
}
public void setPassengerName(String passengerName) {
	this.passengerName = passengerName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Passenger [passengerName=" + passengerName + ", address=" + address + ", age=" + age + "]";
}


}