package array;
import java.util.*;

public class ArrayListTask
{
public int getSize(List object)
{
  int size=object.size();
  return size;
}
public void nullCheck(List object) throws Exception
{
if(object == null)
{
throw new Exception("List should not be null");
}
}

public void sizeCheck(int size, int index) throws Exception
{ 
if((index>size) || (size<0))
{
throw new Exception("Size should not less than index and Size should not less than zero");
}
}

  
public List getEmptyArrayList() throws Exception
{
 List object=new ArrayList();
 return object;
}

public List addFunction(List object,Object [] array)throws Exception
{
nullCheck(object);
Collections.addAll(object,array);
return object;
//for(int i=0;i<array.length;i++)
//{
///object.add(array[i]);
//}
 //return object;
}

//public List addObject(List object,StringBuilder build)throws Exception
//{ 
//nullCheck(object);
//object.add(build);
//return object;
//}
public int findIndex(List object,String inputString)throws Exception
{
nullCheck(object);
int index=object.indexOf(inputString);
return index;
}

public String getString(List object,int position,String inputString)throws Exception
{ 
 nullCheck(object);
 int size=getSize(object);
 sizeCheck(size,position);
 inputString=(String)object.get(position);
 return inputString;
 }
public int findLastIndex(List object,String inputString)throws Exception
{
nullCheck(object);
int index=object.lastIndexOf(inputString);
return index;
}

public List addString(List object,String inputString,int index)throws Exception
{
nullCheck(object);
int size=getSize(object);
 sizeCheck(size,index);
object.add(index,inputString);
return object;
}

public List secondList(List object,int start,int end)throws Exception
{
nullCheck(object);
int size=getSize(object);
 sizeCheck(size,end);
 sizeCheck(end,start);
object.subList(start,end);
return object;
}

public List removeOneDecimalValue(List object,double number)throws Exception
{
nullCheck(object);
object.remove(number);
return object;
}


public List decimalValueAtPosition(List object,int index)throws Exception
{
nullCheck(object);
int size=getSize(object);
 sizeCheck(size,index);
object.remove(index);
return object;
}
public boolean combineTwoList(List object,List secondObject)throws Exception
{
 nullCheck(object);
 return object.addAll (secondObject);
}

public List clearAll(List object)throws Exception
{
nullCheck(object);
object.clear();
return object;
}

public boolean checkString(List object,String inputString) throws Exception
{
 nullCheck(object);
 boolean check=object.contains(inputString);
return check;
}

public boolean sameElementRetain(List object,List secondObject) throws Exception
{
nullCheck(object);
return object.retainAll(secondObject);
}

public boolean removeFirstArray(List object,List secondObject)throws Exception
{
nullCheck(object);
return secondObject.removeAll(object);
}
}

