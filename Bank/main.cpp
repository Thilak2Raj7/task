#include <iostream>
#include "HDFC.h"
#include "ICICI.h"
#include "SBI.h"
#include "IndianBank.h"
#include "Broker.h"
using namespace std;

int main()
{
HDFC h1;
ICICI i1;
SBI s1;
IndianBank b1;
Broker bk;
int min;
min=bk.minimumElement(h1.getInterestRate());
min=bk.minimumElement(i1.getInterestRate());
min=bk.minimumElement(s1.getInterestRate());
min=bk.minimumElement(b1.getInterestRate());
cout<<min;

    return 0;
}
