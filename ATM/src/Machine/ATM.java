package Machine;

public class ATM {
private int count1;
private int count2;
private int count3;
private int  amount1;
private int  amount2;
private int amount3;
public int getCount1() {
	return count1;
}
public void setCount1(int count1) {
	this.count1 = count1;
}
public int getCount2() {
	return count2;
}
public void setCount2(int count2) {
	this.count2 = count2;
}
public int getCount3() {
	return count3;
}
public void setCount3(int count3) {
	this.count3 = count3;
}
public int getAmount1() {
	amount1=2000*getCount1();
	return amount1;
}
public void setAmount1(int amount1) {
	this.amount1 = amount1;
}
public int getAmount2() {
	amount2=500*getCount2();
	return amount2 ;
}
public void setAmount2(int amount2) {
	this.amount2 = amount2;
}
public int getAmount3() {
   amount3=100*getCount3();
	return  amount3;
}
public void setAmount3(int amount3) {
	this.amount3 = amount3;
}

}
