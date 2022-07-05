
package utilityclass;
import java.io.*;
import exception.CustomException;
public class Utility 
{
	
public  static void checkString(String inputString) throws CustomException
	{
		if (inputString == "null" || inputString.isEmpty())
		{
		throw new CustomException("String should not be null or empty");
	}
	}
public static void checkObject(Object inputObject)throws CustomException
	{
		if (inputObject =="null" )
		{
			throw new CustomException("Object should not be null");	
	    }
}
 public static void checkArray(String array[])throws CustomException
  {
	  for (String input:array)
	  {
	 checkString( input); 
	  }
  }
}
