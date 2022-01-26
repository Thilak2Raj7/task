package inheritancerunner;
import inheritanceclass.Swift;
import inheritanceclass.XUV;
import inheritanceclass.SCross;
import inheritanceclass.Car;
import inheritanceclass.Duck;
import java.io.*;
import exception.CustomException;
import utilityclass.Utility;
import java.util.Scanner;
public class InheritanceRunner {
	Swift swiftObj=new Swift();
	SCross scrossObj=new SCross();
	XUV xuvObj=new XUV();
	Car carObj=new Car();
	String color="";
	String model="";
	String engineNumber="";
	String type="";
	int yearOfMake;
	int airbags;
	int seats;
	String carName="";
	Scanner scan=new Scanner(System.in);
	
public void methodSwift()
{
try
{
System.out.println("The color is ");
color=scan.nextLine();
swiftObj.setColor(color);
System.out.println("The number of airbags are ");
airbags=scan.nextInt();
swiftObj.setAirbags(airbags);
scan.nextLine();
System.out.println("The model of the car is");
model=scan.nextLine();
swiftObj.setModel(model);
System.out.println("The number of seats are");
seats=scan.nextInt();
swiftObj.setSeat(seats);
System.out.println("The required output of the car");
System.out.println(swiftObj.getColor());
System.out.println(swiftObj.getAirbags());
System.out.println(swiftObj.getModel());
System.out.println(swiftObj.getSeat());
}
catch (CustomException e)
{
System.out.println(e.getMessage());
}
catch (Exception e)
{
System.out.println(e);
}
}

public void methodXUV()
{
try
{
System.out.println("The color is ");
color=scan.nextLine();
xuvObj.setColor(color);
	
System.out.println("The number of airbags are ");
airbags=scan.nextInt();
xuvObj.setAirbags(airbags);
		
System.out.println("The model of the car is");
model=scan.nextLine();
xuvObj.setModel(model);
		
System.out.println("The number of seats are");
seats=scan.nextInt();
xuvObj.setSeat(seats);
System.out.println("The required output of the car");
System.out.println(xuvObj.getSeat());
System.out.println(xuvObj.getColor());
System.out.println(xuvObj.getAirbags());
System.out.println(xuvObj.getModel());
	}
catch (CustomException e)
{
System.out.println(e.getMessage());
}
catch (Exception e)
{
System.out.println(e);
}
}

public void methodSuperClass()
	{
try
{
System.out.println("Enter the engine number");
engineNumber=scan.nextLine();
scrossObj.setEngineNumber(engineNumber);
		
System.out.println("The type of car is");
type=scan.nextLine();
scrossObj. setType(type);
		
System.out.println("The manufacturing year of the car");
yearOfMake=scan.nextInt();
scrossObj.setYearOfMake(yearOfMake);
		
System.out.println("The required output of the car");
System.out.println(scrossObj.getEngineNumber());
System.out.println(scrossObj.getType());
System.out.println(scrossObj.getYearOfMake());
}
catch (CustomException e)
{
System.out.println(e.getMessage());
}

catch (Exception e)
{
System.out.println(e);
}
}

public void methodSCross()
{
try
{
System.out.println("The color is ");
color=scan.nextLine();
scrossObj.setColor("color");
System.out.println("The number of airbags are ");
airbags=scan.nextInt();
scrossObj.setAirbags(airbags);
		
scan.nextLine();
System.out.println("The model of the car is");
 model=scan.nextLine();
scrossObj.setModel(model);
		
System.out.println("The number of seats are");
seats=scan.nextInt();
scrossObj.setSeat(seats);
		
System.out.println("The required output of the car");
System.out.println(scrossObj.getSeat());	
System.out.println(scrossObj.getColor());
System.out.println(scrossObj.getAirbags());
System.out.println(scrossObj.getModel());
}
catch (CustomException e)
{
System.out.println(e.getMessage());
}

catch (Exception e)
{
System.out.println(e);
}
}

public  void invokeCar(Car carObj)
{

System.out.println("Got input");
		
if (carObj instanceof Swift)
{
System.out.println("Hatch");	
}
	   
else if(carObj instanceof XUV)
{
System.out.println("SUV");
}
	
else if(carObj instanceof SCross)
{
System.out.println("Sedan");	
}
else 
{
System.out.println("Valid Input");
}
}

public void invokeSwift(Swift swiftObj)
{
System.out.println("you got the answer");
}
	
public void maintainance()
{
	scrossObj.maintainance();//scross object
	carObj.maintainance();//car object
	swiftObj.maintainance();//swiftobject
	Car scross=new SCross();
	scross.maintainance();
}

public void parrotClass()
{
	ParrotMod bird =new ParrotMod();
	bird.fly();
	bird.speak();
}

public void duckClass()
{
	Duck duckobj=new Duck();
	 duckobj.fly();
	 duckobj.speak();
}


public void xuvInstance()
{
try
{
XUV object=new XUV();
System.out.println("Enter the carname");
carName=scan.nextLine();
XUV obj=new XUV(carName);	
}

catch (CustomException e)
{
System.out.println(e.getMessage());
}

catch (Exception e)
{
System.out.println(e);
}
} 

public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=0;
		//Swift object=new Swift();
		//SCross newObject=new SCross();
		Swift swiftObj=new Swift();
		SCross scrossObj=new SCross();
		XUV xuvObj=new XUV();
		Car carObj=new Car();
		String color="";
		String model="";
		int seats=0;
		int airbags=0;
		String engineNumber="";
		int yearOfMake=0;
		String type="";
		String carName="";
		//BirdAbstract bird=new BirdAbstract();
	  InheritanceRunner run=new InheritanceRunner();
try 
{
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
run.methodSwift();
break;

case 2:
run.methodXUV();
run.methodSuperClass();
break;

case 3://4th and 5th task

run.invokeCar(swiftObj);
run.invokeCar(xuvObj);
run.invokeCar(scrossObj);
break;

case 4://6th task
run.invokeSwift(swiftObj);
//Car object=new Swift();
//run.invokeSwift(object);
//run.invokeSwift(xuvObj);
//run.invokeSwift(SCrossObj);
break;

case 5://7th task
run.maintainance();
break;

case 6://9th task
run.xuvInstance();
break;
	
case 7://10th task
run.parrotClass();
break;

case 8://8th task
run.duckClass();
break;

default :
System.out.println("Invalid input");
break;
}
}
}