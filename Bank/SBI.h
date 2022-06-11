#ifndef SBI_H_INCLUDED
#define SBI_H_INCLUDED


#include<iostream>
#include "Bank.h"
#include "Loan.h"
class SBI:public Bank,public Loan{
string getName()
{
return bankName;
}
string getType()
{
return bankType;
}
string getBranch()
{
return branchName;
}

string getEstablishedDate()
{
return establishedDate;
}

public :
 int getInterestRate()
 {
 return interestRate;
}

 bool getGoldLoan()
 {
 return goldLoan;
 }

  bool getLandLoan()
 {
 return landLoan;
 }

  bool getPersonalLoan()
 {
 return personalLoan;
 }

 string getDocumentsForGoldLoan()
 {
  return documentsForGoldLoan;
 }
string getDocumentsForLandLoan()
{
return documentsForLandLoan;
}

string getDocumentsForPersonalLoan()
{
return documentsForPersonalLoan;
}

void getInfo()
{
cout<<"The bank name is  "<<bankName;
cout<<"The bank type is  "<<bankType;
cout<<"The branch name is "<<branchName;
cout<<"The established date is "<<establishedDate;
}
};



#endif // SBI_H_INCLUDED
