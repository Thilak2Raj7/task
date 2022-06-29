#ifndef CHECKROLLNUMBER_H_INCLUDED
#define CHECKROLLNUMBER_H_INCLUDED
#include "MyException.h"
class CheckRollNumber
{

public:

    void checkRollNumber(vector<int> &store,int rollNumber)
    {
        //cout<<"In method"<<rollNumber;
        if(binary_search(store.begin(),store.end(),rollNumber))
        {
            //<<"First"<<rollNumber;
            MyException obj("Roll number already exists");
            throw obj;
        }
        else
        {
            //cout<<"Second"<<rollNumber;
            store.push_back(rollNumber);
        }
        for(int i=0; i<store.size(); i++)
        {
            cout<<store[i];
        }
    }




};

#endif // CHECKROLLNUMBER_H_INCLUDED
