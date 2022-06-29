#include<iostream>
#include"Namespace.h"

int main()
{
    school::student obj;
    obj.display();
    college::department2::getNumber();
    college::getNumber();
    cout<<"The fuel name of vehicle is "<<vehicle::car::fuelType::fuelName;
    return 0;

}
