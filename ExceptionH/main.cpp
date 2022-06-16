#include <iostream>
#include <stdexcept>
#include "Exception1.h"
using namespace std;

int main()
{

 string name;
 int index;
 int a;
 int b;
 int array[3]={1,2,3};
/*
cout<<"Enter the value of a";
cin>>a;
cout<<"Enter the value of b";
cin>>b;
cout<<"Enter the name ";
cin>>name;*/
Exception1 exp;
/*try{
int value=exp.getNumber(a,b);
cout<<"The value is" <<value;
}
catch(const char *except)
{
cout<<except;
}
try{
int value=exp.castString(name);
cout<<"The string is "<<value;

}
catch(const char *except1)
{
cout<<except1;
}*/
try
{
int number=sizeof(array)/sizeof(array[0]);
int  str=exp.getStringName(array,5,number);
cout<<"The number   is" <<str;
}
catch(const char *excep)
{
cout<<excep;
}
try
{
char ch=exp.getStringIndex("Thilak",10);
cout<<"The letter in the name is "<<ch;
}
catch(const char *excep)
{
cout<<excep;
}



}

