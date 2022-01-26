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
	String name="";
	int id ;
public void fileCreate()
{
try 
{
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
	System.out.println(e);
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
 try 
 {
	 
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
catch (CustomException e)
{
System.out.println(e.getMessage());
}
catch (Exception e)
{
System.out.println("Exception occured");
		 //e.printStackTrace();
}
}

public void pojoClass()
{
try
{
System.out.println("Enter the name");
name=scan.nextLine();
System.out.println("Enter your id");
id =scan.nextInt();
Pojo pojo=new Pojo(name,id);

System.out.println(pojo);
}
catch (CustomException e)
{
System.out.println(e.getMessage());
}
catch (Exception e)
{
		System.out.println("Exception occured");
		 //e.printStackTrace();
}
}

public void constructor()
{
try
{
System.out.println("Enter the name");
name=scan.nextLine();
CreateConstructor obj=new CreateConstructor(name);
Utility.checkObject(obj);
System.out.println(obj);
}
catch (CustomException e)
{
System.out.println(e.getMessage());
}
catch (Exception e)
{
System.out.println("Exception occured");
			 //e.printStackTrace();
}
}
public void classPojo()
{
try
{
Pojo pojoobject=new Pojo();
//Utility.checkObject(pojoobject);
System.out.println("Enter the name");
name=scan.nextLine();
pojoobject.setName(name);
System.out.println("Enter your id");
id =scan.nextInt();
pojoobject.setId(id);
System.out.println(pojoobject.getName());
System.out.println(pojoobject.getId());	
}
catch (CustomException e)
{
System.out.println(e.getMessage());
}
catch (Exception e)
{
System.out.println("Exception occured");
			 //e.printStackTrace();
}
}
public void reflectionClass()
{
try
{
Class ref=Class.forName("pojoclass.Pojo");
System.out.println("Enter the name");//make private constructor
String name1=scan.nextLine();
	    
System.out.println("Enter the id");//make constructor private
int id1=scan.nextInt();
Object con=ref.getDeclaredConstructor(String.class,int.class).newInstance(name1,id1);

	    //((Constructor) con).setAccessible(true);
Object con1=ref.getDeclaredConstructor().newInstance();
	    //((Constructor) con1).setAccessible(true);
Method methodName=ref.getDeclaredMethod("setName",String.class);
methodName.invoke(con1,name1);
Method methods=ref.getDeclaredMethod("getName");
System.out.println(methods.invoke(con1));	
}
catch (Exception e)
{
System.out.println("Exception occured");
			 //e.printStackTrace();
}
}
public void enumerationClass()
{
try
{
RainbowColor[] ran=RainbowColor.values();
	//Utility.checkArray(ran);
for(RainbowColor c1:ran)
{
System.out.println( c1);	
System.out.println(getOrdinal(c1));
}
}
catch (Exception e)
{
System.out.println("Exception occured");
 //e.printStackTrace();
}
}
public void SingletonClass()
{
try
{
Singleton ton= Singleton.Instance;
	//Utility.checkObject(ton);
System.out.println(ton);
ton.show();
}
catch (Exception e)
{
System.out.println("Exception occured");
//e.printStackTrace();
}
}

public static void main(String[] args) 
{
	FileRunner run=new FileRunner();
	int number=0;	
	int id=0;
	String name="";
	 String key;
	 String path="";
	String filePath = "";
	String value;
	String fileName="";
	File myFile;
	FileFunction object=new FileFunction();
	Properties property;
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
System.out.println("Enter a valid number");
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
run.constructor();
break;

case 6:

run.pojoClass();
break;

case 7:

run.classPojo();
break;

case 8:
run.reflectionClass();
break;

case 9:
run.enumerationClass();
break;

case 10:
run.SingletonClass();	
break;

default:
System.out.println("Invalid input");
break;
}

}
}





