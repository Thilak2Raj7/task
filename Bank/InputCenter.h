#ifndef INPUTCENTER_H_INCLUDED
#define INPUTCENTER_H_INCLUDED

class InputCenter
{

private:
    string bankName;
    string bankType;
    string branch;
    string date;
    int interest;
public:
    string getName()
    {
        cout<<"Enter the bank name"<<endl;
        cin>>bankName;
        return bankName;
    }
    string getType()
    {
        cout<<"Enter the bank type"<<endl;
        cin>>bankType;
        return bankType;
    }
    string getBranch()
    {
        cout<<"Enter the branch"<<endl;
        cin>> branch;
        return branch;
    }
    string getDate()
    {
        cout<<"Enter the date"<<endl;
        cin>>date;
        return date;
    }
    int getInterest()
    {
        cout<<"Enter the bank interest"<<endl;
        cin>>interest;
        return interest;
    }
};

#endif // INPUTCENTER_H_INCLUDED
