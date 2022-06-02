package hashmaprunner;
import java.util.*;
import hashmaplogic.HashMapTask;
public class HashMapRunner{
HashMapTask logic =new HashMapTask();
Scanner scan=new Scanner(System.in);
private Map<Object,Object> inputValues(Map<Object,Object>object,Object key,Object value)throws Exception
{
 System.out.println("Enter the number of pairs");
 int pairs=scan.nextInt();
 scan.nextLine();
 for (int i=0;i<pairs;i++)
{
System.out.println("Enter the key");
key=scan.nextLine();
System.out.println("Enter the value");
 value=scan.nextLine();
  object=logic.putKeysValues(object,key,value);
}
  return object;
}

public static void main(String [] args){
HashMapTask logic =new HashMapTask();

Scanner scan=new Scanner(System.in);
int number =0;
Object key="";
Object value="";
HashMapRunner run=new HashMapRunner();

 try
{
System.out.println("Enter the number");
number=scan.nextInt();
scan.nextLine();
if (number<0||number>21)
{
 throw new Exception("Number should be within the range");
 }
 }
catch (Exception e)
{
 System.out.println(e.getMessage());
}
switch (number)
{
 case 1 :
 try
 {
 Map<Object,Object> object=logic.createHashMap();
 System.out.println(object);
 System.out.println(logic.getSize(object));
 }
catch (Exception e)
{
 System.out.println(e.getMessage());
 }
 break;
 
 case 2:
 try
 {
 Map<Object,Object> object=logic.createHashMap();
object=run.inputValues(object,key,value);
System.out.println("The pairs are ");
System.out.println(object);
System.out.println("Enter the size");
System.out.println(logic.getSize(object));
}
 catch (Exception e)
{
 System.out.println(e.getMessage());
 }
 break;
 
 case 3:
 try{
 Map<Object,Object> object=logic.createHashMap();
 System.out.println("Enter the number of pairs");
 int pairs=scan.nextInt();
 for (int i=0;i<pairs;i++)
{
System.out.println("Enter the key");
key=scan.nextInt();
System.out.println("Enter the value");
 value=scan.nextInt();
 object=logic.putKeysValues(object,key,value);
}
System.out.println("The pairs are ");
System.out.println(object);
System.out.println("Enter the size");
System.out.println(logic.getSize(object));
 }   
 catch (Exception e)
{
 System.out.println(e.getMessage());
 }
 break;
 
 case 4:
 try{
 Map<Object,Object> object=logic.createHashMap();
 System.out.println("Enter the number of pairs");
 int pairs=scan.nextInt();
 scan.nextLine();

 for (int i=0;i<pairs;i++)
{

System.out.println("Enter the key");
key=scan.nextLine();
System.out.println("Enter the value");
value=scan.nextInt();
object=logic.putKeysValues(object,key,value);
 scan.nextLine();
}
System.out.println("The pairs are ");
System.out.println(object);
System.out.println("Enter the size");
System.out.println(logic.getSize(object));
 }
 catch (Exception e)
{
 System.out.println(e.getMessage());
 }
 break;
 
 case 5:
 try
 {
  Map<Object,Object> object=logic.createHashMap();
  //System.out.println("Enter the number of pairs");
  //int pairs=scan.nextInt();
 scan.nextLine();
  Object [] array= new Object[3];
 array[0]=scan;
 array[1]=logic;
 array[2]=object;
//Object [] array={scan,object,logic};
for (int i=0;i<3;i++)
{
System.out.println("Enter the key");
key=scan.nextLine();
value=array[i];
object=logic.putKeysValues(object,key,value);
}

System.out.println("The pairs are ");
System.out.println(object);
System.out.println("Enter the size");
System.out.println(logic.getSize(object));
 }
catch (Exception e)
{
 System.out.println(e.getMessage());
}
break;

case 6:
try{
Map<Object,Object> object=logic.createHashMap();
object=run.inputValues(object,key,value);
System.out.println("Enter the key");
 key=scan.nextLine();
 object=logic.putKeysValues(object,key,null);
System.out.println("The pairs are ");
System.out.println(object);
System.out.println("Enter the size");
System.out.println(logic.getSize(object));
 }
 catch (Exception e)
{
 System.out.println(e.getMessage());
 }
 break;
 
 case 7:
 try{
  Map<Object,Object> object=logic.createHashMap();
 System.out.println("Enter the value");
 value=scan.nextLine();
 object=logic.putKeysValues(object,null,value);
 System.out.println(object);
System.out.println("Enter the size");
System.out.println(logic.getSize(object));
 }
 catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;
 
 case 8:
 try{
 Map<Object,Object> object=logic.createHashMap();
object=run.inputValues(object,key,value);
System.out.println("The pairs are ");
System.out.println(object);
System.out.println("Enter the key");
key=scan.nextLine();
System.out.println(logic.checkKeyPresent(object,key));
}
catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;
 
 case 9:
 try{
 Map<Object,Object> object=logic.createHashMap();
object=run.inputValues(object,key,value);
System.out.println("The pairs are ");
System.out.println(object);
System.out.println("Enter the value");
value=scan.nextLine();
System.out.println(logic.checkValuePresent(object,value));
}
catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;
 
 case 10:
 try
 {
 Map<Object,Object> object=logic.createHashMap();
object=run.inputValues(object,key,value);
System.out.println(logic.getSize(object));
Map<Object,Object> newObject=logic.createHashMap();
newObject=run.inputValues(newObject,key,value);
object=logic.copyAllToAnotherMap(object,newObject);
System.out.println(object);
System.out.println(logic.getSize(object));
}
catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;
 
 case 11:
 try
 {
  Map<Object,Object> object=logic.createHashMap();
 object=run.inputValues(object,key,value);
 System.out.println(object);
 System.out.println("Enter the checkkey ");
 Object checkKey=scan.nextLine();
System.out.println(logic.getValue(object,checkKey));
 }
 catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;
 
 case 12:
 try
 {
  Map<Object,Object> object=logic.createHashMap();
 object=run.inputValues(object,key,value);
 System.out.println(object);
 System.out.println("Enter the checkkey ");
 Object checkKey=scan.nextLine();
System.out.println(logic.getValue(object,checkKey));
 }
 catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;
 
 case 13:
  try
 {
  Map<Object,Object> object=logic.createHashMap();
 object=run.inputValues(object,key,value);
 System.out.println(object);
 System.out.println(logic.getSize(object));
 System.out.println("Enter the defaultvalue");
 Object defaultValue=scan.nextLine();

 System.out.println("Enter the checkkey ");
 Object checkKey=scan.nextLine();
System.out.println("The non existing key value is ");
value=logic.getReturnValue(object,checkKey,defaultValue);
System.out.println(value);
System.out.println(object);
System.out.println(logic.getSize(object));
 }
 catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;
 
 case 14 :
try{
Map<Object,Object> object=logic.createHashMap();
 object=run.inputValues(object,key,value);
 System.out.println(object);
 System.out.println(logic.getSize(object));
 System.out.println("Enter the checkkey ");
 Object checkKey=scan.nextLine();
 object=logic.removeKey(object,checkKey);
 System.out.println(object);
 System.out.println(logic.getSize(object));
}
catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;
 
 case 15 :
 try{
Map<Object,Object> object=logic.createHashMap();
 object=run.inputValues(object,key,value);
 System.out.println(object);
 System.out.println(logic.getSize(object));
 System.out.println("Enter the checkkey ");
 Object checkKey=scan.nextLine();
  System.out.println("Enter the checkvalue ");
 Object checkValue=scan.nextLine();
 object=logic.removeKeyAndValue(object,checkKey,checkValue);
 System.out.println(object);
 System.out.println(logic.getSize(object));
}
catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;
 
 case 16:
 try
 {
 Map<Object,Object> object=logic.createHashMap();
 object=run.inputValues(object,key,value);
 System.out.println(object);
 System.out.println(logic.getSize(object));
 System.out.println("Enter the checkkey ");
 key=scan.nextLine();
  System.out.println("Enter the checkvalue ");
 Object replaceValue=scan.nextLine();
object=logic.replaceKey(object,key,replaceValue);
System.out.println(object);
 System.out.println(logic.getSize(object));
 }
 catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;
 
 case 17:
 try

  {
 Map<Object,Object> object=logic.createHashMap();
 object=run.inputValues(object,key,value);//
 System.out.println(object);
 System.out.println(logic.getSize(object));
 System.out.println("Enter the checkkey ");
 key=scan.nextLine();
 System.out.println("Enter the value");
 value=scan.nextLine();
  System.out.println("Enter the checkvalue ");
 Object replaceValue=scan.nextLine();
boolean replace=logic.replaceKeyAndValue(object,key,value,replaceValue);
object=logic.putKeysValues(object,key,replaceValue);
System.out.println(object);
 System.out.println(logic.getSize(object));
 }
 catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;

 
 case 18:
 try
 {
 Map<Object,Object> object=logic.createHashMap();
object=run.inputValues(object,key,value);
System.out.println(object);
System.out.println(logic.getSize(object));
Map<Object,Object> newObject=logic.createHashMap();
System.out.println(newObject);
newObject=logic.copyAllToAnotherMap(newObject,object);
 System.out.println(newObject);
 System.out.println(logic.getSize(newObject));
}
catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break; 
 
 case 19 :
 try
 {
 Map<Object,Object> object=logic.createHashMap();
object=run.inputValues(object,key,value);
logic.iterate(object); 
}
catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;
 
 case 20:
 try
 {
 Map<Object,Object> object=logic.createHashMap();
object=run.inputValues(object,key,value);
System.out.println(object);
System.out.println(logic.getSize(object));
object=logic.clearAll(object);
System.out.println(object);
System.out.println(logic.getSize(object));
}
catch (Exception e)
 {
 System.out.println(e.getMessage());
 }
 break;
 
 default :
 System.out.println("Invalid input");
 break;
}
}
}
