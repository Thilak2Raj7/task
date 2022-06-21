package BookingCenter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
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
		System.out.println("Enter the rows");
		int row=scan.nextInt();
	   obj.seatAllotment(row);
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		ApiLayer api=new ApiLayer();
		Runner run=new Runner();
		int operation=0;
		boolean value=true;
		while(value)
		{
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
			run.arrangeSeats();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		break;
	default:
		value=false;
		System.out.println("Enter the valid number");
	}
	}
		
		
	}
}
