package BookingCenter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Runner {
	ApiLayer obj=new ApiLayer();
	Scanner scan=new Scanner(System.in);
	//List<Passenger> passengerDetails=new ArrayList<Passenger>(); 
	public void createFolder() throws IOException
	{

		System.out.println("Enter the folder name");
		String folder=scan.nextLine();
		obj.createFolder(folder);
		
	}
	public void writeFile() throws IOException
	{
		System.out.println("Enter the file name");
		String fileName=scan.nextLine();
		System.out.println("Enter the flight details");
		String flightDetails=scan.nextLine();
		obj.writeFile(fileName,flightDetails);
	}
	
	public void writeSeatArrangement()throws IOException
	{
		System.out.println("Enter the file name");
	    String fileName=scan.nextLine();
	    System.out.println("Enter the class");
	    String classType=scan.nextLine();
	    System.out.println("Enter the number of rows");
	    int rows=scan.nextInt();
	    System.out.println("Enter the number of columns in a row");
	    int column=scan.nextInt();
	    int[] array=new int[column];
	    System.out.println("Enter the elements in an array");
	    for(int i=0;i<column;i++)
	    {
	    array[i]=scan.nextInt();
	    }
	    System.out.println(Arrays.toString(array));
	    obj.seatArrangement(fileName, array, classType, rows);
		
		
	}
	public void readFile() throws FileNotFoundException, IOException
    {
		System.out.println("Enter the file name");
	    String fileName=scan.nextLine();	
		obj.readFile(fileName);
	}
	
	
	public void arrangeSeats()
	{
		System.out.println("Enter the flight name");
		String flightName=scan.nextLine();
	int sum=0;
	int sum1=0;
    char[]array=obj.businessClass();
    char[] array1=obj.economyClass();
    int businessRow=obj.businessRow();
    int economyRow=obj.economyRow();
    
    for(int i=0;i<array.length;i++)
    {
    	sum+=(int)array[i];
    }
    for(int j=0;j<array1.length;j++)
    {
    	sum1+=(int)array1[j];
    }
    
   //int name=65;
	   obj.seatAllotment(businessRow,"Business",array);
	   System.out.println("Business class is completed");
	   obj.seatAllotment(economyRow,"Economy",array1);
	   System.out.println("Economy class is completed");
	
	/*else
	{
		 obj.seatAllotment(businessRow,"Business",array1);
		obj.seatAllotment(economyRow,"Economy",array);
	}*/
	}
	
	public void listDownFlights() throws FileNotFoundException, IOException
	{
	System.out.println("Enter the file name");
	String fileName=scan.nextLine();
	obj.readFlights(fileName);
		 
	}
	public void searchFlights() throws Exception
	{
		int search=0;
		
		
		try {
			System.out.println(" Filter Flights  by  pressing  1 for locations wise flights or press 2  for business class flights ");
			  search=scan.nextInt();	
			scan.nextLine();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		switch(search)
		{
		case 1:
			
			System.out.println("Enter the departure " );
		     String departure=scan.nextLine();
		    
		     System.out.println("Enter the destination");
		     String destination=scan.nextLine();
		     String place=departure+"-"+destination;
		    // System.out.println(place);
		     obj.searchFlightsUsingPlace(place);
		     System.out.println("Press 7 to book Ticket");
		     break;
		case 2:
		
			obj.filterClass();
			System.out.println("Press 7 to book Ticket");
		     break;
	    
			
		}
		
		
	
	}
	public void bookTicket() throws Exception
	{
		System.out.println("Enter the number of tickets");
		int numberOfTickets=scan.nextInt();
		String[] array=new String[numberOfTickets];
		List<Passenger> passengerList=new ArrayList<Passenger>();
		for(int i=0;i<numberOfTickets;i++)
		{
			scan.nextLine();
	    Passenger passObj=new Passenger();
		System.out.println("Enter the name of passenger");
		String name=scan.nextLine();
		System.out.println("Enter the address");
		String address=scan.nextLine();
		System.out.println("Enter the age");
		int age=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the seat Number");
		String seatNumber=scan.nextLine();
		array[i]=seatNumber;
		passObj.setAddress(address);
		passObj.setPassengerName(name);
		passObj.setAge(age);
		passengerList.add(passObj);
		}
		System.out.println("Enter the meal preference");
		boolean value=scan.nextBoolean();
		obj.bookFlight(value,array,passengerList);
		
	}
	public void cancelTicket()
	{
		//System.out.println("Enter the number of tickets you want to cancel");
		System.out.println("Enter the booking id");
		int bookingId=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the seat name");
		String seatName=scan.nextLine();
		obj.cancelTicket(bookingId,seatName);
		
	}
	public void mealsOrdered()
	{
		obj.mealsOrdered();
		
	}
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
		ApiLayer api=new ApiLayer();
		Runner run=new Runner();
		int operation=0;
		boolean value=true;
		
		System.out.println("1.Create folder to store flightDetails\n"+
				   "2.Write the details in the file\n"+
				   "3.Write seat Arrangement in the file\n"+
				   "4.Read the data in the file\n"+
				    
		           "5.List down the flights \n"+
				   "6.Search flights using locations and business class flights\n"+
				    "7. To book tickets\n"+
				   "8.To cancel Ticket\n"+
		            "9.To show Meals ordered seats\n"+
			         "10.Print ticket details\n"+
		             "11.Check availble seats (Select flight by choosing 5 and 6 opertion and check seat Availablity");
		while(value)
		{
		try {
			System.out.println("Enter the operation to perform");
			operation=scan.nextInt();
		    scan.nextLine();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	
	switch(operation)
	{
	case 1:
		try {
	  run.createFolder();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	  break;
	case 2:
		try {
			run.writeFile();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		break;
	case 3:
		try {
			
			run.writeSeatArrangement();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	case 4:
		try {
			run.readFile();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		break;

	case 5:
		try {
		run.listDownFlights();
			}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		break;
	case 6:
		try {
		run.searchFlights();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		break;
	case 7:
		try {
		run.bookTicket();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		break;
	case 8:
		try {
		run.cancelTicket();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		break;
	case 9:
		try {
			api.mealsOrdered();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		break;
	case 10:
		try {
		System.out.println("Enter the booking id");
		int bookingId=scan.nextInt();
		api.printTicket(bookingId);	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		break;
	case 11:
		try {
			api.checkAvailableSeats();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		break;
	default:
		value=false;
		System.out.println("Enter the valid number");
	}
	}
		
		
	}
}
