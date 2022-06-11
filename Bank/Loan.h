#ifndef LOAN_H_INCLUDED
#define LOAN_H_INCLUDED
The Loan class should have methods like getAvailableLoans (goldLoan,
landLoan, personalLoan) , get Interest Rate, documentRequeired for
specific loan
We should Create M
#include <iostream>
using namespace std;

class Loan{
 private:
 int interestRate;
 string documentsForGoldLoan;
 string documentsForLandLoan;
 string documentsForPersonalLoan;
 bool goldLoan;
 bool landLoan;
 bool personalLoan;



 public :
virtual int getInterestRate(){}


virtual bool getGoldLoan(){}


virtual  bool getLandLoan(){}


 virtual bool getPersonalLoan(){}


virtual string getDocumentsForGoldLoan(){}

virtual string getDocumentsForLandLoan(){}


virtual string getDocumentsForPersonalLoan(){}

};


#endif // LOAN_H_INCLUDED
