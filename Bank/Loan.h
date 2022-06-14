#ifndef LOAN_H_INCLUDED
#define LOAN_H_INCLUDED

#include <iostream>
using namespace std;

class Loan{
 private:
 string bankName;
 int interestRate;
 string* documentsForGoldLoan;
 string* documentsForLandLoan;
 string* documentsForPersonalLoan;
string* loan;

public:
Loan()
{

}

Loan(string name,int interest,string* loanDetails,string* goldLoanDocuments,string* landLoanDocuments,string* personalLoanDocuments)
{
bankName=name;
interestRate=interest;
documentsForGoldLoan=goldLoanDocuments;
documentsForLandLoan=landLoanDocuments;
documentsForPersonalLoan=personalLoanDocuments;
loan=loanDetails;
}
virtual string getName()
{
return bankName;
}

virtual  int getInterestRate()
{
return 0;
}
virtual string* getAvailableLoan()
{
return loan;
}

virtual string* getDocumentsForGoldLoan(){
return documentsForGoldLoan;
}
 virtual string* getDocumentsForLandLoan(){
return documentsForLandLoan;
}

 virtual string* getDocumentsForPersonalLoan(){
return documentsForPersonalLoan;
}
};


#endif // LOAN_H_INCLUDED
