#ifndef RECTANGLE_H_INCLUDED
#define RECTANGLE_H_INCLUDED
#include<iostream>
#include<cmath>
using namespace std;
class Rectangle{
private:
 int* width;
 int* left;
 int* top;
 int* height;
 int* area;
 int  rectangleArea;
 int tempWidth;
 int tempHeight;
 int tempLeft;
 int tempTop;
 /*Rectangle(int width=0,int height=0,int left=0,int top=0)
 {
this-> width=width;
this-> height=height;
this-> left=left;
this-> top=top;
}*/
public:
Rectangle()
{
this->width=0;
this->height=0;
this->top=0;
this->left=0;

}

Rectangle(int &width,int &height)
{
this-> width=&width;
this-> height=&height;
tempLeft=0;
this-> left=&tempLeft;
tempTop=0;
this-> top=&tempTop;
}
Rectangle(int &width,int &height,int &left,int &top)
{
this-> width=&width;
this-> height=&height;
this-> left=&left;
this-> top=&top;
}
Rectangle(float width,float height,float left,float top)
{
tempWidth=round(width);
tempHeight=round(height);
tempTop=round(top);
tempLeft=round(left);
this->width=&tempWidth;
this->height=&tempHeight;
this->left=&tempLeft;
this->top=&tempTop;

}


Rectangle(Rectangle &rec)
{

this->width=rec.width;
this-> height=rec.height;
this-> left=rec.left;
this-> top=rec.top;
rectangleArea=(*width) * (*height);
this->area=&rectangleArea;
}
~Rectangle()
{
width=NULL;
delete width;
height=NULL;
delete height;
top=NULL;
delete top;
left=NULL;
delete left;
}

void print()
{
cout<<"The width of rectangle is "<<*width<<endl;
cout<<"The height of rectangle is "<<*height<<endl;
cout<<"The top of rectangle is "<<*top<<endl;
cout<<"The left of rectangle is "<<*left<<endl;
cout<<"The area of rectangle is "<<*area<<endl;
cout<<endl;
}
};
#endif // RECTANGLE_H_INCLUDED
