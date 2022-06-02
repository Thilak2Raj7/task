package hashmaplogic;
import java.util.*;
import excep.CustomException;
public class HashMapTask{
public void nullCheck(Map<Object,Object>object)throws CustomException{
if(object==null)
{
throw new CustomException("Map keys more than one should not be null");
}
}
public Map<Object,Object> createHashMap()throws CustomException
{
Map<Object,Object> object=new HashMap();
return object;
 }
 public  Map<Object,Object> putKeysValues(Map<Object,Object>object,Object key,Object value)throws CustomException
 {
 nullCheck(object);
  object.put(key,value);
  return object;
  }
 public Map<Object,Object> copyAllToAnotherMap(Map<Object,Object>object,Map newObject)throws CustomException
 {
  nullCheck(newObject);
  object.putAll(newObject);//18
  return object;
 }
public int getSize(Map<Object,Object>object)throws CustomException{
nullCheck(object);
int size =object.size();
return size;
}
 public boolean checkKeyPresent(Map<Object,Object>object,Object key)throws CustomException
 {
 nullCheck(object);//8
 return object.containsKey(key);
 }
 public boolean checkValuePresent(Map<Object,Object>object,Object value)throws CustomException
 {
 nullCheck(object);//9
 return object.containsValue(value);
 }
public  Object getValue(Map<Object,Object>object,Object key)throws CustomException
{
nullCheck(object);
key=object.get(key);//11
return key;
}
public Map<Object,Object> removeKey(Map<Object,Object>object,Object key)throws CustomException
{
nullCheck(object);
object.remove(key);//14
return object;
}
public Map<Object,Object>  removeKeyAndValue(Map<Object,Object>object,Object key,Object value)throws CustomException
{
nullCheck(object);
object.remove(key,value);//15
return object;
}
public Map<Object,Object>  replaceKey(Map<Object,Object>object,Object key,Object newValue)throws CustomException
{
nullCheck(object);
object.replace(key,newValue);//16
return object;
}
public boolean replaceKeyAndValue(Map<Object,Object>object,Object key,Object value,Object newValue)throws CustomException
{
nullCheck(object);//16
return object.replace(key,value,newValue);
}
 public Object getReturnValue(Map<Object,Object>object,Object key,Object newValue)throws CustomException
{
nullCheck(object);
newValue= object.getOrDefault(key,newValue);//13
return newValue;
}
public Map<Object,Object> clearAll(Map<Object,Object>object)throws CustomException
{
nullCheck(object);//20
object.clear();
return object;
}
public void iterate(Map<Object,Object>object) throws CustomException
{
nullCheck(object);
Set entrySet=object.entrySet();
Iterator iterate=entrySet.iterator();
while(iterate.hasNext())
{
Map.Entry map=(Map.Entry)iterate.next();
System.out.println("Key = "+map.getKey()+"value ="+map.getValue());
}
}
}


