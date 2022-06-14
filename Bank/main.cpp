#include <iostream>
using namespace std;
#include "Bank.h"
#include "HDFC.h"
#include "ICICI.h"
#include "SBI.h"
#include "IndianBank.h"
#include "Broker.h"


int main()
{

HDFC hdfc("HDFC","private","Adyar","13/06/1997",8,{"GoldLoan","LandLoan","PersoanlLoan"},{"Aadhar","Pancard","Property"},{"Aadhar","Pancard","Property"},{"Aadhar","Pancard","Property"});
ICICI icici("ICICI","private","Adyar","14/06/1997",7,{"GoldLoan","LandLoan","PersoanlLoan"},{"Aadhar","Pancard","Property"},{"Aadhar","Pancard","Property"},{"Aadhar","Pancard","Property"});
SBI sbi("SBI","public","Adyar","14/06/1997",6,{"GoldLoan","LandLoan","PersoanlLoan"},{"Aadhar","Pancard","Property"},{"Aadhar","Pancard","Property"},{"Aadhar","Pancard","Property"});
IndianBank indianBank("IndianBank","public","Adyar","14/06/1997",5,{"GoldLoan","LandLoan","PersoanlLoan"},{"Aadhar","Pancard","Property"},{"Aadhar","Pancard","Property"},{"Aadhar","Pancard","Property"});
Broker bk;

Loan loanObj=bk.compare(hdfc,sbi,icici,indianBank);
//cout<<"The bank name is "<< loanObj.getName()<<endl;


Loan obj=bk.compare(hdfc,icici);
cout<<"The two bank comparision"<<endl;
//cout<<"The bank name is "<< obj.getName()<<endl;


cout<<"The three bank comparision"<<endl;
Loan obj1=bk.compare(hdfc,icici,sbi);
//cout<<"The bank name is "<< obj1.getName()<<endl;


cout<<"The n bank comparision"<<endl;
Loan objLoan[4];
objLoan[0]=hdfc;
objLoan[1]= icici;
objLoan[2]= sbi;
objLoan[3]=indianBank;
int n=sizeof(objLoan)/sizeof(objLoan[0]);
Loan output=bk.compare(objLoan,n);
//cout<<"The name is "<<output.getName()<<endl;
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
