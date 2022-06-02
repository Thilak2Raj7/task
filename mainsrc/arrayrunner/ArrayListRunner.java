package arrayrunner;
import array.ArrayListTask;
import java.util.*;
public class ArrayListRunner
{
public static void main(String [] args)
{
Scanner scan=new Scanner(System.in);
ArrayListTask list=new ArrayListTask();
int size=0;
int number=0;
int length=0;
int length1=0;
int start=0;
int end=0;

int objectLength=0;

String inputString1="";
String inputString2="";
String inputString3="";
String inputString4="";
String inputString5="";
try{
System.out.println("Enter the number");
 number=scan.nextInt();
 if(number>20 || number<0)
 {
  throw new Exception("Number should be within the range(0 to 20)");
 }

}
 catch (Exception e)
{
 System.out.println(e.getMessage());
}
 switch(number)
 {
 case 1:
 try
 {
 List object= list.getEmptyArrayList();
 System.out.println(list.getSize(object));
  }
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;
case 2 :
try{
 List object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();
 scan.nextLine();
String[] array=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
//scan.nextLine();
array[i]=scan.nextLine();
}
object=list.addFunction(object,array);
System.out.println(object);
 System.out.println(list.getSize(object));
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;

case 3 :
try
{
List object= list.getEmptyArrayList();
System.out.println("Enter the length");
 length=scan.nextInt();
Integer[] array=new Integer[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array[i]=scan.nextInt();
}
object=list.addFunction(object,array);
System.out.println(object);
 System.out.println(list.getSize(object));
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;

case 4:
try
{
List object= list.getEmptyArrayList();
System.out.println("Enter the length");
 length=scan.nextInt();
 scan.nextLine();
 Object [] array={list};
object=list.addFunction(object,array);
System.out.println(object);
 System.out.println(list.getSize(object));
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;

case 5:
try
{
List object= list.getEmptyArrayList();

 System.out.println("Enter the integerLength");
 length=scan.nextInt();
 Integer [] integer=new Integer[length];

  for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
integer[i]=scan.nextInt();
}
object=list.addFunction(object,integer);

System.out.println("Enter the stringlength");
length=scan.nextInt();
scan.nextLine();
String[] string=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
 string[i]=scan.nextLine();
}
object=list.addFunction(object,string);

Object [] array={list,scan};
object=list.addFunction(object,array);
System.out.println(object);
 System.out.println(list.getSize(object));
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;
case 6 :
try
{
List object= list.getEmptyArrayList();
System.out.println("Enter the arraylength");
 length=scan.nextInt();
 scan.nextLine();
 String[] array=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array[i]=scan.nextLine();
}
object=list.addFunction(object,array);
System.out.println(object);
 System.out.println(list.getSize(object));
 System.out.println("Enter the inputString");
 String inputString=scan.nextLine();
  System.out.println("The position of the string is ");
 int index=list.findIndex(object,inputString);
 System.out.println(index);
}
 catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;

case 7:
try
{
List object= list.getEmptyArrayList();
System.out.println("Enter the arraylength");
 length=scan.nextInt();
 scan.nextLine();
String[] array=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array[i]=scan.nextLine();
}
 object=list.addFunction(object,array);
System.out.println(object);
list.iteratormethod(object);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;
case 8:
try
{
List object= list.getEmptyArrayList();
System.out.println("Enter the arraylength");
 length=scan.nextInt();
scan.nextLine();
 String[] array=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array[i]=scan.nextLine();
}
object=list.addFunction(object,array);
System.out.println(object);
 System.out.println(list.getSize(object));
 System.out.println("Enter the position");
 int index=scan.nextInt();
  inputString1=list.getString(object,index,inputString2);
 System.out.println(inputString1);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;
case 9:
try
{
List object= list.getEmptyArrayList();
System.out.println("Enter the arraylength");
 length=scan.nextInt();
scan.nextLine();
 String[] array=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array[i]=scan.nextLine();
}
object=list.addFunction(object,array);
System.out.println(object);
 System.out.println(list.getSize(object));
 System.out.println("Enter the index");
 int index=scan.nextInt();
 scan.nextLine();
 System.out.println("Enter the inputstring");
 
  inputString2=scan.nextLine();
 object=list.addString(object,inputString2,index);
 System.out.println(object);
 }
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;
case 10:
try{
 List object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();
 scan.nextLine();
String[] array=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array[i]=scan.nextLine();
}
object=list.addFunction(object,array);
System.out.println(object);
 System.out.println(list.getSize(object));
 List object1=list.getEmptyArrayList();
 System.out.println("Enter the start");
 start=scan.nextInt();
 System.out.println("Enter the end");
 end=scan.nextInt();
 object1=list.secondList(object,start,end);
 System.out.println(object1);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;
case 11 :
try{
List object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();
 scan.nextLine();
String[] array=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array[i]=scan.nextLine();
}
object=list.addFunction(object,array);
System.out.println(object);

List object1= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();
 scan.nextLine();
String[] array1=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");

array1[i]=scan.nextLine();
}
object1=list.addFunction(object1,array1);
System.out.println(object1);
List object2= list.getEmptyArrayList();
object2=list.combineTwoList(object,object1);
System.out.println(object2);
System.out.println(list.getSize(object2));
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;

case 12:
try
{
List object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();
 scan.nextLine();
String[] array=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array[i]=scan.nextLine();
}
object=list.addFunction(object,array);
System.out.println(object);

List object1= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();
 scan.nextLine();
String[] array1=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array1[i]=scan.nextLine();
}
object1=list.addFunction(object1,array1);

List object2= list.getEmptyArrayList();
object2=list.combineTwoList(object1,object);
System.out.println(object2);
System.out.println(list.getSize(object2));
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;

case 13:
try
{
List object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();

Double [] array=new  Double[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the input");
Double doubleObject=scan.nextDouble();
array[i]=doubleObject;
}
object=list.addFunction(object,array);
System.out.println(object);
object=list.removeOneDecimalValue(object,array);
System.out.println(object);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;

case 14:
try
{
List object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();

Double [] array=new  Double[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the input");
Double doubleObject=scan.nextDouble();
array[i]=doubleObject;
}
object=list.addFunction(object,array);
System.out.println(object);
System.out.println("Enter the index");
int index=scan.nextInt();
object=list.decimalValueAtPosition(object,index);
System.out.println(object);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;

case 15:
try
{
List object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();
  scan.nextLine();
String[] array=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array[i]=scan.nextLine();
}
object=list.addFunction(object,array);
System.out.println(object);

 List object1=list.getEmptyArrayList();
 System.out.println("Enter the start");
 start=scan.nextInt();
 System.out.println("Enter the end");
 end=scan.nextInt();
 object1=list.secondList(object,start,end);
 System.out.println(object1);
object=list.removeFirstArray( object1,object);
System.out.println(object);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;
 case 16:
 try
 {
List object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();
  scan.nextLine();
String[] array=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array[i]=scan.nextLine();
}
object=list.addFunction(object,array);
System.out.println(object);

 List object1=list.getEmptyArrayList();
 System.out.println("Enter the start");
 start=scan.nextInt();
 System.out.println("Enter the end");
 end=scan.nextInt();
 object1=list.secondList(object,start,end);
 System.out.println(object1);
object=list.sameElementRetain(object, object1);
 System.out.println(object);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
case 17:
try
{
List object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();
 scan.nextLine();
Long [] array=new Long [length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the input");
 Long myLongObject=scan.nextLong();
array[i]=myLongObject;
}
object=list.addFunction(object,array);
System.out.println(object);
System.out.println(list.getSize(object));
object=list.clearAll(object);
System.out.println(object);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;
case 18:
try
{
List object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();
  scan.nextLine();
String[] array=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array[i]=scan.nextLine();
}
object=list.addFunction(object,array);
System.out.println("Enter the checkString");
inputString1=scan.nextLine();
System.out.println(list.checkString(object,inputString1));
System.out.println(object);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;
case 19:
try
{
List object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 length=scan.nextInt();
  scan.nextLine();
String[] array=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array[i]=scan.nextLine();
}
object=list.addFunction(object,array);
System.out.println(object);

System.out.println("Enter the inputString");
String inputString=scan.nextLine();
int index=list.findIndex(object,inputString);
int index1=list.findLastIndex(object,inputString);
System.out.println("Enter the first position of string");
System.out.println(index);
System.out.println("Enter the last position of string");
System.out.println(index1);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;
default :
System.out.println("Enter invalid input");
break;
}
}
}
