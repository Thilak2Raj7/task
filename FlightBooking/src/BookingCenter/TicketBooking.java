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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import BookingCenter.Booking;
import BookingCenter.Seat;

public class TicketBooking {
List<String> flightInfo=new ArrayList<String>();
 List<String> meals=new ArrayList<String>();
String flightName="";
int bookingId=0;
int amountCount=0;
String departure="";
String destination="";
Flight obj=new Flight();
int flightCount1=0;
int flightCount2=0;
int flightCount3=0;
Map<String ,Flight> flightObj=new HashMap<String,Flight>();
Map<Integer,Map<String ,Seat>> occupiedSeats=new HashMap<Integer,Map<String,Seat>>();
Map<Integer,Booking> booked=new HashMap<Integer,Booking>();
Map<String ,Map<String,Seat>> seatBooking=new HashMap<String,Map <String,Seat>>();
	
char[] array=new char[3];
char[] array1=new char[3];
int  businessRow=0;
int economyRow=0;
int count=0;
List<String> storage=new ArrayList<>();
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
	businessRow=0;
	economyRow=0;
	String bRow="";
	String eRow="";
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
			System.out.println("BusinessRow"+Arrays.toString(array));
		}
		else if(character >='0' && character<='9'&& value==false)
		{
			bRow+=character;
		}
			
		else if(character >='0' && character<='9'&& value==true && count1<3)
		{
		 array1[count1++]=character;
		 System.out.println("EconomyRow"+Arrays.toString(array1));
	    }
		else if(character >='0' && character<='9')
		{
			eRow+=character;
		}
	}
	businessRow=Integer.parseInt(bRow);
	
	
	if(!eRow.isEmpty())
	{
	economyRow=Integer.parseInt(eRow);
	}
	System.out.println("businessRow "+businessRow);
	System.out.println("economyRow "+economyRow);
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
public int businessRow()
{
	return businessRow;
}
public int  economyRow()
{
	return economyRow;
}

public void seatArrangement(int row,String classes,char[] array){
	
	int count1=65;
	int[] column=new int[array.length];
for(int i=0;i<array.length;i++)	
{
	column[i]=Integer.parseInt(String.valueOf(array[i]));
}	
System.out.println(Arrays.toString(column));

for(int j=0;j<row;j++)
{
	count++;
	count1=65;
	Map<String,Seat> bookTicket=seatBooking.get(flightName);
	if(bookTicket==null)
	{
		bookTicket=new HashMap<String,Seat>();
		seatBooking.put(flightName,bookTicket);
		
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

 }
	
	
//for(int t=0;t<listObj.size();t++)
//{
//System.out.println("listObj"+listObj.get(t));
//}

Map<String ,Seat> mapObj=seatBooking.get(flightName);
System.out.println("size"+mapObj.size());

}
public void setLocation(String location)
{
	int loc=location.lastIndexOf('-');
	String location1=location.substring(0,loc);
    int index2=location1.lastIndexOf('-');
     departure=location1.substring(index2+1);
	location=location.substring(loc+1);
	destination=location.trim();

}
public void filterUsingClass() throws Exception
{
	
	String sourceFile="";
	String checkFlight="";
  for(int i=0;i<flightInfo.size();i++)
  {
	  String flight=flightInfo.get(i);
	
	 
	System.out.println(flight);
	  if(flight.contains("Flight-"))
	  {
		  sourceFile=flight+".txt";
		  readFile(sourceFile);
	        if(businessRow!=0 && economyRow==0)
		  {
			 checkFlight=flight;
			}
		  
	  }  
	 } 
  
if(storage.contains(checkFlight))
{
	System.out.println("Flight available");
	setLocation(checkFlight);
	availableSeats(flightName);
}
else
{
flightName=checkFlight;
  int row=businessRow;
  seatArrangement(row,"Business",array);
   availableSeats(flightName);
  setLocation(flightName);
	count=0;
}

}
public void flightDetails(String fileName) throws FileNotFoundException, IOException
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
    		   flight=flight.trim();
    		  flightInfo.add(flight) ;
    		  flight="";
    	   }
    	   
    	   
       }
	}
	
}

public void findFlight(String place)
{
	
	for(int i=0;i<flightInfo.size();i++)
	{
		String details=flightInfo.get(i);
		if(details.contains(place))
		{
		flightName=details;
		}	
}
}
public boolean existingFlight(String place)
{
	boolean value=false;
	for(int i=0;i<storage.size();i++)
	{
		String info=storage.get(i);
		if(info.contains(place))
		{
		value=true;
		}
	}
return value;	
}
public void filterFlightsUsingPlace(String place) throws Exception		
{
	int index=place.indexOf('-');
    departure=place.substring(0,index);
	destination=place.substring(index+1);
	System.out.println(storage);
	
if(existingFlight(place))
{
	System.out.println("flight");
	findFlight(place);
	availableSeats(flightName);
}

else
{
	String flight="";
	findFlight(place);
flight=flightName+".txt";
readFile(flight);
seatArrangement(businessRow,"Business",array);
availableSeats(flightName);
if(economyRow!=0)
{
int row1=economyRow;
System.out.println(row1);
seatArrangement(row1,"Economy",array1);
}
availableSeats(flightName);
count=0;
}
}

public int getBookingId()
{
	return ++bookingId;
}
public int amountCalculation(String seatClass,String seatType,boolean value,Seat seatObj)
{
	int amount=0;

	if(seatClass.equals("Business"))
	{
	
	amount+=amountCount*obj.getBusinessPrice();
	amount+=2000;	
	System.out.println(amount);
	}
	if(seatClass.equals("Economy"))
	{
		amount+=amountCount*obj.getEconomyPrice();
		amount+=amountCount*100;
		amount+=1000;
		
	}
	if(seatType.equals("Window") ||seatType.equals("Aisile"))
	{
		amount+=100;
		System.out.println(amount);
	}
   if(value)
   {
	 amount+=200;  
   }
	seatObj.setAmount(amount);
return amount;
}
public Flight surgePrice(int business ,int economy)
{
	System.out.println("Hi");
      obj=flightObj.get(flightName);
    if(obj==null)
    {
    	obj=new Flight();
    }
	obj.setFlightName(flightName);
	obj.setBusinessPrice(business);
	obj.setEconomyPrice(economy);

	
	System.out.println("obj"+obj);
		return obj;
}
public void bookFlight(boolean value,String[] array,List<Passenger> passenger) throws Exception
{
storage.add(flightName);
   int business=0;
   int economy=0;
	if(flightName.contains("Chennai-Mumbai"))
	{
		
	  amountCount=0;
	   if(flightCount1!=0)
	   {
		  amountCount=flightCount1; 
	     business+=200;
		 economy+=100;
		 surgePrice(business,economy);
	   }
	
	}
	if(flightName.contains("Chennai-Kolkata"))
	{
		amountCount=0;
		if(flightCount2!=0)
		{
			amountCount=flightCount2;
		 business=300;
		 economy=150;
		surgePrice(business,economy);
		}
	
	}
	if(flightName.contains("Chennai-Bangalore"))
	{
		amountCount=0;
		if(flightCount3!=0)
		{
			amountCount=flightCount3;
		 business=150;
		 economy=100;
   surgePrice(business,economy);
	}
	}

Map<String,Seat> bookSeat=seatBooking.get(flightName);
for(String seat:bookSeat.keySet())
{
	System.out.println("Key"+seat);
}
String[] classType=new String[array.length];
System.out.println(Arrays.toString(classType));
for(int i=0;i<array.length;i++)
{
if(!bookSeat.containsKey(array[i]))
{
	throw new Exception("Seat is not available");
}
Seat seatObj=bookSeat.get(array[i]);
classType[i]=seatObj.getClassType();

if(i>0)
{
	if(!classType[i].equals(classType[0]))
	{
	throw new Exception("Select same class ticket for a booking");	
	}
}
}

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
	if(seatObj==null)
	{
		throw new Exception("The seat is  not available");
	}
	String seatClass=seatObj.getClassType();
	String seatType=seatObj.getSeatType();
	String seatName=seatObj.getSeatName();
	
	book.list.add(seatName);
	amount+=amountCalculation(seatClass,seatType,value,seatObj);
	
    fillSeat.put(array[i], seatObj);
    bookSeat.remove(array[i]);
    seatBooking.put(flightName, bookSeat);
    if(value)
    {
    	
    meals.add(seatName);
    System.out.println(meals);
    }
    }
     
     book.setDeparture(departure);
     book.setDestination(destination);
     book.passengerList=passenger;
    occupiedSeats.put(bookingId, fillSeat);
   
    long time=System.currentTimeMillis();
    Date date=new Date(time);
    book.setDate(date);
    book.setStatus("Booked");
    book.setBookingId(bookingId);
    book.setMealPreference(value);
    book.setFlightName(flightName);
    book.setAmount(amount);
    booked.put(bookingId, book);
   payment(bookingId);
    ticketSummary(bookingId);
    if(flightName.contains("Chennai-Mumbai"))
    {
    	flightCount1++;
    }
    if(flightName.contains("Chennai-Kolkata"))
    {
    	flightCount2++;
    }
    if(flightName.contains("Chennai-Bangalore"))
    {
    	flightCount3++;
    }
    	
  }

public void payment(int bookingId) throws Exception
{
if(!booked.containsKey(bookingId))
{
throw new Exception("Your booking id does not exist! kindly check and try again");		
}
Booking book=booked.get(bookingId);
int amount=book.getAmount();
System.out.println("The total cost of booking is"+ amount);
System.out.println("Happy journey!");
}

public void availableSeats(String flightName) throws Exception
{
	
	Map<String,Seat> seatObj=seatBooking.get(flightName);
	if(seatObj==null)
	{
		throw new Exception("Flight does not exist! Kindly select flight to check seat availablity ");
	}
	for(Seat seats:seatObj.values())
	{
	System.out.print("The seat name is "+seats.getSeatName()+" ");
	System.out.print("The seat class is "+seats.getClassType()+" ");
	System.out.print("The seat type is "+seats.getSeatType()+" ");
	System.out.println();
	}
	
	//System.out.println(seatBooking.get(flightName));
	
}
public void filledSeats()
{
	System.out.println(occupiedSeats);
	
}
public void ticketSummary(int bookingId)
{
	System.out.println(booked);
	Booking book=booked.get(bookingId);
	System.out.println(book);
	int length=book.list.size();
    System.out.println("l"+length);
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

	if(book.list.contains(seatName))
	{
		
		
		int index=book.list.indexOf(seatName);
		
		
		book.list.remove(index);
		if(book.list==null)
		{
			booked.remove(bookingId);
		}
		
	}
	  Map<String,Seat> filledSeat =occupiedSeats.get(bookingId);
	  if(filledSeat.containsKey(seatName))
	  {
		
		  Seat seats=filledSeat.get(seatName);
		  String classType=seats.getClassType();
		  String seatType=seats.getSeatType();
		  String flightName=seats.getFlightName();
		  int amount1=seats.getAmount()-200;
		  if(meals.contains(seatName))
		  {
			  amount1=amount1-200;
			  meals.remove(seatName);
		  }
		 		  
		  book.setAmount(amount1);
		  book.setStatus("Cancelled");
		  filledSeat.remove(seatName);
		   Map<String,Seat> seatAvailable=seatBooking.get(flightName);
		   seatAvailable.put(seatName,seats );
		   System.out.println(classType+seats);
		  seatBooking.put(flightName, seatAvailable);
		  occupiedSeats.put(bookingId, filledSeat);
		  System.out.println("The amount refunded for your cancellation is "+amount1);
	  }
}

public void mealsOrderedSeats()
{

	
     
	for(int i=0;i<meals.size();i++)
	{
	if(i==0)
	{
		System.out.println("Meals ordered seats");
	}
	System.out.println(meals.get(i));
	}
	System.out.println("The total meal ordereds seats is "+meals.size());
}
}



