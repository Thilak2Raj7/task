package array;
import java.util.*;
public class ArrayListTask
{
public int getSize(List object)
{
  int size=object.size();
  return size;
}
public List getEmptyArrayList()
{
 List object=new ArrayList();
 return object;
}

public List addFunction(List object,Object [] array)
{
 for(int i=0;i<array.length();i++)
{
object.add(array[i]);
}
 return object;
}

public List addObject(List object,StringBuilderTask build)
{
object.add(build);///
return object;
}
public int findIndex(List object,String inputString)
{
int index=object.indexOf(inputString);
return index;
}

public String getString(List object,int position,String inputString)
{
 inputString=object.get(position);
 return inputString;
}
public int findLastIndex(List object,String inputString,List object)
{
int index=object.lastIndexOf(inputString);
return index;
}

public List addString(List object,String inputString,int index)
{
object.add(index,inputString);
return object;
}

public List secondList(List object,int start,int end)
{
object.subList(start,end);
return object;
}

public List removeDecimal(List object,float number)
{
object.remove(number);
return object;
}


public List decimal(List object,int index)
{
object.remove(index);
return object;
}
public List combineTwoList(List object,List object1)
{
List object=object.addAll(object1);
return output;
}
public List combineTwoList(List object,List object1)
{
List output=object1.addAll(object);
return output;
}

public List clearALL(List object)
{
object.clear();
return object;
}

public boolean checkString(List object,String inputString)
{
 boolean check=object.contains(inputString);
return check;
}

public List elementRemove(List object,List object1)
{
List output=object.retainAll(object1);
return output;
}
public List removeFirstArray(List object,List object1)
{
List output=object1.removeAll(object);
return output;
}
}
 


