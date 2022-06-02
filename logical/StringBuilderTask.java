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


public int getLength(StringBuilder object)throws Exception
{
nullCheck(object);
int length=object.length();
return length;
}

public StringBuilder getStringBuilder()throws Exception
{
StringBuilder object=new StringBuilder();
return object;
}

public StringBuilder getStringBuilder(String inputString)throws Exception
{
learn.check(inputString);
StringBuilder object=new StringBuilder(inputString);
return object;
}

public StringBuilder append(StringBuilder object,String inputString)throws Exception
{
nullCheck(object);
learn.check(inputString);
object.append(inputString);
return object;
}

//public StringBuilder insert(String inputString,StringBuilder object,String inputString2,String inputString3)throws Exception{
//int number=learn.getLength(inputString);
//int start=learn.getLength( inputString2);
  

//object.insert(number+1,inputString2+inputString3);
//return object;
//}
//public StringBuilder delete1(StringBuilder object2,String inputString)throws Exception{
//int number=learn.getLength(inputString);
//object2.delete(0,number+1);//
//return object2;
public StringBuilder append(StringBuilder object,char character)throws Exception
{
nullCheck(object);
object.append(character);
return object;
}


public StringBuilder reverse(StringBuilder object)throws Exception
{
nullCheck(object);
object.reverse();
return object;
}

public StringBuilder delete(StringBuilder object2,int start,int end)throws Exception
{
nullCheck(object2);
int length=getLength(object2);
learn.checkLength( length,start);
learn.checkLength(length,end);
object2.delete(start,end);//8th prg
return object2;
}

public StringBuilder replace(StringBuilder object2,String inputString2,int start,int end)throws Exception
{
nullCheck(object2);
learn.check(inputString2);
int length=getLength(object2);
learn.checkLength( length,start);
learn.checkLength(length,end);
object2.replace(start, end,inputString2);
return object2;
}

public int getIndex(StringBuilder object,String inputString)throws Exception
{
nullCheck(object);
return object.indexOf(inputString);
}

public int getLastIndex(StringBuilder object,String inputString)throws Exception
{
nullCheck(object);
return object.lastIndexOf(inputString);
}

//public StringBuilder getRequiredString(StringBuilder object,String inputString3,String inputString4)throws Exception
//{
//nullCheck(object);
//int length=getLength(object);
//object=object.replace(0,length,inputString4);
//return object;
//public String replace(String inputString,String inputString1){
//String inputString5=inputString.replace
}

