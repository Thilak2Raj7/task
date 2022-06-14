#ifndef HDFC_H
#define HDFC_H

# include<iostream>
#include "Bank.h"
#include "Loan.h"
using namespace std;

class HDFC:public Bank,public Loan{

private:
string name;
string type;
string branch;
string date;
int interest;
string *loan;
string* goldLoanDocuments;
string* landLoanDocuments;
string * personalLoanDocuments;

public:
HDFC(string name,string type,string branch,string date,int interest,string* loan,string* goldLoanDocuments,string* landLoanDocuments,string* personalLoanDocuments):
Bank(name,type,branch,date),Loan(name,interest,loan,goldLoanDocuments,landLoanDocuments,personalLoanDocuments)
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
return type;
}
string getBranch()
{
return branch;
}

string getEstablishedDate()
{
return date;
}




 int getInterestRate()
 {
 return interest;
}
virtual string* getAvailableLoan()
{

return loan;
}


 string* getDocumentsForGoldLoan()
 {
  return goldLoanDocuments;
 }
string* getDocumentsForLandLoan()
{
return landLoanDocuments;
}

string* getDocumentsForPersonalLoan()
{
return personalLoanDocuments;
}


void getInfo()
{
cout<<"The bank name is  "<<getName()<<endl;
cout<<"The bank type is  "<<getType()<<endl;
cout<<"The branch name is "<<getBranch()<<endl;
cout<<"The established date is "<<getEstablishedDate()<<endl;
}





};
#endif

