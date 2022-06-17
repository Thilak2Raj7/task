#ifndef EXCEPTION_H_INCLUDED
#define EXCEPTION_H_INCLUDED
#include<exception>
#include "MyException.h"
using namespace std;
class Exception{
string msg;

public:
 int getNumber(int a,int b)
 {

 if(b==0)
 {
 msg="Divide by zero error";
 MyException myExcept(msg);
 throw myExcept;
 //throw myExcept;
 //throw "Divide by zero error";
  }

 else
 {
 return a/b;

 }
 }

 int getStringName(int* array,int index,int length )
{
if(length>index && index>=0)
{
return array[index];
}
else
{
msg="Array index is invalid";
MyException except(msg);
throw except;
}
}


char getStringIndex(string name,int index)
{
int length=name.length();
if(length>index && index>=0)
{
return name[index];
}
else
{
msg="String index is invalid";
MyException except(msg);
throw except;
}


}


/*int castString(string name)
{
int value;
try{
if(!isdigit(stoi(name)))
{
msg="Format Mismatch";
MyException except(msg);
throw except;
}
else
{
value=stoi(name);
}
}

catch(invalid_argument const &e)
{
e.what();
}
return value;

}*/
};


#endif // EXCEPTION1_H_INCLUDED


