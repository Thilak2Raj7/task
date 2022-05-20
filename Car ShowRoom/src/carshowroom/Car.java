package carshowroom;

public class Car {
	
 String carName;
 int carNumber;
 String carOwner;
 long aadharNumber;
 String city;
 String branch;
 
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public int getCarNumber() {
	return carNumber;
}
public void setCarNumber(int carNumber) {
	this.carNumber = carNumber;
}
public String getCarOwner() {
	return carOwner;
}
public void setCarOwner(String carOwner) {
	this.carOwner = carOwner;
}
public long getAadharNumber() {
	return aadharNumber;
}
public void setAadharNumber(long aadharNumber) {
	this.aadharNumber = aadharNumber;
}
@Override
public String toString() {
	return "Car [carName=" + carName + ", carNumber=" + carNumber + ", carOwner=" + carOwner + ", aadharNumber="
			+ aadharNumber + ", city=" + city + ", branch=" + branch + "]";
}

 
 
}
