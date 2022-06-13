#ifndef BANK_H_INCLUDED
#define BANK_H_INCLUDED


# include<iostream>
using namespace std;

class Bank{
 private:
 string bankName;
 string bankType;
 string branchName;
 string establishedDate;
public :
 Bank(string name,string type,string branch,string date)
 {
   bankName=name;
   bankType=type;
   branchName=branch;
   establishedDate=date;
 }

virtual string getName()
{

}
virtual string getType()
{

}
virtual string getBranch()
{

}

virtual string getEstablishedDate()
{

}
virtual void getInfo()
{

}

};

#endif // BANK_H_INCLUDED
