#ifndef BANK_H_INCLUDED
#define BANK_H_INCLUDED


# include<iostream>
# include"Date.h"
using namespace std;

class Bank{
 private:
 string bankName;
 string bankType;
 string branchName;
 string establishedDate;
public :
Bank()
{
}
 Bank(string name,string type,string branch,string date)
 {
   bankName=name;
   bankType=type;
   branchName=branch;
   establishedDate=date;
 }

 virtual string getName()
{
return bankName;
}
 virtual string getType()
{
return bankType;
}
virtual string getBranch()
{
return branchName;
}

 virtual string getEstablishedDate()
{
return establishedDate;
}
virtual void getInfo()
{
cout<<"The bank name is  "<<getName()<<endl;
cout<<"The bank type is  "<<getType()<<endl;
cout<<"The branch name is "<<getBranch()<<endl;
cout<<"The established date is "<<getEstablishedDate()<<endl;
}

};

#endif // BANK_H_INCLUDED
