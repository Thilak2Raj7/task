package runner;
import logical.StringBuilderTask;
import logic.StringTask;
import java.util.Scanner;
public class StringBuilderRun{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
StringBuilderTask build=new StringBuilderTask();
StringTask learn=new StringTask();
int num=0;
int num1=0;
int num2=0;
String inputString="";
String inputString1="";
String inputString2="";
String inputString3="";
String inputString4="";
String inputString5="";
String inputString6="";
int number=0;

try{
System.out.println("Enter the number");
number=scan.nextInt();
scan.nextLine();
if(number<0||number>20){
throw new Exception("Enter the valid number!!");
}
}
catch (Exception e)
{
System.out.println(e.getMessage()+"number should be a integer above 0 and below 10");
}
switch(number){
case 1:
try
{
StringBuilder  object1=build.getStringBuilder();
System.out.println(object1);
System.out.println(build.getLength(object1));
System.out.println("Enter the inputString");
inputString1=scan.nextLine();
StringBuilder  object2=build.append(object1,inputString1);
System.out.println(object2);
System.out.println(build.getLength(object2));
}
catch (Exception e)
{
System.out.println(e.getMessage());
}

break;
case 2:
try{
StringBuilder object2=build.getStringBuilder1(inputString1);
System.out.println(object2);
System.out.println("Enter the inputString");
inputString1=scan.nextLine();
System.out.println(object2);
System.out.println(build.getLength(object2));
System.out.println("Enter the symbol");
inputString6=scan.nextLine();
object2=build.append(object2,inputString6);
System.out.println("Enter the string1");
inputString2=scan.nextLine();
object2=build.append(object2,inputString2);

object2=build.append(object2,inputString6);

System.out.println("Enter the string2");
inputString3=scan.nextLine();
object2=build.append(object2,inputString3);

object2=build.append(object2,inputString6);

System.out.println("Enter the string3");
inputString4=scan.nextLine();
object2=build.append(object2,inputString4);

object2=build.append(object2,inputString6);

System.out.println("Enter the string4");
inputString5=scan.nextLine();
object2=build.append(object2,inputString5);
System.out.println(object2);
}
catch (Exception e)
{
System.out.println(e.getMessage());
}
break;
case 3:
try{

System.out.println("Enter the inputString");
inputString=scan.nextLine();
StringBuilder object2=build.getStringBuilder1(inputString);

//object2=build.getStringBuilder(inputString)
//object2=build.append(object2,inputString);

System.out.println("Enter the symbol");
inputString2=scan.nextLine();
object2=build.append(object2,inputString2);
System.out.println("Enter the inputString1");
inputString1=scan.nextLine();
object2=build.append(object2,inputString1);

System.out.println(object2);
System.out.println(build.getLength(object2));

System.out.println("Enter the inputString");
inputString3=scan.nextLine();

StringBuilder  object=build.getStringBuilder1(inputString);
object=build.append(object,inputString2);
object=build.append(object,inputString3);//doubt
object=build.append(object,inputString2);
object=build.append(object,inputString1);
System.out.println(object);
//object=build.append(object,inputString3);
//object=build.append(object,inputString2);
//object1=build.insert(inputString,object2,inputString3,inputString2);

//System.out.println(object1);
}
catch (Exception e)
{
System.out.println(e.getMessage());
}
break;

case 4:
try{
System.out.println("Enter the inputString");
inputString=scan.nextLine();
StringBuilder object2=build.getStringBuilder1(inputString);

//object2=build.getStringBuilder(inputString)
//object2=build.append(object2,inputString);

System.out.println("Enter the symbol");
inputString2=scan.nextLine();
object2=build.append(object2,inputString2);
System.out.println("Enter the inputString1");
inputString1=scan.nextLine();
object2=build.append(object2,inputString1);

System.out.println("Entered  string");
System.out.println(object2);

System.out.println("Length of the string is ");
System.out.println(build.getLength(object2));

System.out.println("Enter the num1");
num1=scan.nextInt();
System.out.println("Enter the num2");
num2=learn.getLength(inputString)+1;

object2=build.delete(object2, num1, num2);
System.out.println("final string is ");
System.out.println(object2);
System.out.println("final string length is");
System.out.println(build.getLength(object2));
}
catch (Exception e)
{
System.out.println(e.getMessage());
}
break;
case 5:
try{
System.out.println("Enter the string1");
inputString=scan.nextLine();
StringBuilder object=build.getStringBuilder1(inputString);
System.out.println("Enter the symbol");
inputString3=scan.nextLine();
object=build.append(object,inputString3);
System.out.println("Enter the string2");
inputString1=scan.nextLine();
object=build.append(object,inputString1);
object=build.append(object,inputString3);

System.out.println("Enter the string3");
inputString2=scan.nextLine();
System.out.println("Enter the replace symbol");
inputString4=scan.nextLine();
object=build.append(object,inputString2);
System.out.println(object);
System.out.println(build.getLength(object));
inputString5=learn.getConcat(object.toString(),inputString4,inputString3);
System.out.println(inputString5);
System.out.println(learn.getLength(inputString5));
//object=build.append(object,inputString5);
//System.out.println(object);
}
catch (Exception e)
{
System.out.println(e.getMessage());
}
break;
case 6:
try{
System.out.println("Enter the inputString");
inputString=scan.nextLine();
System.out.println("Enter the inputString1");
inputString1=scan.nextLine();
System.out.println("Enter the inputString2");
inputString2=scan.nextLine();
System.out.println("Enter the symbol");
inputString4=scan.nextLine();
StringBuilder object=build.getStringBuilder1(inputString);
object=build.append(object,inputString4);
object=build.append(object,inputString1);
object=build.append(object,inputString4);
object=build.append(object,inputString2);
System.out.println(object);
System.out.println(build.getLength(object));
object=build.reverse(object);
System.out.println(object);
System.out.println(build.getLength(object));
}
catch (Exception e)
{
System.out.println(e.getMessage());
}
break;
case 7:
try
{
System.out.println("Enter the inputString");
inputString=scan.nextLine();
StringBuilder object=build.getStringBuilder1(inputString);
System.out.println(object);
System.out.println(build.getLength(object));
//System.out.println("Enter the number1");
//m1=scan.nextInt();
//stem.out.println("number2");
//m2=scan.nextInt();
System.out.println("Enter the num1");
num1=scan.nextInt();
System.out.println("Enter the num2");
num2=scan.nextInt();
object=build.delete(object,num1,num2);
System.out.println(object);
 System.out.println(build.getLength(object));
}
catch (Exception e)
{
System.out.println(e.getMessage());
}
break;
case 8:
try{
System.out.println("Enter the inputString");
inputString=scan.nextLine();
StringBuilder object=build.getStringBuilder1(inputString);
System.out.println(object);
System.out.println(build.getLength(object));
System.out.println("Replace string is ");
inputString2= scan.nextLine();
System.out.println("Enter the num1");
num1=scan.nextInt();
System.out.println("Enter the num2");
num2=scan.nextInt();
object=build.replace(object,inputString2,num1,num2);
System.out.println(object);
System.out.println(build.getLength(object));
}
catch (Exception e)
{
System.out.println(e.getMessage());
}
break;
case 9:
try{
System.out.println("Enter the string1");
inputString=scan.nextLine();
StringBuilder object=build.getStringBuilder1(inputString);
System.out.println("Enter the symbol");
inputString3=scan.nextLine();
object=build.append(object,inputString3);
System.out.println("Enter the string2");
inputString1=scan.nextLine();
object=build.append(object,inputString1);
object=build.append(object,inputString3);


System.out.println("Enter the string3");
inputString2=scan.nextLine();

object=build.append(object,inputString2);
System.out.println(object);
num=build.getIndex(object,inputString3);
System.out.println("The index number is:");
System.out.println(num);

}
catch (Exception e)
{
System.out.println(e.getMessage());
}
break;
case 10:
try{
System.out.println("Enter the string1");
inputString=scan.nextLine();
StringBuilder object=build.getStringBuilder1(inputString);
System.out.println("Enter the symbol");
inputString3=scan.nextLine();
object=build.append(object,inputString3);
System.out.println("Enter the string2");
inputString1=scan.nextLine();
object=build.append(object,inputString1);
object=build.append(object,inputString3);


System.out.println("Enter the string3");
inputString2=scan.nextLine();

object=build.append(object,inputString2);
System.out.println(object);
num=build.getLastIndex(object,inputString3);
System.out.println("The index number is:");
System.out.println(num);

}
catch (Exception e)
{
System.out.println(e.getMessage());
}
break;
default :
 System.out.println("Invalid Input");
 break;
}
}
}
