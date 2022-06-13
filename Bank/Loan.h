#ifndef LOAN_H_INCLUDED
#define LOAN_H_INCLUDED

#include <iostream>
using namespace std;

class Loan{
 private:
 string name;
 int interestRate;
 string documentsForGoldLoan;
 string documentsForLandLoan;
 string documentsForPersonalLoan;
 bool goldLoan;
 bool landLoan;
 bool personalLoan;
public:
Loan(string name,int interest,bool gold,bool land,bool personal,string goldLoanDocuments,string landLoanDocuments,string personalLoanDocuments)
{
name=name;
interestRate=interest;
documentsForGoldLoan=goldLoanDocuments;
documentsForLandLoan=landLoanDocuments;
documentsForPersonalLoan=personalLoanDocuments;
goldLoan=gold;
landLoan=land;
personalLoan=personal;
}
virtual string getName()
{
return name;
}
virtual int getInterestRate(){}


virtual bool getGoldLoan(){}


virtual  bool getLandLoan(){}


 virtual bool getPersonalLoan(){}


virtual string getDocumentsForGoldLoan(){}

virtual string getDocumentsForLandLoan(){}


virtual string getDocumentsForPersonalLoan(){}
};


#endif // LOAN_H_INCLUDED
