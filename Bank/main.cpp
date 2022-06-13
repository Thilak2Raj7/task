#include <iostream>
using namespace std;
#include "HDFC.h"
#include "ICICI.h"
#include "SBI.h"
#include "IndianBank.h"
#include "Broker.h"


int main()
{
HDFC h1("HDFC","private","Adyar","13/06/1997",5,true,false,false,"Aadhar","Aadhar","Aadhar");
ICICI i1("ICICI","private","Adyar","14/06/1997",5,true,false,false,"Aadhar","Aadhar","Aadhar");
SBI s1("SBI","public","Adyar","14/06/1997",6,true,false,false,"Aadhar","Aadhar","Aadhar");
IndianBank b1("IndianBank","public","Adyar","14/06/1997",7,true,false,false,"Aadhar","Aadhar","Aadhar");
Broker bk;
Loan &obj=bk.compare(s1,b1);

cout<<"The bank name is "<< obj.getName();
cout<< "  and their interestRate is " << obj.getInterestRate();

Loan &obj1=bk.compare(h1,i1,s1);

cout<<"The bank name is "<< obj1.getName();
cout<< "  and their interestRate is " << obj1.getInterestRate();

return 0;
};
