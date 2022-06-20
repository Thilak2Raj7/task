package BookingCenter;

import java.io.IOException;
import java.util.Scanner;



public class Runner {
	ApiLayer obj=new ApiLayer();
	Scanner scan=new Scanner(System.in);
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
	
	
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Runner run=new Runner();
		int operation=0;
		
		try {
			System.out.println("Enter the operation to perform");
			operation=scan.nextInt();
			
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
		
	}
		
		
	}
}
