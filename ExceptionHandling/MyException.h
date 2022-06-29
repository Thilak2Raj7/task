#ifndef MYEXCEPTION_H_INCLUDED
#define MYEXCEPTION_H_INCLUDED

#include <iostream>
#include <exception>
using namespace std;


class MyException:public exception
{

private:

    string message;


public:
    MyException(string msg)
    {
        message=msg;
    }
    string what()
    {
        return message;
    }
};

#endif // MYEXCEPTION_H_INCLUDED
