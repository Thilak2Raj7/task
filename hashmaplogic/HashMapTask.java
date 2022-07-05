package hashmaplogic;
import java.util.*;
public class HashMapTask{
///public void nullCheck(Map<Object,Object>object){
//if(object==null)
//{
//throw new Exception("Map keys more than one should not be null");
//}
//}
public Map<Object,Object> createHashMap()throws Exception
{
Map<Object,Object> object=new HashMap();
return object;
 }
 public  Map<Object,Object> putKeysValues(Map<Object,Object>object,Object key,Object value)throws Exception
 {
  object.put(key,value);
  return object;
  }
 public Map<Object,Object> copyAllToAnotherMap(Map<Object,Object>object,Map newObject)throws Exception
 {
  //nullCheck(object);
  newObject.putAll(object);//18
  return object;
 }
public int getSize(Map<Object,Object>object)throws Exception{
int size =object.size();
return size;
}
 public boolean checkKeyPresent(Map<Object,Object>object,Object key)throws Exception
 {
 //nullCheck(object);//8
 return object.containsKey(key);
 }
 public boolean checkValuePresent(Map<Object,Object>object,Object value)throws Exception
 {
 //nullCheck(object);//9
 return object.containsValue(value);
 }
 /*public Map<Object,Object> changeValues(Map<Object,Object>object,Object key,Object value,int number)throws Exception
 {
 nullCheck(object);//10
 object=object.replaceAll((key,value) key*key);;
return object;*/
//}
public  Map<Object,Object>  getValue(Map<Object,Object>object,Object key)throws Exception
{
//nullCheck(object);
object.get(key);//11
return object;
}
//public Map<Object,Object> nonExistingKey(Map<Object,Object>object,Object newKeyString,Object newString)
//{
//object.putIfAbsent(newKeyString,newString);
//return object;
//}
public Map<Object,Object>  removeKey(Map<Object,Object>object,Object key)throws Exception
{
//nullCheck(object);
object.remove(key);//14
return object;
}
public Map<Object,Object>  removeKeyAndValue(Map<Object,Object>object,Object key,Object value)throws Exception
{
//nullCheck(object);
object.remove(key,value);//15
return object;
}
public Map<Object,Object>  replaceKey(Map<Object,Object>object,Object key,Object replaceString)throws Exception 
{
//nullCheck(object);
object.replace(key,replaceString);//16
return object;
}
 public Map<Object,Object>  replaceKey(Map<Object,Object>object,Object key,Object value,Object replaceString)throws Exception
{
//nullCheck(object);
object.replace(key,value,replaceString);//17
return object;
}
public Map<Object,Object> clearAll(Map<Object,Object>object)throws Exception
{
//nullCheck(object);//20
object.clear();
return object;
}
public void iterate(Map<Object,Object>object) throws Exception
{
//nullCheck(object);
Set entrySet=object.entrySet();
Iterator iterate=entrySet.iterator();
while(iterate.hasNext())
{
Map.Entry map=(Map.Entry)iterate.next();
System.out.println("Key = "+map.getKey()+"value ="+map.getValue());

//for(Object dummmy:object.keySet())
//{
//Object value=getValue(object,dummy);
//System.out.println("Key=" +dummy+ "Value=" +value);
//}
}
}
}
