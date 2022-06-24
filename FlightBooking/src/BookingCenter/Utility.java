package BookingCenter;

import java.io.*;
import BookingCenter.CustomException;
public class Utility {
	
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
 
  public static void nullCheck(File myFile)throws CustomException
  {
 	 if(myFile==null)
 	 {
 		throw new CustomException("File should not be null") ;
 	 }
 
}
}