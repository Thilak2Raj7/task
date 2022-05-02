package BookMyTickets;

import java.util.Scanner;

public class Runner {
	
	
	public static void main(String[] args)
	{
		Cache  obj=new Cache();
		obj.seatAllotment();
		Scanner scan=new Scanner(System.in);
		int number=0;
		boolean value=true;
		while(value==true)
		{
	 try
	 {
		System.out.println("Enter the number") ;
		 number=scan.nextInt();
		 
		 
	 }
	 catch(Exception e)
	 {
		 System.out.println("Enter the valid details");
	 }
		
switch(number)
{
case 1:
	obj.bookTickets();
	break;
	
case 2:
	obj.cancelTicket();
	break;
	
case 3:
	obj.getBerthDetails();
	break;
	
case 4:
	obj.getTicketDetails();
	break;
	default:
		value=false;
		
}
		}
		
	}
	

}
