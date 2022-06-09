#include <iostream>
#include "Vehicle.h"
#include "Car.h"
#include "Bike.h"
using namespace std;

int main()
{
   Car veh1("Audi","R8","Diesel","Red",20,46L);
//("Yamaha","TwoWheeler","Red",0,1L);
veh1.display();
 Car veh2("Audi","R8","Diesel","Red",20,40L);

Bike veh3("Pulsar","Nz","Petrol","Black",35,1L);
veh2.display();
if(veh1 > veh2)
{
cout<< "/n"<<true;
}
else{
cout<< false;
}
}


