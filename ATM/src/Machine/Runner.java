package Machine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
Scanner scan=new Scanner(System.in);
String fileName="";	
AtmOperation obj=new AtmOperation();	
	
	
public void loadCash() throws IOException
{
	System.out.println("Enter the number of notes in 2000");
	int note1=scan.nextInt();
	System.out.println("Enter the number of notes in 500");
	int note2=scan.nextInt();
	System.out.println("Enter the number of notes in 100");
	int note3=scan.nextInt();
	scan.nextLine();
	System.out.println("Enter the file name");
	String fileName=scan.nextLine();
    obj.calculateAmount(fileName,note1,note2,note3);
}
public void readFile() throws IOException
{
	obj.readFile();
}
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	Runner run=new Runner();
	int number=0;
	boolean value=true;
	while(value)
	{
	try {
		System.out.println("Enter the opertion to perform");
		number=scan.nextInt();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	switch(number)
	{
	case 1:
		try {
		run.loadCash();
	    }
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		break;
	case 2:
		try {
			run.readFile();
		    }
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			break;
	default:
		value=false;
	}
}
}
}
