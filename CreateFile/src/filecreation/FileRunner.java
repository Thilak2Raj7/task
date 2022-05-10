package filecreation;
import java.io.*;
import enumerationclass.RainbowColor;
import java.lang.reflect.*;
import utilityclass.Utility;
import constructor.CreateConstructor;
import filelogic.FileFunction;
import java.util.Properties;
import java.util.Scanner;
import constructor.CreateConstructor;
import exception.CustomException;
import pojoclass.Pojo;
import singletonclass.Singleton;
public class FileRunner{

	Properties property;
	FileFunction object=new FileFunction();
	Scanner scan=new Scanner(System.in);
	private String fileName="";
	private String path="";
	
	
public void fileCreate()
{
	try {
		
	System.out.println("Enter the Filepath");
	path=scan.nextLine();
    System.out.println("Enter the Filename");
	fileName=scan.nextLine();
	
	System.out.println("Enter the number");	
	int input=scan.nextInt();
	scan.nextLine();
	String sentence="";
	String content[]=new String[input];
	System.out.println("Enter the content");
	for(int i=0;i< input;i++)
	{
      sentence=scan.nextLine();
	Utility.checkString(sentence);
	content[i]=sentence ;
		}
	
	object.createPath(path);
	 File myFile=object.createFile(path,fileName);
	object.writeFile( myFile,sentence);
}
	catch (CustomException e)
	{
		System.out.println(e.getMessage());
	}
	catch (Exception e)
	{
		System.out.println("Exception occured");
		 e.printStackTrace();
	}
}
public int getOrdinal(RainbowColor c1)
{
	int integer=c1.ordinal();
	return integer+1;
}
public void createProperties()
{
 try {
	 
	  Properties property=object.createProperties();
	  scan.nextLine();
	  System.out.println("Enter the Filepath");
	  path=scan.nextLine();
	   System.out.println("Enter the size");
		int size=scan.nextInt();
		scan.nextLine();
		String input="";
		String  array[]=new String[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the key");
			String  key=scan.nextLine();
			
			System.out.println("Enter the value");
		 String value=scan.nextLine();
		
			property= object.storeValue( property,path,key, value);
		}
	
	}
	 
 catch (Exception e) 
 {
   System.out.println("key and value can't be null");
	 e.printStackTrace();
}
}
public void valuesBackToProperties()
{
	try
	{
		property=object.createProperties(); 
		System.out.println("Enter the Filepath");
		
		path=scan.nextLine();
		 property=object.readFile(path,property);
		System.out.println(property);
		 
		 }
	catch (Exception e)
	{
		System.out.println("path not found");
		 //e.printStackTrace();
	}
	}
	public static void main(String[] args) 
	
	
	{
	FileRunner run=new FileRunner();
	int number=0;	
	 String key;
	 String path="";
	String filePath = "";
	String value;
	String fileName="";
	File myFile;
	FileFunction object=new FileFunction();
	Properties property=null;
     String name="";
	Scanner scan=new Scanner(System.in);
try {
	System.out.println("Enter the number");
	 number=scan.nextInt();
	 scan.nextLine();
	if(number<0 ||number>10)
	{
		System.out.println("Number is invalid");	
	}
}
	
	catch (Exception e)
	{
		System.out.println(e.getMessage());
		 e.printStackTrace();
	}
switch (number)	
{
case 1:
 run.fileCreate();
	break;
case 2:
run.createProperties();
	break;
case 3:
run.valuesBackToProperties();
break;	
case 4:
run.fileCreate();
run.createProperties();
run.valuesBackToProperties();
break;
case 5:
	CreateConstructor obj=new CreateConstructor("name");
	//CreateConstructor obj=new CreateConstructor();

System.out.println(obj);
break;
case 6:
int id;	
Pojo pojo=new Pojo(name="name",id=5);
System.out.println(pojo);
;
case 7:
	Pojo pojoobject=new Pojo();
	pojoobject.setName("master");
	pojoobject.setId(7);
	System.out.println(pojoobject.getName());
    System.out.println(pojoobject.getId());
 break;
case 8:
	try 
	{
		
	Class ref=Class.forName("pojoclass.Pojo");

/*  Constructor c1=ref.getConstructor(String.class,int.class);
  System.out.println(c1);
  
  Constructor c2=ref.getConstructor();
  System.out.println(c2);
  Method methodName=ref.getDeclaredMethod("toString");
  Object j=methodName.invoke(ref);
  System.out.println(j);
  */
/*Constructor[] construct=ref.getDeclaredConstructors();
	for(Constructor c:construct)
{
		System.out.println(c);
	}
	Method[] method = ref.getDeclaredMethods();
    for(Method m: method)
  {
		System.out.println(m);
		
	}*/
    System.out.println("Enter the name");//make private constructor
    String name1=scan.nextLine();
    System.out.println("Enter the id");
    int id1=scan.nextInt();
    Object con=ref.getDeclaredConstructor(String.class,int.class).newInstance(name1,id1);
    Object con1=ref.getDeclaredConstructor().newInstance();
    
Method methodName=ref.getDeclaredMethod("setName",String.class);
methodName.invoke(con1,name1);
Method methods=ref.getDeclaredMethod("getName");
System.out.println(methods.invoke(con1));
}
	
catch(Exception e)
	{
	System.out.println("Exception occured");
	 e.printStackTrace();
	}

case 9:
	RainbowColor[] ran=RainbowColor.values();
	for(RainbowColor c1:ran)
	{
	System.out.println( c1);	
System.out.println(run.getOrdinal(c1));
	}
case 10:
Singleton ton= Singleton.method();
System.out.println(ton);
  
	
	
}
}
}





