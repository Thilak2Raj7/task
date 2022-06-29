#ifndef COURSENOTVALIDEXCEPTION_H_INCLUDED
#define COURSENOTVALIDEXCEPTION_H_INCLUDED

class CourseNotValidException:public exception
{

public :
    string what()
    {
        return "Selected course is not valid";
    }



};

#endif // COURSENOTVALIDEXCEPTION_H_INCLUDED
