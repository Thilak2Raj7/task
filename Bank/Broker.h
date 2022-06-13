#ifndef BROKER_H_INCLUDED
#define BROKER_H_INCLUDED
#include<climits>
#include<iostream>
using namespace std;


class Broker{
int min=INT_MAX;
public:
Loan& compare(Loan &h1,Loan &i1)
{
if(h1.getInterestRate()>i1.getInterestRate())
{
return i1;

}

return h1;

}
Loan& compare(Loan &h1,Loan &i1 ,Loan& s1)
{

if(h1.getInterestRate()<i1.getInterestRate() && h1.getInterestRate()<s1.getInterestRate())
{
return h1;
}
else if(i1.getInterestRate() <h1.getInterestRate() && i1.getInterestRate()<s1.getInterestRate())
{
return i1;
}
else{
return s1;
}
}

};

#endif // BROKER_H_INCLUDED
