package BookingCenter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import BookingCenter.Seat;

public class TicketBooking {
	List<String> flightInfo=new ArrayList<String>();
List<String> meals=new ArrayList<String>();
String flightName="";
int bookingId=0;
int amountCount=0;
//Map<String,List<Seat>> mapObj=new HashMap<String,List<Seat>>();
Map<Integer,Map<String ,Seat>> occupiedSeats=new HashMap<Integer,Map<String,Seat>>();
Map<Integer,Booking> booked=new HashMap<Integer,Booking>();
Map<String ,Map<String,Seat>> seatBooking=new HashMap<String,Map <String,Seat>>();
String storage="";	
char[] array=new char[3];
char[] array1=new char[3];
String bRow="";
String eRow="";
int count=0;
public void createFolder(String fileName) throws IOException
{
File myFile=new File(fileName);
if(myFile.mkdir())
{
	System.out.println("Folder created");
}
else
{
	System.out.println("Folder Already exists");
}
	
}

public void writeFile(String fileName,String flightDetails)throws IOException
{
try(BufferedWriter bw=new BufferedWriter(new FileWriter(fileName)))
{
bw.write(flightDetails);
bw.close();

}	
catch(IOException e)
{
System.out.println(e.getMessage());			
}
}

public void writeSeatArrangement(String fileName,int[] array,String text,int rows) throws IOException
{
	
	try(BufferedWriter bw=new BufferedWriter(new FileWriter(fileName,true)))
	{
		bw.write(text+":"+Arrays.toString(array)+"," +rows);
	    bw.close();	
	}
	catch(IOException e)
	{
	System.out.println(e.getMessage());			
	}	
}
///home/thilak-inc1491/Development/FlightBooking/Flight-A112-Chennai-Mumbai.txt
public void  readFile(String fileName) throws FileNotFoundException, IOException
{
	try(BufferedReader br=new BufferedReader(new FileReader(fileName)))
	{	
	int num;
	int count=0;
	int count1=0;
	
	boolean value=false;
	while((num=br.read())!=-1)
	{
		char character=(char)num;
		if(character=='\n')
		{
			value=true;
		}
		if(character >='1' && character<='9' && count<3)
		{
			array[count++]=character;
			
		}
		else if(character >='0' && character<='9'&& value==false)
		{
			bRow+=character;
		}
			
		else if(character >='0' && character<='9'&& value==true && count1<3)
		{
		 array1[count1++]=character;
	    }
		else if(character >='0' && character<='9')
		{
			eRow+=character;
		}
		
	}
	
	
	//home/thilak-inc1491/Development/FlightBooking/Flight-A112-Chennai-Mumbai.txt
	
	
	/*System.out.println(storage);
	int index=storage.indexOf('[');
	System.out.println(index);
	int index1=storage.indexOf(']');
	System.out.println(index1);
	int index3=storage.indexOf('E');
	String input=storage.substring(index+1,index1);
	String input1=storage.substring(index1+1,index3);
	input1=input1.replace(",", "");
	System.out.println("input1 -"+input1);
	input1=input1.trim();
System.out.println("input1"+input1.length());
	int rows=Integer.parseInt(input1);
	System.out.println("row-"+/home/thilak-inc1491/Development/FlightBooking/Flight-A112-Chennai-Mumbai.txtrows);
	System.out.println(input);
    //List<Integer> listObj=new ArrayList<Integer>();
    int count=0;
   
	for(int i=0;i<input.length();i++)
	{
		
		if(input.charAt(i)>='1' && input.charAt(i)<='9')
		{
			int value=Integer.parseInt(input.charAt(i)+"");
			System.out.println("get"+input.charAt(i));
	//		array[i]=Character.getNumericValue(input.charAt(i));
			array[count++]=value;
		}
		
	}*/
	System.out.println(Arrays.toString(array))	;
	System.out.println(Arrays.toString(array1))	;
	System.out.println(bRow);
	System.out.println(eRow);
}
}
public char[] classType1()
{
	return array;
}
public char[] classType2()
{
	return array1;
}
public String businessRow()
{
	return bRow;
}
public String economyRow()
{
	return eRow;
}

public void seatArrangement(int row,String classes,char[] array){
	
	int count1=65;
	int[] column=new int[array.length];
for(int i=0;i<array.length;i++)	
{
	column[i]=Integer.parseInt(String.valueOf(array[i]));
}	


for(int j=0;j<row;j++)
{
	count++;
	count1=65;
	Map<String,Seat> bookTicket=seatBooking.get(flightName);
	if(bookTicket==null)
	{
		bookTicket=new HashMap<String,Seat>();
		
	}
	for(int k=1;k<=column[0];k++)
	{
	   //System.out.println("column1");
		Seat seatObj=new Seat();
		if(k==1 )
		{
		
		seatObj.setClassType(classes);
		char seat=(char)count1;
		
		seatObj.setSeatType("Window");
		seatObj.setFlightName(flightName);
	    System.out.println(String.valueOf(count));
	    System.out.println(String.valueOf(seat));
		seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
		
		count1++;
		//listObj.add(seatObj);
		String seatName=seatObj.getSeatName();
		bookTicket.put(seatName, seatObj);	
		}
		
		else if(k==column[0])
		{
			seatObj.setClassType(classes);
			char seat=(char)count1;
			
			seatObj.setSeatType("Aisle");
			seatObj.setFlightName(flightName);
			seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
			count1++;
			//listObj.add(seatObj);
			String seatName=seatObj.getSeatName();
			bookTicket.put(seatName, seatObj);	
		}
		else
		{
			seatObj.setClassType(classes);
			char seat=(char)count1;
			seatObj.setSeatType("Middle");
			seatObj.setFlightName(flightName);
			seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
			count1++;
			//listObj.add(seatObj);
			String seatName=seatObj.getSeatName();
			bookTicket.put(seatName, seatObj);	
	}
	}
	
	for(int h=1;h<=column[1];h++)
	{
		   //System.out.println("column2");
		Seat seatObj=new Seat();
		if(h==1 || h==column[1])
		{
			seatObj.setClassType(classes);
			char seat=(char)count1;
			seatObj.setSeatType("Aisile");
			seatObj.setFlightName(flightName);
			seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
			count1++;
			//listObj.add(seatObj);
			String seatName=seatObj.getSeatName();
			bookTicket.put(seatName, seatObj);		
		}
		else
		{
			seatObj.setClassType(classes);
			char seat=(char)count1;
			seatObj.setSeatType("Middle");
			seatObj.setFlightName(flightName);
			seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
			count1++;
			//listObj.add(seatObj);
			String seatName=seatObj.getSeatName();
			bookTicket.put(seatName, seatObj);	
		}
			
	}
	for(int s=1;s<=column[2];s++)
	{

		  // System.out.println("column3");
		Seat seatObj=new Seat();
		if(s==1)
		{
			seatObj.setClassType(classes);
			char seat=(char)count1;
			seatObj.setSeatType("Aisile");
			seatObj.setFlightName(flightName);
			seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
			count1++;
			//listObj.add(seatObj);
			String seatName=seatObj.getSeatName();
			bookTicket.put(seatName, seatObj);	
		}
		else if(s==column[2])
		{
			seatObj.setClassType(classes);
			char seat=(char)count1;
			seatObj.setSeatType("Window");
			seatObj.setFlightName(flightName);
			seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
			count1++;
			//listObj.add(seatObj);
			String seatName=seatObj.getSeatName();
			bookTicket.put(seatName, seatObj);	
		}
		else
		{
			seatObj.setClassType(classes);
			char seat=(char)count1;
			seatObj.setSeatType("Middle");
			seatObj.setFlightName(flightName);
			seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
			count1++;
			//listObj.add(seatObj);
			String seatName=seatObj.getSeatName();
			bookTicket.put(seatName, seatObj);	
		}
		
		
	}
	
	System.out.println();
	seatBooking.put(flightName,bookTicket);
 }
	
	
//for(int t=0;t<listObj.size();t++)
//{
//System.out.println("listObj"+listObj.get(t));
//}
System.out.println(seatBooking);
Map<String ,Seat> mapObj=seatBooking.get(flightName);
System.out.println("size"+mapObj.size());

}
/*public String listDownFlights(String fileName) throws FileNotFoundException, IOException
{
	String store="";
	try(BufferedReader br=new BufferedReader(new FileReader(fileName)))
	{
		int msg;
		while((msg=br.read())!=-1)
		{
			System.out.print((char)msg);
			if(msg==10)
			store+=(char)msg;
		}
		br.close();
	}
	return store;
}*/

public void storeFlightDetails(String fileName) throws FileNotFoundException, IOException
{

	
	try(BufferedReader br=new BufferedReader(new FileReader(fileName)))
	{	
       int store;
       String flight="";
       while((store=br.read())!=-1)
       {
    	 flight+=(char) store;
    	 //System.out.println((char)store);
    	   if(store==10)
    	   {
    		   System.out.println(flight);
    		  flightInfo.add(flight) ;
    		  flight="";
    	   }
    	   
    	   
       }
		
		br.close();
	}
		
}	
public void filterFlightsUsingPlace(String place) throws FileNotFoundException, IOException		
{
	System.out.println(flightInfo);
	String flight="";
for(int i=0;i<flightInfo.size();i++)
{
	System.out.println("Enter the flight details");
			
	String details=flightInfo.get(i);
	System.out.println("Enter the flight details"+details);
	
    
	if(details.contains(place))
	{
	
		  for(int j=0;j<details.length();j++)
	      {
	    	  if((int)details.charAt(j)==10)
	    	  {
	    		 
	    		  flight=flight.trim();
	    		  flightName=flight;
	    		  flight+=".txt";
	    	  }
	    	  else
	    	  {
	    		  flight+=details.charAt(j);
	    		  
	    	  }
	      }
		  
		flight="/home/thilak-inc1491/Development/FlightBooking/"+flight;
		System.out.println("flight"+flightName);
		//flightName+="/home/thilak-inc1491/Development/FlightBooking/"+details;
		System.out.println(flightName);
	}
	else
	{
		System.out.println("Flight is not available");
	}
}
System.out.println();
//readFile("/home/thilak-inc1491/Development/FlightBooking/Flight-A112-Chennai-Mumbai.txt");
readFile(flight);
int row=Integer.parseInt(bRow);
seatArrangement(row,"Business",array);
availableSeats(flightName,"Business");
if(eRow.length()!=0)
{
int row1=Integer.parseInt(eRow);
seatArrangement(row1,"Economy",array);
}
availableSeats(flightName);
System.out.println(flightName);
}

public int getBookingId()
{
	return ++bookingId;
}
public int amountCalculation(String seatClass,String seatType,boolean value,boolean booking)
{
	int amount=0;
	if(booking)
	{
	amount+=amountCount*200;
	}
	if(seatClass.equals("Business"))
	{
	amount+=2000;	
	}
	if(seatClass.equals("Economy"))
	{
		amount+=1000;
	}
	if(seatType.equals("Window") ||seatType.equals("Aisle"))
	{
		amount+=100;
	}
   if(value)
   {
	 amount+=200;  
   }
	
	return amount;
}

public void bookFlight(boolean value,String[] array,List<Passenger> passenger)
{
Map<String,Seat> bookSeat=seatBooking.get(flightName);
int bookingId=getBookingId();
int amount=0;
Booking book=booked.get(bookingId);
if(book==null)
{
book=new Booking();	
}
Map<String ,Seat> fillSeat=occupiedSeats.get(bookingId);
if(fillSeat== null)
{
	fillSeat=new HashMap<>();
}

for(int i=0;i<array.length;i++)
    {
	
	Seat seatObj=bookSeat.get(array[i]);
	String seatClass=seatObj.getClassType();
	String seatType=seatObj.getSeatType();
	String seatName=seatObj.getSeatName();
	
	book.list.add(seatName);
	amount+=amountCalculation(seatClass,seatType,value,true);
    fillSeat.put(array[i], seatObj);
    bookSeat.remove(array[i]);
    seatBooking.put(flightName, bookSeat);
    if(value==true)
    {
    meals.add(seatName);
    }
    }
     book.passengerList=passenger;
    occupiedSeats.put(bookingId, fillSeat);
    amountCount++;
    book.setBookingId(bookingId);
    book.setMealPreference(value);
    int index=flightName.indexOf('-');
    String departure=flightName.substring(0,index);
    String destination=flightName.substring(index+1);
    book.setDeparture(departure);
    book.setDestination(destination);
    book.setAmount(amount);
    booked.put(bookingId, book);
    System.out.println(booked);
    System.out.println(occupiedSeats);
    payment(bookingId);
  }

public void payment(int bookingId)
{
Booking book=booked.get(bookingId);
int amount=book.getAmount();
System.out.println("The total cost of booking is"+ amount);
}
public void availableSeats(String flightName,String className)
{
	Map<String,Seat> seatObj=seatBooking.get(flightName);
	for(Seat seats:seatObj.values())
	{
	System.out.print("The seat name is "+seats.getSeatName());
	System.out.print("The seat class is"+seats.getClass());
	System.out.print("The seat type is"+seats.getSeatType());
	}
	//System.out.println(seatBooking.get(flightName));
	
}
public void filledSeats()
{
	System.out.println(occupiedSeats);
	
}
public void ticketSummary(int bookingId)
{
	Booking book=booked.get(bookingId);
	int length=book.list.size();

	for(int i=0;i<length;i++)
	{
		
		Passenger obj=book.passengerList.get(i);
		String name=obj.getPassengerName();
		int age=obj.getAge();
		
		String address=obj.getAddress();
		String seatName=book.list.get(i);
		System.out.println("Departure:"+book.getDeparture());
		System.out.println("Destination:"+book.getDestination());
		System.out.println("Date:"+book.getDate());
		System.out.println("FlightName:"+book.getFlightName());
		System.out.println("The seat Name:"+seatName);
		System.out.println("The booking id is "+bookingId);
		System.out.println("The name of passenger :"+name);
		System.out.println("The age of passenger :"+age);
		System.out.println("The address of passenger:"+address);
	    System.out.println();
	}
	
	
	
}
public void cancelTicket(int bookingId,String seatName)
{
Booking book=booked.get(bookingId);

boolean value=book.isMealPreference();
int amount=book.getAmount();
System.out.println("Hi");
	if(book.list.contains(seatName))
	{
		System.out.println("List"+book.list);
		System.out.println("Hi1");
		int index=book.list.indexOf(seatName);
		System.out.println(index);
		System.out.println("Hi1");
		book.list.remove(index);
		
	}
	  Map<String,Seat> filledSeat =occupiedSeats.get(bookingId);
	  if(filledSeat.containsKey(seatName))
	  {
		  System.out.println("Hi");
		  Seat seats=filledSeat.get(seatName);
		  String classType=seats.getClassType();
		  String seatType=seats.getSeatType();
		  String flightName=seats.getFlightName();
		  int amount1=amountCalculation(classType,seatType,value,false)-200;
		  amount=amount-amount1;
		  
		  book.setAmount(amount);
		  filledSeat.remove(seatName);
		  meals.remove(seatName);
		  Map<String,Seat> seatAvailable=seatBooking.get(flightName);
		  seatAvailable.put(classType, seats);
		  seatBooking.put(flightName, seatAvailable);
		  occupiedSeats.put(bookingId, filledSeat);
		  System.out.println(occupiedSeats);
		  System.out.println(book.list);
		  System.out.println(booked);
		  System.out.println(seatBooking);
		  System.out.println("The amount refunded for your cancellation is "+amount1);
	  }
}
public void mealsOrderedSeats()
{
	for(int i=0;i<meals.size();i++)
	{
	System.out.println(i+"-"+meals.get(i));
	}
}
}//home/thilak-inc1491/Development/FlightBooking/Flight-A112-Chennai-Mumbai.txt
///home/thilak-inc1491/Development/FlightBooking/FlightDetails.txt

