#ifndef DATE_H_INCLUDED
#define DATE_H_INCLUDED
class Date{
private:
int day;
int month;
int year;

public :
Date(int day,int month,int year)
{
this->day=day;
this->month=month;
this->year=year;
}
string getDate()
{
return std::to_string(day)+"/"+std::to_string(month)+"/"+std::to_string(year);

}

};


#endif // DATE_H_INCLUDED
