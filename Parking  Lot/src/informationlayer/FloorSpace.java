package informationlayer;

public class FloorSpace {
private int totalFloor=3;
private int compact=5;
private int currentFloor;

private int large=3;
private int motorCycle=5;
private int handicapped=2;
private int electricVehicle=1;
public int getTotalFloor() {
	return totalFloor;
}
public void setTotalFloor(int totalFloor) {
	this.totalFloor = totalFloor;
}
public int getCompact() {
	return compact;
}
public void setCompact(int compact) {
	this.compact = compact;
}
public int getLarge() {
	return large;
}
public void setLarge(int large) {
	this.large = large;
}
public int getMotorCycle() {
	return motorCycle;
}
public void setMotorCycle(int motorCycle) {
	this.motorCycle = motorCycle;
}
public int getHandicapped() {
	return handicapped;
}
public void setHandicapped(int handicapped) {
	this.handicapped = handicapped;
}
public int getElectricVehicle() {
	return electricVehicle;
}
public void setElectricVehicle(int electricVehicle) {
	this.electricVehicle = electricVehicle;
}
public int getCurrentFloor() {
	return currentFloor;
}
public void setCurrentFloor(int currentFloor) {
	this.currentFloor = currentFloor;
}
@Override
public String toString() {
	return "FloorSpace [totalFloor=" + totalFloor + ", compact=" + compact + ", currentFloor=" + currentFloor
			+ ", large=" + large + ", motorCycle=" + motorCycle + ", handicapped=" + handicapped + ", electricVehicle="
			+ electricVehicle + "]";
}

}
