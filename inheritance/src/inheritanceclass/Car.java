package inheritanceclass;
import exception.CustomException;
import utilityclass.Utility;
public class Car {
int yearOfMake;
String engineNumber;
String type;
String carName;
public int getYearOfMake()
{
	return yearOfMake;
}
public Car()
{
System.out.println("Called");
}

	public Car(String carName)throws CustomException
{
	Utility.checkString(carName);
	System.out.println(carName);
}


public String getEngineNumber()
{
	
	return  engineNumber;
}
public void  setEngineNumber(String engineNumber)throws CustomException
{
	try
	{
		
	Utility.checkString(engineNumber);
	this.engineNumber=engineNumber;
	
   }
	catch(CustomException e)
	{
		throw new CustomException(e);
	}
	}
public String getType()
{
	return  type;
}
public void  setType(String type)throws CustomException
{
	try
	{
	Utility.checkString(type);
	this.type=type;
    }

	catch(CustomException e)
	{
		throw new CustomException(e);
	}
	}
	
 public void  setYearOfMake(int yearOfMake)
 {
	this.yearOfMake=yearOfMake; 
 }
 public void maintainance()
{
System.out.println("Car under maintaineance");	 
}
}
 