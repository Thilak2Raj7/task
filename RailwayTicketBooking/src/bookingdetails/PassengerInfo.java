package bookingdetails;

public class PassengerInfo {

	
	
private int serialNumber;	
private String name;
private int age;
private String gender;
private String berthPreference;
private int seatNumber;
private String status;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBerthPreference() {
	return berthPreference;
}
public void setBerthPreference(String berthPreference) {
	this.berthPreference = berthPreference;
}
public void setSeatNumber(int seatNumber)
{
	this.seatNumber=seatNumber;
}
public int getSeatNumber() {

return seatNumber;
}

public String getStatus()
{
return status;
}

public void setStatus(String status)
{
	this.status=status;
}

public int getSerialNumber() {
	return serialNumber;
}
public void setSerialNumber(int serialNumber) {
	this.serialNumber = serialNumber;
}
@Override
public String toString() {
	return "PassengerInfo [serialNumber=" + serialNumber + ", name=" + name + ", age=" + age + ", gender=" + gender
			+ ", berthPreference=" + berthPreference + ", seatNumber=" + seatNumber + "]";
}



}
