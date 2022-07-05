#ifndef STUDENT_H_INCLUDED
#define STUDENT_H_INCLUDED
#include "AgeNotWithinRange.h"
#include "NameNotValidException.h"
#include "CourseNotValidException.h"
class Student{
private:
int rollNumber;
string studentName;
int studentAge;
string studentCourse;




public:
Student(int rollNo,string name,string course,int age,string* courseList)
{
rollNumber=rollNo;
checkName(name);
studentName=name;
checkAge(age);
studentAge=age;
studentCourse=checkCourse(course,courseList);

}
 void checkAge(int age)
 {
 if(age >=15 && age<=21)
 {
 AgeNotWithinRange obj;
 throw obj;
 }

 }
void checkName(string name)
{
for(int i=0;i<name.length();i++)
{
  if(name[i] >='0' && name[i]<='9')
  {
  NameNotValidException obj;
  throw obj;

  }
  if(name[i]=='#' || name[i]=='$' || name[i]=='&' ||name[i]=='@')
  {
  NameNotValidException obj;
  throw obj;
  }

}
}
string checkCourse(string course,string* list)
{
//int arrayLength=sizeof(list)/sizeof(list[0]);
int arrayLength=(*list).size();
int count=0;
for(int i=0;i<arrayLength;i++)
{
if(list[i]==course)
{
count++;
}
}
if(count==0)
{
CourseNotValidException obj;
throw obj;
}

return course;
}


void getDetailsOfStudent()
{
cout<<"The roll number of student is "<<rollNumber<<endl;
cout<<"The student name is "<<studentName<<endl;
cout<<"The student age is "<<studentAge<<endl;
cout<<"The student selected course is "<<studentCourse<<endl;
}
};

#endif // STUDENT_H_INCLUDED
