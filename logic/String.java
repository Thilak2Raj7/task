package logic;
import java.util.*;
public class String{
public void check(String inputString)throws Exception{
if (inputString==null || inputString.isEmpty()){
 throw new Exception("String should not be null or empty");
 }
 }
 public void checkArray(String [] inputString)throws Exception{
for(String word:inputString)
{ 
 check(word);
 }
 }
 
 public void checkLength(int length,int number)throws Exception{
if(length<number|| number<0 ){
throw new Exception("String should be greater than number of characters");
 }
 }
 
public int getLength(String inputString)throws Exception{
check(inputString); //1st
 return inputString.length();
}

public char [] getCharArray(String inputString)throws Exception{
check(inputString);
 char array []= inputString.toCharArray();//2nd
return array;
 }
 
 public char getPlaceOfCharacter(String inputString,int position)throws Exception{//3rd pg;
int length1=getLength(inputString);
checkLength(length1,position);
 char character=inputString.charAt(position);//3rd
return character;
 }
 
 public int getOccurence(String inputString,char letter)throws Exception{ 
char []array1=getCharArray(inputString);
 int count=0;
for(char character1:array1)
{
if(letter==character1)
 {
  count++;
  }
  }
 return count;
}

public int getPosition(String inputString,char letter)throws Exception{
check(inputString);//5th pg
int position=inputString.lastIndexOf(letter);
return position;
}

public String  getLastNCharacters(String inputString,int numberOfCharacters)throws Exception{
int length1=getLength(inputString);
checkLength( length1, numberOfCharacters);//6th pg
String returnString=inputString.substring(length1-numberOfCharacters);
return returnString;
}

public String getFirstNCharacters(String inputString,int numberOfCharacters)throws Exception{
int length1=getLength(inputString);
checkLength(length1,numberOfCharacters);
 String returnString=inputString.substring(0,numberOfCharacters);//7th pg
 return returnString;
}

public String getReplaceCharacters(String inputString,String inputString1,int numberOfCharacters)throws Exception{
check(inputString1);
//checkLength(getLength(inputString),numberOfCharacters);
//String returnString=inputString.substring(0,numberOfCharacters);
String returnString=getFirstNCharacters(inputString,numberOfCharacters);
returnString=inputString.replaceFirst(returnString,inputString1);//8th pg
return returnString;
}

public boolean getReplaceAtBegining(String inputString,String inputString1)throws Exception{
 check(inputString);
 check(inputString1);
boolean validate=inputString.startsWith(inputString1);
return validate;
}//9th pg

public boolean getReplaceAtEnding(String inputString,String inputString1)throws Exception{
check(inputString);
check(inputString1);
boolean validate=inputString.endsWith(inputString1);//10th pg
return validate;
}

public String getLowerCase(String inputString)throws Exception{
 check(inputString);
inputString=inputString.toLowerCase();//11th pg
return inputString;
}

public String getUpperCase(String inputString)throws Exception{
check(inputString);
inputString=inputString.toUpperCase();//12th pg
return inputString;
}

public String getReverse(String inputString)throws Exception{
String rev="";
int number=getLength(inputString);//13 th pg
for(int i=number-1;i>=0;i--){
 rev=rev+inputString.charAt(i);
 }
 return rev;
 }
 
public String getConcat(String inputString,String inputString2,String inputString1)throws Exception{
check(inputString);
check(inputString1);
check(inputString2);
  inputString=inputString.replaceAll(inputString1,inputString2);//15th pg
return inputString;
}


public String[] getEncloseString(String inputString)throws Exception{
check(inputString);
String[] array2=inputString.split(" ");//16th
return array2;
}

public String getStringHypen(String inputString[],String inputString2)throws Exception{
checkArray(inputString);
check(inputString2);//17th prg
String inputString3=String.join(inputString2,inputString);
return inputString3;
}

public boolean getSensitiveChar(String inputString,String inputString1)throws Exception{
check(inputString);
check(inputString1);
boolean validate=inputString.equals(inputString1);
return validate; 
}

public boolean getCaseInSensitive(String inputString,String inputString1)throws Exception{
check(inputString);
check(inputString1);
boolean validate=inputString.equalsIgnoreCase(inputString1);//19th pg
return validate;
}

public String getTrimSpace(String inputString)throws Exception{
check(inputString);
inputString=inputString.trim();//20th pg
return inputString;
}
}
