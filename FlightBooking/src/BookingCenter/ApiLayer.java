package BookingCenter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



public class ApiLayer {
TicketBooking ticket=new TicketBooking();
public void createFolder(String folder) throws IOException
{
	ticket.createFolder(folder);
	
}
	public void writeFile(String fileName,String flightDetails) throws IOException
	{
		ticket.writeFile(fileName,flightDetails);
		
	}
	public void seatArrangement(String fileName,int[] array,String text,int rows) throws IOException
	{
	ticket.writeSeatArrangement(fileName, array, text, rows);	
		}
	
	public void readFile(String fileName) throws FileNotFoundException, IOException
	{
		ticket.readFile(fileName);
	}
	
	public void seatAllotment(int row,String classes,char[] array,String flightName)
	{
	ticket.seatArrangement(row,classes,array,flightName);	
		
	}
	public char[] businessClass()
	{
		return ticket.classType1();
	}
	public char[] economyClass()
	{
		return ticket.classType2();
	}
	public String businessRow()
	{
		return ticket.businessRow();
		
	}
	public String economyRow()
	{
		return ticket.economyRow();
	}
	public void readFlights(String fileName) throws FileNotFoundException, IOException
	{
		ticket.storeFlightDetails(fileName);
	}
	public void searchFlightsUsingPlace(String place) throws FileNotFoundException, IOException
	{
		ticket.filterFlightsUsingPlace(place);
	}
	public void bookFlight(String flightName,boolean value,String[] array)
	{
		ticket.bookFlight(flightName,value,array);
	}
	public void cancelTicket() {
		ticket.cancelTicket();
	}
}
