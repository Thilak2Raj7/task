#include <iostream>
#include "Rectangle.h"
using namespace std;

int main()
{

    int width;
    int height;
    int top;
    int left;
    float width1;
    float height1;
    float left1;
    float top1;
    cout<<"Enter the value of width"<<endl;
    cin>>width;
    cout<<"Enter the value of height"<<endl;
    cin>>height;
    cout<<"Enter the value of top"<<endl;
    cin>>top;
    cout<<"Enter the value of left"<<endl;
    cin>>left;
    cout<<"Enter the value of width"<<endl;
    cin>>width1;
    cout<<"Enter the value of height"<<endl;
    cin>>height1;
    cout<<"Enter the value of top"<<endl;
    cin>>top1;
    cout<<"Enter the value of left"<<endl;
    cin>>left1;
    Rectangle rectangle1(width,height);
    Rectangle obj1(rectangle1);
    obj1.print();

    Rectangle rectangle2(width,height,left,top);
    Rectangle obj2(rectangle2);
    obj2.print();

    Rectangle rectangle3(width1,height1,left1,top1);
    Rectangle obj3(rectangle3);
    obj3.print();
}
