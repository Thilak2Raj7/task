package arrayrunner;
import array.ArrayListTask;
import java.util.*;
public class ArrayListRunner
{
Scanner scan=new Scanner(System.in);
ArrayListTask list=new ArrayListTask();
public void getArrayList(List object)
{
 try
 {
 object= list.getEmptyArrayList();
 System.out.println(list.getSize(object));
  }
  catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public void addStrings(List object)
{
try
{
 object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 int length=scan.nextInt();
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
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public void addInteger(List object)
{
try
{
 object= list.getEmptyArrayList();
System.out.println("Enter the length");
 int length=scan.nextInt();
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
}
public void addObject(List object)
{
try
{
 object= list.getEmptyArrayList();
System.out.println("Enter the length");
 int length=scan.nextInt();
 scan.nextLine();
Object[] array=new Object[length];
 for(int i=0;i<length;i++)
 {
 array[i]=list;//
 }
object=list.addFunction(object,array);
System.out.println(object);
 System.out.println(list.getSize(object)); 
} 
catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public void addTwoObjects(List object)
{
try
{
 object= list.getEmptyArrayList();
System.out.println("Enter the array Length");
int length=scan.nextInt();
Object[] array=new Object[length];
 System.out.println("Enter the integerlength");
int  integerlength=scan.nextInt();
 Integer [] integer=new Integer[integerlength];

  for(int i=0;i<integerlength;i++)
{
System.out.println("Enter the inputstring");

integer[i]=scan.nextInt();
}
object=list.addFunction(object,array);

System.out.println("Enter the stringlength");
int stringlength=scan.nextInt();
scan.nextLine();
String[] string=new String[stringlength];
 for(int i=0;i<stringlength;i++)
{
System.out.println("Enter the inputstring");
 string[i]=scan.nextLine();
}
object=list.addFunction(object,array);

//object=object.add(list);
//object=object.add(scan); 
  //
object=list.addFunction(object,array);
System.out.println(object);
 System.out.println(list.getSize(object)); 
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public void getPosition(List object,String inputString)
{
try
{
System.out.println("Enter the inputString");
 inputString=scan.nextLine();
  System.out.println("The position of the string is ");
int index=list.findIndex(object,inputString);
 System.out.println(index);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public void getString(List object,String inputString1,String inputString2)
{
try
{
 System.out.println("Enter the position");
 int index=scan.nextInt();
  inputString1=list.getString(object,index,inputString2);
 System.out.println(inputString1);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public void stringAtPosition(List object,String inputString2)
{
try
{
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
}
public void firstAndLastPosition(List object,List object1)
{
try
{  object1=list.getEmptyArrayList();
 System.out.println("Enter the start");
 int start=scan.nextInt();
 System.out.println("Enter the end");
 int end=scan.nextInt();
 object1=list.secondList(object,start,end);
 System.out.println(object1);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public void combineList(List object,List object1)
{
try
{
List object2= list.getEmptyArrayList();
boolean cl=list.combineTwoList(object,object1);
object=(List)cl;
System.out.println(object2);
System.out.println(list.getSize(object2));
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public List combine(List object1)
{
try
{
 object1= list.getEmptyArrayList();
 System.out.println("Enter the length");
 int length=scan.nextInt();
 scan.nextLine();
String[] array1=new String[length];
 for(int i=0;i<length;i++)
{
System.out.println("Enter the inputstring");
array1[i]=scan.nextLine();
}
object1=list.addFunction(object1,array1);
return object1;
}

catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public void doubleremove(List object)
{
try
{
 object= list.getEmptyArrayList();
 System.out.println("Enter the length");
 int length=scan.nextInt();

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
}public void decimalIndex(List object)
{
try
{
System.out.println("Enter the index");
int index=scan.nextInt();
object=list.decimalValueAtPosition(object,index);
System.out.println(object);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public void removeArray(List object,List object1)
{
try
{
object=list.removeFirstArray( object1,object);
System.out.println(object);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public void sameElement(List object,List object1)
{
try
{
object=list.sameElementRetain(object, object1);
 System.out.println(object);
 }
catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public void clear(List object)
{
try
{
object=list.clearAll(object);
System.out.println(object);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
} 
public void checkString(List object1,String inputString1)
{
try
{
System.out.println("Enter the checkString");
inputString1=scan.nextLine();
System.out.println(list.checkString(object1,inputString1));
System.out.println(object1);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
}
public void stringInput(List object,String inputString)
{
try
{
System.out.println("Enter the inputString");
 inputString=scan.nextLine();
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
}
/*public void iterate (List object)
{
try
{
//list.iteratormethod(object);
}
catch (Exception e)
{
 System.out.println(e.getMessage());
}
}*/
public static void main(String [] args)
{
Scanner scan=new Scanner(System.in);
ArrayListTask list=new ArrayListTask();
ArrayListRunner run=new ArrayListRunner();
int size=0;
int number=0;
int length=0;
int length1=0;
int start=0;
int end=0;
int integerlength=0;
int stringlength=0;
int objectlength=0;
List object;
List object1;
String inputString1="";
String inputString2="";
String inputString3="";
String inputString4="";
String inputString="";
String[] array={""};
try{
System.out.println("Enter the number");
 number=scan.nextInt();
 if(number>19 || number<0)
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
   run.getArrayList(object);
break;

case 2:
   run.addStrings( object);
break;

case 3 :
   run.addInteger( object);
break;

case 4:  
 run.addObject(object);
break;

case 5:
run.addTwoObjects( object);
break;

case 6 :
run.addStrings(object);
run.getPosition(object,inputString);
break;//7th missing
/*
case 7:

run.addStrings(object);
run.iterate(object);
break;*/
case 8:
run.addStrings( object);
run.getString( object, inputString,inputString2);
break;
case 9:

run.addStrings( object);
run.stringAtPosition( object,inputString);//10

break;
case 10:

run.addStrings( object);
run.firstAndLastPosition( object, object1);
break;
case 11 :
run.addStrings( object);
run.addStrings(object1);
run.combineList( object, object1);
break;

case 12:
run.addStrings(object);
run.combine( object1);
run.combineList(object,object1);
break;

case 13:
run.doubleremove( object);
break;

case 14:
run.doubleremove( object);
run.decimalIndex( object);
break;
case 15:
run.addStrings(object);
run.firstAndLastPosition( object,object1);
run.removeArray( object, object1);

break;
 case 16:
 
run.addStrings( object);
run.firstAndLastPosition( object, object1);
run.sameElement( object, object1);

case 17:

run.addStrings( object);
run.clear( object);
break;
case 18:
run.combine( object1);
run.checkString( object1,inputString1);
break;
case 19:
run.addStrings(object);
run.stringInput( object, inputString);
break;
default :
System.out.println("Enter invalid input");
break;
}
}
}


