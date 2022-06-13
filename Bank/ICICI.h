#ifndef ICICI_H_INCLUDED
#define ICICI_H_INCLUDED

#include<iostream>
#include "Bank.h"
#include "Loan.h"
using namespace std;
class ICICI:public Bank,public Loan{
public:
string name;
string type;
string branch;
string date;
ICICI(string name,string type,string branch,string date,int interest,bool gold,bool land,bool personal,string goldLoanDocuments,string landLoanDocuments,string personalLoanDocuments):
Bank(name,type,branch,date),Loan(name,interest,gold,land,personal,goldLoanDocuments,landLoanDocuments,personalLoanDocuments)
{
this->name=name;
this->type=type;
this->branch=branch;
this->date=date;
this->interest=interest;
}
string getName()
{
return name;
}
string getType()
{
return  type;
}
string getBranch()
{
return branch;
}


string getEstablishedDate()
{
return date;
}




public :
int interest;
bool gold;
bool land;
bool personal;
string goldLoanDocuments;
string landLoanDocuments;
string personalLoanDocuments;


 int getInterestRate()
 {
 return interest;
}

 bool getGoldLoan()
 {
 return gold;
 }

  bool getLandLoan()
 {
 return land;
 }

  bool getPersonalLoan()
 {
 return personal;
 }

 string getDocumentsForGoldLoan()
 {
  return goldLoanDocuments;
 }
string getDocumentsForLandLoan()
{
return landLoanDocuments;
}

string getDocumentsForPersonalLoan()
{
return personalLoanDocuments;
}


void getInfo()
{
cout<<"The bank name is  "<<getName();
cout<<"The bank type is  "<<getType();
cout<<"The branch name is "<<getBranch();
cout<<"The established date is "<<getEstablishedDate();
}
};





#endif // ICICI_H_INCLUDED


