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
	
	public void seatAllotment(int row)
	{
	ticket.seatArrangement(row);	
		
	}
	
}
