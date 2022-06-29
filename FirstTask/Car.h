# include<iostream>
# include "Vehicle.h"
using namespace std;
class Car:public Vehicle
{

private:
    int numberOfPersons;
    string carType;

public:
    Car(string brd,string model,string type,string clr,int mileage,int amount,string car,int number):Vehicle( brd,model,type, clr,mileage, amount)
    {
        carType=car;
        numberOfPersons=number;
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




};



