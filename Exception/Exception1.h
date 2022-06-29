#ifndef EXCEPTION1_H_INCLUDED
#define EXCEPTION1_H_INCLUDED
using namespace std;
class Exception1{


public:
 int getNumber(int a,int b)
 {

 if(b==0)
 {
 throw "Divide by zero error";
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
throw("Array index is invalid");
}
}


int getStringIndex(string name,int index)
{
int length=name.length();
if(length>index && index>=0)
{
return name[index];
}
else
{
throw("String index is invalid");
}


}
/*int castString(string name)
{
try{
int value;

if(value=(int)name)
throw("Format mismatch");
return value;
}
catch(const char except)
{
cout<<except;
}*/


};


#endif // EXCEPTION1_H_INCLUDED
