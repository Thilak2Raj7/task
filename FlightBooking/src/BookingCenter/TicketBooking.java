package BookingCenter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TicketBooking {

	
	
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
}
