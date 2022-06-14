#ifndef BROKER_H_INCLUDED
#define BROKER_H_INCLUDED
#include<climits>
#include<iostream>
#include "Bank.h"
#include "Loan.h"
#include "HDFC.h"
#include "ICICI.h"
#include "SBI.h"
#include "IndianBank.h"
using namespace std;


class Broker{

public:
int min=INT_MAX;
Loan compare(HDFC hdfc,SBI sbi,ICICI icici,IndianBank indianBank)
{
Loan obj1;

if(min >hdfc.getInterestRate())
{
min=hdfc.getInterestRate();
obj1=hdfc;
}

if(min > sbi.getInterestRate())
{
min=sbi.getInterestRate();
 obj1=sbi;
}
if(min > icici.getInterestRate())
{
min=icici.getInterestRate();
 obj1=icici;
}

if(min >indianBank.getInterestRate())
{
obj1=indianBank;
}
return obj1;
}

Loan& compare(Loan &hdfc,Loan &icici)
{
if(hdfc.getInterestRate()>icici.getInterestRate())
{
return icici;

}

return hdfc;

}
Loan& compare(Loan &hdfc,Loan &icici ,Loan& sbi)
{

if(hdfc.getInterestRate()<icici.getInterestRate() && hdfc.getInterestRate()<sbi.getInterestRate())
{
return hdfc;
}
else if(icici.getInterestRate() <hdfc.getInterestRate() && icici.getInterestRate()<sbi.getInterestRate())
{
return icici;
}
else{
return sbi;
}

}

Loan compare(Loan obj[],int n)
{
Loan obj1;


int r1=INT_MAX;
for(int i=0;i<n;i++)
{

if(r1>obj[i].getInterestRate())
{
r1=obj[i].getInterestRate();

obj1=obj[i];

}

}
return obj1;
}

void printDetailsOfBank(Bank &obj)
{
obj.getInfo();
}

void printMultipleBank(Bank obj[],int n)
{
for(int i=0;i<n;i++)
{
obj[i].getInfo();
//cout<<"The bank name is  "<<obj[i].getName()<<endl;
//cout<<"The bank type is  "<<obj[i].getType()<<endl;
//cout<<"The branch name is "<<obj[i].getBranch()<<endl;
//cout<<"The established date is "<<obj[i].getEstablishedDate()<<endl;
}

}

};

#endif // BROKER_H_INCLUDED
