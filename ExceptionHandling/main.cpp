#include <iostream>



using namespace std;
#include<exception>
#include <stdexcept>
#include "Exception.h"
#include "MyException.h"
#include "Student.h"
#include "AgeNotWithinRange.h"
#include "NameNotValidException.h"
#include "CheckRollNumber.h"
#include "CourseNotValidException.h"

int main()
{
    string name;

    Exception exp;
    int num;
    bool value=true;
    vector<int> store;
    CheckRollNumber rollObj;
    while(value==true)
    {
        try
        {
            cout<<"Enter the option to perform operation"<<endl;
            cin>>num;

        }
        catch(exception &exp)
        {
            cout<<"The operation is not valid!";

        }

        switch(num)
        {
        case 1:
        {
            int value1;
            int value2;

            try
            {
             cout<<"Enter the value of value1"<<endl;
            cin>>value1;
            cout<<"Enter the value of value 2"<<endl;
            cin >> value2;

            int value3=exp.getNumber(value1,value2);//Divide by zero exception
            cout<<"The value is" <<value;
            }
           catch(MyException excep)
           {
                cout<<excep.what();
                value=false;
            }
           catch(exception &exp )
        {
         cout<<exp.what();
            value=false;
        }
            break;
        }
        case 2:
        {
            try
            {
                 //cout<<"Enter the length of array"<<endl;
                // int length;
                // cin>>length;
                int *arr=new int[1000000000];

              cout<<"Successfully memory allocated"<<endl;
            }
            catch(exception &excep)
            {
                cout<< "Memory is compromised" << excep.what();


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
            for(int i=0; i<length; i++)
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
            int rollNumber;
            int age;

            string name;
            int lengthCourse;
            string desireCourse;
            //string course[lengthCourse];
string course[3]={"Civil","Mechanical","ComputerScience"};

//            cout<<"Enter the length of course array"<<endl;
//            cin>>lengthCourse;
//            cout<<"Enter the course name"<<endl;
//            for(int i=0; i<lengthCourse; i++)
//            {
//                cin>>course[i];
//            }



            cout<<"Enter the roll number"<<endl;
            cin>>rollNumber;
            cout<<"Enter the age"<<endl;
            cin>>age;
            cout<<"Enter the name"<<endl;
            cin>>name;




            cout<<"Enter the desire course"<<endl;
            cin>>desireCourse;
            try
            {
                rollObj.checkRollNumber(store,rollNumber);
                Student obj(rollNumber,name,desireCourse,age,course);
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
            catch(MyException &e)
            {
                cout<<e.what();
             }
            break;
        }

        default:
            value=false;
            cout<<"Enter the number from 1 to 5"<<endl;

        }
    }
}

