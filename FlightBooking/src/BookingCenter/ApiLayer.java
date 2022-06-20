package BookingCenter;

import java.io.BufferedWriter;
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
	
}
