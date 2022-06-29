#ifndef NAMESPACE_H_INCLUDED
#define NAMESPACE_H_INCLUDED


#include <iostream>
#include<math.h>
using namespace std;

namespace school
{
void display()
{

}
class student
{

public :
    void display();

};
}

void school::student::display()
{
    cout<<"The function display is called"<<endl;
}


namespace college
{
//using namespace std;
int number=25;


inline namespace department1
{
void getNumber()
{
    cout<<"The square root of number is "<<sqrt(number)<<endl;
}
}
namespace department2
{

void getNumber()
{
    cout<<"The cube root of number is  "<<cbrt(number)<<endl;
}

}
}

namespace vehicle
{
namespace car
{
namespace fuelType
{
string fuelName="Diesel";
}
}
}









#endif // NAMESPACE_H_INCLUDED
