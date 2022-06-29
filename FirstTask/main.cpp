#include <iostream>
#include "Vehicle.h"
#include "Car.h"
#include "Bike.h"
using namespace std;
    string vehicleName;
    string model;
    string vehicleType;
    string color;
    string mileage;
    int price;
    string type;
    int numberOfPersons;
  namespace details
  {
  string getName()
    {
        cout<<"Enter the vehicle name"<<endl;
        cin>>vehicleName;
        return vehicleName;
    }
    string getModel()
    {
        cout<<"Enter the model name"<<endl;
        cin>>model;
        return model;
    }
    string getVehicleType()
    {
        cout<<"Enter the fuel type of vehicle"<<endl;
        cin>>vehicleType;
        return vehicleType;
    }
    string getColor()
    {
        cout<<"Enter the color of vehicle"<<endl;
        cin>>color;
        return color;
    }
    int getMileage()
    {
        cout<<"Enter the mileage of vehicle"<<endl;
        cin>>mileage;
    }
    int getPrice()
    {
        cout<<"Enter the price of vehicle"<<endl;
        cin>>price;
        return price;
    }
    string getType()
    {
        cout<<"Enter the type of vehicle"<<endl;
        cin>>type;
        return type;
    }
    int getNumberOfPerson()
    {
        cout<<"Enter the number of Person"<<endl;
        cin>>numberOfPersons;
        return numberOfPersons;
    }
    }
  using namespace details;
  int main()
{


    Car veh1(getName(),getModel(),getVehicleType(),getColor(),getMileage(),getPrice(),getType(),getNumberOfPerson());
    cout<<veh1;

    //Car veh2(getName(),getModel(),getVehicleType(),getColor(),getMileage(),getPrice(),getType(),getNumberOfPerson());
    //cout<<veh2;

    Bike veh3(  getName(),getModel(),getVehicleType(),getColor(),getMileage(),getPrice(),getType(),getNumberOfPerson());
    cout<<veh3;



    if(veh1 > veh3)
    {
        cout<<"The vehicle 1 is more costlier than vehicle 3"   <<endl;
    }
    else
    {
        cout<< "The vehicle 3 is more costlier than vehicle 1 "<<endl;
    }


};


