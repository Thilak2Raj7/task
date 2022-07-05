package run;
import logic.StringTask;
import java.util.Scanner;
public class StringRun{
public static void main(String args[]){
Scanner sample=new Scanner(System.in);
char letter=0;
char character=0;
int position=0;
int length=0;
String[]array2={""};
char[] array1={};
int numberOfCharacters=0;
String inputString="";
String inputString1="";
String inputString2="";
StringTask1 learn= new StringTask1();
int number=0;
System.out.println("case1 :to accept a String & find the length of a String");
System.out.println("case2 :to accept a String & convert it into character Array");
System.out.println("case3 :to accept a String & find the character at the last but one place(penultimate)");
System.out.println("case4 :to accept a string & find the number of occurrences of a given letter/character");
System.out.println("case5 :to accept a String(with repeated letters) & find the greatest position of the given letter");
System.out.println("case6 :to print the last 5 characters of a given String ");
System.out.println("case7 : to print the first 3 characters of a given String");
System.out.println("case8 : to replace the first 3 characters of a String with XYZ");
System.out.println("case9 : m to check whether a String starts with ent");
System.out.println("case10:to check whether a String ends with le");
System.out.println("case12:to convert an all uppercase string to an lowercase string");
System.out.println("case11:to convert an all lowercase string to an uppercase string.");
System.out.println("case13:to reverse a String");
System.out.println("case14:to accept a line with multiple Strings");
System.out.println("case15:to accept a line with multiple Strings and concatenate each individual Strings without space.");
System.out.println("case16:to accept a line with multiple Strings & enclose each String into a String array");
System.out.println("case17:to accept multiple Strings & merge each String with -");
System.out.println("case18:to check whether the two given input String are equal -case sensitive");
System.out.println("case19:to check whether the two given input String are equal -case in sensitive");
System.out.println("case20:to accept a String with a space at the end & beginning and output string without space");
try{
System.out.println("Enter the number");
number=sample.nextInt();
sample.nextLine();
}
catch (Exception e){
System.out.println("number should be a integer above 0 and below 20");
}
switch(number){
case 1:
try{
System.out.println(args[0]);
System.out.println(learn.getLength(args[0]));
}
catch (Exception e){
System.out.println("Need a valid string");
}
 break;
 case 2:
 try{
 System.out.println("Enter the string");
 inputString=sample.nextLine();
 if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
 }
 System.out.println("Required string output");
  array1=learn.getCharArray(inputString);
 for(char character1:array1){
 System.out.println(character1);
 }
 }
 catch(Exception e)
 {
  System.out.println(e.getMessage()+" "+"Need a valid string");
}
 break;
 case 3:
 try{
 System.out.println("Enter the string");
 inputString=sample.nextLine();
 if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
 }
 System.out.println("Enter the position");
 position=sample.nextInt();
 System.out.println("Required string output");
 System.out.println(learn.getPlaceOfCharacter(inputString,position));
 }
 catch (Exception e){
 System.out.println(e.getMessage()+" "+"Need a valid string or position ");
 }
 break;
 case 4:
 try{
  System.out.println("Enter the string");
  inputString=sample.nextLine();
  if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
 }
  System.out.println("Enter the character");
  letter=sample.next().charAt(0);
  System.out.println("Required string output");
  System.out.println(learn.getOccurence(inputString,letter));
}
 catch (Exception e){
 System.out.println(e.getMessage()+" "+"Exception thrown!");
 }
break;
 case 5:
 try{
 System.out.println("Enter the string");
 inputString=sample.nextLine();
 if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
 }
 System.out.println("Enter the character");
 letter=sample.next().charAt(0);
  System.out.println("Required string output");
 System.out.println(learn.getPosition(inputString,letter));
 }
 catch(Exception e){
 System.out.println(e.getMessage()+" "+"Enter valid string or letter!");
 }
 break;
 case 6:
 try{
 System.out.println("Enter the string");
 inputString=sample.nextLine();
 if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
 }
 System.out.println("how many characters wants to print");
 numberOfCharacters=sample.nextInt();
 System.out.println("Required string output");
 System.out.println(learn.getLastNCharacters(inputString,numberOfCharacters));
 }
 catch(Exception e){
 System.out.println(e.getMessage()+" "+"Characters constrain!");
 }
 break;
 case 7:
 try{
 System.out.println("Enter the string");
 inputString=sample.nextLine();
 if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
 }
 System.out.println(" many characters wants to print");
  numberOfCharacters=sample.nextInt();
 System.out.println("Required string output");
 System.out.println(learn.getFirstNCharacters(inputString,numberOfCharacters));
 }
 catch(Exception e){
 System.out.println(e.getMessage()+" "+"Constrain in the Number of characters to be printed !");
 }
 break;
 case 8:
 try{
 System.out.println("Enter the string");
 inputString=sample.nextLine();
 if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
 }
 System.out.println("Enter the characters  ");
 inputString1=sample.nextLine();
  System.out.println("Enter the number of words to be replaced");
 numberOfCharacters=sample.nextInt();
  System.out.println("Required string output");
  System.out.println(learn.getReplaceCharacters(inputString,inputString1,numberOfCharacters));
 }
 catch(Exception e){
 System.out.println(e.getMessage()+" "+"enter valid characters!");
 }
 break;
 case 9:
 try{
 System.out.println("Enter the string");
 inputString=sample.nextLine();
 if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
  }
 System.out.println("Enter the character");
 inputString1=sample.nextLine();
  if(inputString1.isEmpty()){
 throw new Exception("inputString is empty ");
  }
  System.out.println("Required string output");
  System.out.println(learn.getReplaceAtBegining(inputString,inputString1));
 }
 catch(Exception e){
 System.out.println(e.getMessage()+" "+"Characters range is in the constrain!");
 }
 break;
 
 case 10:
 try{
 System.out.println("Enter the string");
 inputString=sample.nextLine();
 if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
 }
  System.out.println("Enter the character");
 inputString1=sample.nextLine();
  System.out.println("Required string output");
  System.out.println(learn.getReplaceAtEnding(inputString,inputString1));
 }
 catch(Exception e){
System.out.println(e.getMessage()+" "+"Check string and characters you have enter!");
 }
 break;
 
case 11:
try{
System.out.println("Enter the string");
 inputString=sample.nextLine();
  if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
  }
  System.out.println("Required output");
   System.out.println(learn.getLowerCase(inputString));
}
 catch(Exception e){
 System.out.println(e.getMessage());
 }
break;
case 12:
try{
System.out.println("Enter the string");
 inputString=sample.nextLine();
  if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
  }
  System.out.println("Required output");
 System.out.println(learn.getUpperCase(inputString)); 
  }
 catch(Exception e){
System.out.println(e.getMessage());
 }
break;
case 13:
try{
System.out.println("Enter the string");
inputString=sample.nextLine();
if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
 }
 System.out.println("Reverse of the string");
System.out.println(learn.getReverse(inputString));
}
catch(Exception e)
 {
  System.out.println(e.getMessage()+" "+"check the string and enter the valid string!");
}
break;
case 14:
try{
System.out.println("Enter the string");
 inputString=sample.nextLine();

 if(inputString.isEmpty()){
 throw new Exception("inputString is empty ");
 }
  learn.check(inputString);
 System.out.println("Entered string");
 System.out.println(inputString);
}
 catch(Exception e){
 System.out.println(e.getMessage());
 }
break;
case 15:
try{
System.out.println("Enter the string");
 inputString=sample.nextLine();
 System.out.println("Enter the symbol");
 inputString1=sample.nextLine();
 System.out.println("Enter the  replace symbol");
 inputString2=sample.nextLine();
 System.out.println("Output string");
 System.out.println(learn.getConcat(inputString,inputString2,inputString1));
 }
 catch(Exception e){
 System.out.println(e.getMessage());
 }
break;
case 16:
try{
System.out.println("Enter the string");
 inputString=sample.nextLine();
 System.out.println("Output string");
array2=learn.getEncloseString(inputString);
for(String inputString3:array2)
{
 System.out.println(inputString3);
}
 }
 catch(Exception e){
 System.out.println(e.getMessage()+"Valid string should be entered!");
 }
break;
case 17:
try{
System.out.println("Enter the number of words");
number=sample.nextInt();
sample.nextLine();
String Array[]=new String[number];
System.out.println("Enter the string");
for(int i=0;i<number;i++)
{
Array[i]=sample.nextLine();
}
System.out.println("Enter the symbol");
inputString1=sample.nextLine();
System.out.println("Output string");
 System.out.println(learn.getStringHypen(Array,inputString1));
}
 catch(Exception e){
 System.out.println(e.getMessage()+" "+"exception found due to nonvalid inputString or number of words");
 }
break;
case 18:
try{
System.out.println("Enter the string");
inputString=sample.nextLine();
System.out.println("Enter the  another string");
 inputString1=sample.nextLine();
 System.out.println("Output string");
 System.out.println(learn.getSensitiveChar(inputString,inputString1));
 }
 catch(Exception e){
 System.out.println(e.getMessage());
 }
 break;
case 19:
try{
System.out.println("Enter the string");
 inputString=sample.nextLine();
 System.out.println("Enter the  another string");
 inputString1=sample.nextLine();
 System.out.println("Output string");
 System.out.println(learn.getCaseInSensitive(inputString,inputString1));
 }
 catch(Exception e){
 System.out.println(e.getMessage());
 }
break;
case 20:
try{
System.out.println("Enter the string");
 inputString=sample.nextLine();
 System.out.println("Output string");
 System.out.println(learn.getTrimSpace(inputString));
 }
 catch(Exception e){
System.out.println(e.getMessage());
 }
break;
default :
 System.out.println("Invalid Input");
 break;
}
}
}

