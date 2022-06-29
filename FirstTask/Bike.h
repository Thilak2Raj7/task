# include<iostream>
# include "Vehicle.h"
using namespace std;
class  Bike:public Vehicle
{
private:
    int bikeWeight;
    string bikeType;

public:
    Bike(string brd,string model,string type,string clr,int mileage,int amount,string bike,int weight):Vehicle( brd,model,type, clr,mileage, amount)
    {
        bikeWeight=weight;
        bikeType=bike;
    }

public:
    int getBikeWeight()
    {
        return bikeWeight;
    }
    string getBikeType()
    {
        return bikeType;
    }
    int getNumberOfWheels()
    {
        return 2;
    }




//void display()
//{
//cout<<"The brand name of vehicle is  "<<getBrand()<<endl;
//cout<<"The model of vehicle is "<<getModel()<<endl;
//cout<<"The type of vehicle is  "<<getVehicleType()<<endl;
//cout<<"The colour of vehicle is  "<<getColor()<<endl;
//cout<<"The price of vehicle is  "<<getPrice()<<endl;
//cout<<"The number of wheels in bike is   "<< getNumberOfWheels();
//cout<<endl;
//}


};






