package constructor;

import exception.CustomException;
import utilityclass.Utility;

public class CreateConstructor {
	String name;
	
	public CreateConstructor()
	{
		
	}
	public CreateConstructor(String name)throws CustomException
	{
try
	{
	Utility.checkString(name);
	  this.name=name;
	}
catch(CustomException e)
{
throw new CustomException(e);	
}
}
 public String toString()
 {
	 return name;
 }
}