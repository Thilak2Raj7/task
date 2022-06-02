package logical;
import logic.StringTask;

public class StringBuilderTask
{
StringTask learn=new StringTask();
 public void nullCheck(StringBuilder object)throws Exception{
if (object==null)
{
throw new Exception("String Builder should  not be null");
}
}
public void lengthCheck(int length)throws Exception{
if(length<0)
{
throw new Exception("String Builder length should be equal and greater than zero");
}
}
public int getLength(StringBuilder object)throws Exception
{

int length=object.length();
lengthCheck(length);
return length;
}

public StringBuilder getStringBuilder()throws Exception
{

StringBuilder object=new StringBuilder();
nullCheck(object);
return object;
}

public StringBuilder getStringBuilder1(String inputString)throws Exception{
StringBuilder object1=new StringBuilder(inputString);
nullCheck(object1);
return object1;
}
public StringBuilder append(StringBuilder object,String inputString)throws Exception{
learn.check(inputString);
object.append(inputString);
return object;
}

//public StringBuilder insert(String inputString,StringBuilder object,String inputString2,String inputString3)throws Exception{
//int number=learn.getLength(inputString);
//int number1=learn.getLength( inputString2);

//object.insert(number+1,inputString2+inputString3);
//return object;
//}
//public StringBuilder delete(StringBuilder object2,String inputString)throws Exception{
//int number=learn.getLength(inputString);
//object2.delete(0,number+1);//
//return object2;
//}
public StringBuilder reverse(StringBuilder object)throws Exception{
object.reverse();
return object;
}
public StringBuilder delete(StringBuilder object2,int num1,int num2)throws Exception{
object2.delete(num1,num2);//
return object2;
}
public StringBuilder replace(StringBuilder object2,String inputString2,int num1,int num2)throws Exception{
learn.check(inputString2);
object2.replace(num1, num2,inputString2);//
return object2;
}
public int getIndex(StringBuilder object,String inputString)throws Exception{
return object.indexOf(inputString);
}
public int getLastIndex(StringBuilder object,String inputString)throws Exception{
return object.lastIndexOf(inputString);
}
}



