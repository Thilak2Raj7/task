package carshowroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Scanner;

public class Runner {
	//Map<String ,List<Car>> mapObj=new HashMap<String,List<Car>>();
	Map<String,List<Branch>> branchObj=new HashMap<String,List<Branch>>();
	Map<Branch,List<Car>> obj=new HashMap<Branch,List<Car>> ();
	Storage store=new Storage();
	int carId=0;
	int k1=1;
Scanner scan=new Scanner(System.in);
	public void  showroomConstructor()
	{
		scan.nextLine();
	System.out.println("Enter the number of cities");
	int city=scan.nextInt();
	scan.nextLine();
	for(int i=0;i<city;i++)
	{
		scan.nextLine();
		k1=1;
		System.out.println("Enter the city name");
		String cityName=scan.nextLine();
		System.out.println("Enter the number of branch");
		int branch=scan.nextInt();
		scan.nextLine();
	    
		for(int j=0;j<branch;j++)
		{
			scan.nextLine();
			k1=1;
			System.out.println("Enter the branch name");
			String branchName=scan.nextLine();
			
			while(k1<= 2)
			{
			scan.nextLine();
			System.out.println("Enter the car name ");
			
			String carType=scan.nextLine();
		  
			System.out.println("Enter the number  of the car");
			int numberOfCar=scan.nextInt();
			 List<Car> carObj=mapObj.get(carType);
			  if(carObj==null)
			  {
				  carObj=new ArrayList<>();
			  }
			for(int k=0;k<numberOfCar;k++)
			{
				Car obj=carSetter(carType, branchName, cityName);
				carObj.add(obj);
				
			}
			mapObj.put(carType, carObj);
		    k1++;
			}
		}
		
	}
		
		store.storeDetails(mapObj);
		
	//System.out.println(mapObj);	
	}
	
	public Car carSetter(String carType,String branchName,String cityName)
	{
		Car obj=new Car();
		obj.setCarName(carType);
		obj.setBranch(branchName);
		obj.setCity(cityName);
		obj.setCarNumber(++carId);
		
		return obj;
	}
	
public void bookCar()
{
System.out.println("Enter the city ");
String city=scan.nextLine();
System.out.println("Enter the branch");
String branch=scan.nextLine();
System.out.println("Enter the car");
String car=scan.nextLine();
store.bookCar(city,branch,car);	
	
	
}
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	int number=0;
 Runner run=new Runner();
 try {
 System.out.println("Enter the operation to perform");
  number=scan.nextInt();
 }
 catch(Exception e)
 {
	System.out.println(e.getMessage()); 
 }
 
 
 switch(number)
 {
 case 1:
 run.showroomConstructor();
 break;
 
 case 2:
	
	 run.bookCar(); 
	 break;
 
 }	
}
}