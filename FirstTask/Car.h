
# include<iostream>
# include "Vehicle.h"
using namespace std;
class Car:public Vehicle
{

public:
 int numberOfPersons;
 string carType;

 Car(string brd,string model,string type,string clr,int mileage,int amount):Vehicle( brd,model,type, clr,mileage, amount)
 {

 }


 public:
 void setNumberOfPersons(int number)
 {
 numberOfPersons=number;
 }

 void setCarType(string type)
 {
 carType=type;
 }


string getCarType()
{
return carType;
}


int getNumberOfPersons()
{
return numberOfPersons;
}


int getNumberOfWheels()
{
return 4;
}

string getBrand()
{
return brand;
}

 string getColor()
{
return color;
}

int getPrice()
{
return price;
}


void display()
{
cout << brand<<" " << model<<" "<<vehicle_type<<" "<<color<<" "<< price ;

}


};



