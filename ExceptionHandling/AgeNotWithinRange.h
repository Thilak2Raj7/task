#ifndef AGENOTWITHINRANGE_H_INCLUDED
#define AGENOTWITHINRANGE_H_INCLUDED

class AgeNotWithinRange:public exception{

public :
 string what()
 {
    return "Age is not with in range";
 }



};

#endif // AGENOTWITHINRANGE_H_INCLUDED
