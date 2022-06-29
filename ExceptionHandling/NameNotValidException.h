#ifndef NAMENOTVALIDEXCEPTION_H_INCLUDED
#define NAMENOTVALIDEXCEPTION_H_INCLUDED
class NameNotValidException:public exception
{

public:
    string what()
    {
        return"Name not valid ";
    }

};

#endif // NAMENOTVALIDEXCEPTION_H_INCLUDED

