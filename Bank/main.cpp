#include <iostream>
using namespace std;
#include "Bank.h"
#include "HDFC.h"
#include "ICICI.h"
#include "SBI.h"
#include "IndianBank.h"
#include "Broker.h"
#include "InputCenter.h"

int main()
{

    string bankName;
    string bankType;
    string branch;
    string date;
    int interest;
    string loan [3]= {"Gold loan","Land loan","Personal loan"};
    string goldLoanDocuments[3]= {"Aadhar","Pancard","Passport size photo"} ;
    string landLoanDocuments[3]= {"Aadhar","Pancard","Passport size photo"};
    string personalLoanDocuments[3]= {"Aadhar","Pancard","Passport size photo"} ;


    InputCenter input;
    HDFC hdfc(input.getName(),input.getType(),input.getBranch(),input.getDate(),input.getInterest(),loan,goldLoanDocuments,landLoanDocuments,personalLoanDocuments);
    ICICI icici(input.getName(),input.getType(),input.getBranch(),input.getDate(),input.getInterest(),loan,goldLoanDocuments,landLoanDocuments,personalLoanDocuments);
    SBI sbi(input.getName(),input.getType(),input.getBranch(),input.getDate(),input.getInterest(),loan,goldLoanDocuments,landLoanDocuments,personalLoanDocuments);
    IndianBank indianBank(input.getName(),input.getType(),input.getBranch(),input.getDate(),input.getInterest(),loan,goldLoanDocuments,landLoanDocuments,personalLoanDocuments);

    Broker bk;

    Loan loanObj=bk.compare(hdfc,sbi,icici,indianBank);
    cout<<"Compare bank interest and display which has low interest Rate"<<endl;
    cout<<"The bank name is "<< loanObj.getName()<<endl;


    Loan obj=bk.compare(hdfc,icici);
    cout<<"The two bank comparision"<<endl;
    cout<<"The bank name is "<< obj.getName()<<endl;


    cout<<"The three bank comparision"<<endl;
    Loan obj1=bk.compare(hdfc,icici,sbi);
    cout<<"The bank name is "<< obj1.getName()<<endl;


    cout<<"The n bank comparision"<<endl;

    Loan objLoan[4];
    objLoan[0]=hdfc;
    objLoan[1]= icici;
    objLoan[2]= sbi;
    objLoan[3]=indianBank;
    int n=sizeof(objLoan)/sizeof(objLoan[0]);
    int num=bk.compare(objLoan,n);
    cout<<"The name is "<<objLoan[num].getName()<<endl;
    bk.printDetailsOfBank(hdfc);

    Bank bankObj[4];
    bankObj[0]=hdfc;
    bankObj[1]=sbi;
    bankObj[2]=icici;
    bankObj[3]=indianBank;
    int num1=sizeof(bankObj)/sizeof(bankObj[0]);
    bk.printMultipleBank(bankObj,num1);

    return 0;
};

