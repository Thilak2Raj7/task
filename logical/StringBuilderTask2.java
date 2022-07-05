package logical;
import logic.StringTask1;

public class StringBuilderTask
{
StringTask1 learn=new StringTask1();
 public void nullCheck(StringBuilder object)throws Exception{
if (object==null)
{
throw new Exception("String Builder should be null");
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
//nullCheck(StringBuilder object);
return object;
}
public StringBuilder append(StringBuilder object,String inputString){
object.append(inputString);
return object;
}
public StringBuilder insert(String inputString,StringBuilder object,String inputString2,String inputString3)throws Exception{
int number=learn.getLength(inputString);
int number1=learn.getLength( inputString2);

object.insert(number+1,inputString2+inputString3);
return object;
}
}


