package BookingCenter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;



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
	
	public void seatAllotment(int row,String classes,char[] array)
	{
	ticket.seatArrangement(row,classes,array);	
		
	}
	public char[] businessClass()
	{
		return ticket.classType1();
	}
	public char[] economyClass()
	{
		return ticket.classType2();
	}
	public int businessRow()
	{
		return ticket.businessRow();
		
	}
	public int economyRow()
	{
		return ticket.economyRow();
	}
	public void readFlights(String fileName) throws FileNotFoundException, IOException
	{
		ticket.flightDetails(fileName);
	}
	public void searchFlightsUsingPlace(String place) throws Exception
	{
		ticket.filterFlightsUsingPlace(place);
	}
	public void bookFlight(boolean value,String[] array,List<Passenger> passenger) throws Exception
	{
		ticket.bookFlight(value,array,passenger);
	}
	public void cancelTicket(int bookingId,String seatName) {
		ticket.cancelTicket(bookingId,seatName);
	}
	public void mealsOrdered()
	{
		ticket.mealsOrderedSeats();
	}
	public void printTicket(int bookingId)
	{
		ticket.ticketSummary(bookingId);
	}
	public void filterClass() throws Exception
	{
		ticket.filterUsingClass();
	}
	 public void checkAvailableSeats() throws Exception
     {
    	String flight=  ticket.flightName;
    	if(flight.equals(""))
    	{
    		throw new Exception("Kindly choose flight to  check availablity!");
    	}
    	 ticket.availableSeats(flight);
     }

}
