#include <iostream>
using namespace std;
#include <stdexcept>
#include "Exception.h"
#include "MyException.h"
#include "Student.h"
#include "AgeNotWithinRange.h"
#include "NameNotValidException.h"
#include "CourseNotValidException.h"

int main()
{
string name;
 int value1;
 int value2;
 Exception exp;
int num;
 try
 {
 cout<<"Enter the option to perform operation";
 cin>>num;

 }
 catch(Exception &e )
 {
 cout<<"The operation is not valid!";
 }

switch(num)
{
case 1:
{
cout<<"Enter the value of value1";
cin>>value1;
cout<<"Enter the value of value 2";
cin>>value2;
try{
int value=exp.getNumber(value1,value2);//Divide by zero exception
cout<<"The value is" <<value;
}
catch(MyException excep)
{
cout<<excep.what();
}
break;
}
case 2:
{
cout<<"Enter the name";//Format mismatch exception
cin>>name;
try{

//int value=exp.castString(name);
//cout<<"The value is  "<< value<<endl;
}
catch(MyException excep)
{
cout<<excep.what();
}
break;
}
case 3:
{
int index;//String index is invalid
cout<<"Enter the name";
cin>>name;
cout<<"Enter the index";
cin>>index;
try
{
char ch=exp.getStringIndex(name,index);
cout<<"The letter in the name is "<<ch;
}
catch(MyException excep)
{
cout<<excep.what()<<endl;
}
break;
}
case 4:
{
int length;//array index is invalid
int arrayIndex;
cout<<"Enter the length of array";
cin>>length;
int array[length];
cout<<"Enter the elements of array";
for(int i=0;i<length;i++)
{
cin>>array[i];
}
cout<<"Enter the index value";
cin>>arrayIndex;
try
{
int  str=exp.getStringName(array,arrayIndex,length);
cout<<"The number   is" <<str;
}
catch(MyException excep)
{
cout<<excep.what()<<endl;
}
break;
}
case 5:
{
/*int rollNumber;
int age;
string name;
int lengthCourse;
string desireCourse;
cout<<"Enter the length of course array";
cin>>lengthCourse;
string course[lengthCourse];
cout<<"Enter the roll number";
cin>>rollNumber;
cout<<"Enter the age";
cin>>age;
cout<<"Enter the name";
cin>>name;*/
int lengthCourse=3;
string course[3]={"Civil","Mechanical","ComputerScience"};
cout<<"Enter the elements of course";
for(int i=0;i<lengthCourse;i++)
{
cin>>course[i];
}
//cout<<"Enter the desire course";
//cin>>desireCourse;
try{
Student obj(123,"Thilak","Mechanical",17,course);
//Student obj(rollNumber,name,desireCourse,age,course);
obj.getDetailsOfStudent();
}
catch(AgeNotWithinRange &excep)
{
cout<<excep.what();
}
catch(NameNotValidException &excep1)
{
cout<<excep1.what();
}
catch(CourseNotValidException &except2)
{
cout<<except2.what();
}
break;

}
}
}
