package inheritanceclass;

import exception.CustomException;
import utilityclass.Utility;

public class SCross extends Car{
	
	int seats;
	int airbags;
	String model;
	String color;
	
	
public int getSeat()
	{
		return seats;
	}
	
	public int getAirbags()
	{
		return airbags;
	}
public String getModel()
{
	return model;
}

public String getColor()
{
	return color;
}
public void setSeat(int seats)
{

	this.seats=seats;
}
public void setAirbags(int airbags)
{
	this.airbags=airbags;
}
public void setModel(String model)throws CustomException
{
try

{
	Utility.checkString(model);
	this.model=model;
}
	catch(CustomException e)
	{
		throw new CustomException(e);
	}
}
public void setColor(String color)throws CustomException
{
try
{
	Utility.checkString(color);
	this.color=color;
}
	catch(CustomException e)
	{
		throw new CustomException(e);
	}
}

public void maintainance()
{
System.out.println("SCross Car under maintaineance");	 
}
}



