

import java.io.*;
import exception.CustomException;
import java.util.Properties;
import utilityclass.Utility;
public class FileFunction {
	
 public void nullCheck(File myFile)throws CustomException//nullcheck in utility class
 {
	 if(myFile==null)
	 {
		throw new CustomException("File should not be null") ;
	 }
 }
public  File createPath(String path)throws CustomException
{
	Utility.checkString(path);	
 File myPath=new File(path);
 myPath.mkdir();
 if(!myPath.mkdir())
 {
	throw new CustomException("directory existed already") ;
 }
return myPath;
}

public File createFile(String path,String fileName)throws CustomException
{
	Utility.checkString(fileName);
try
{	
	File myFile =new File(path+fileName);

if (myFile.createNewFile()) {
	System.out.println("File created");
}
else 
{
System.out.println("File already existed");
}
return myFile;
}
catch (Exception e)
{
	
   throw new CustomException(e); 
 }
}
public void writeFile(File myFile,String sentence)throws CustomException
{
	
	
	try(FileWriter myWriter=new FileWriter(myFile)){
    myWriter.write(sentence);
    
	myWriter.close();
	
     }
    catch (Exception e)
	{
     throw new CustomException(e); 
	}
	
}

public Properties storeValue(Properties property,String filePath,String key,String value)throws CustomException
{
	Utility.checkString(key);
	Utility.checkString(value);
   try (FileOutputStream output=new FileOutputStream(filePath))
    {  
	   
		
		
   property.setProperty(key,value);
    property.store(output,"properties of a file");
   }
   catch(Exception e)
   {
    	   throw new CustomException(e);
   }
    return property;
}
    
	public Properties createProperties()throws CustomException
	{
		try {

	Properties property=new Properties();	
	 return property;
	}
	catch (Exception e)
   	{

    	   throw new CustomException(e);
     
   	}
	}
	public  Properties readFile(String path,Properties property)throws CustomException
	{
		try(FileInputStream inputStream=new FileInputStream(path))
		{
	    property.load(inputStream);
	     }
		catch (Exception e)
	   	{

			   throw new CustomException(e); 
	       
	   	}
		 return property;
	}
}
