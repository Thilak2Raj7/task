
# include<iostream>
# include "Vehicle.h"
using namespace std;
class  Bike:public Vehicle
{
public:
 int bikeWeight;
 string bikeType;

 Bike(string brd,string model,string type,string clr,int mileage,int amount):Vehicle( brd,model,type, clr,mileage, amount)
 {

 }

 public:
 void setBikeWeight(int number)
 {
 bikeWeight=number;
 }

 public:
int getBikeWeight()
{
return bikeWeight;
}


 void setBikeType(string type)
 {
 bikeType=type;
 }


string getBikeType()
{
return bikeType;
}




int getNumberOfWheels()
{
return 2;
}

void display()
{
cout << brand<<" " << model<<" "<<vehicle_type<<" "<<color<<" "<< price;

}



};






