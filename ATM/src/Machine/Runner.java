package Machine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Machine.Customer;
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

public void customerDetails() throws IOException
{
	Map<Long,Customer> cusObj=new HashMap<Long,Customer>();
	for(int i=0;i<5;i++)
	{
		
		
		System.out.println("Enter the account number");
		long accountNumber=scan.nextLong();
		System.out.println("Enter the pin number");
		int pin=scan.nextInt();
		System.out.println("Enter the balance");
		int amount=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the name");
		String name=scan.nextLine();
		Customer customer=cusObj.get(accountNumber);
		if(customer==null)
		{
			customer=new Customer();
		}
		cusObj.put(accountNumber, customer);
	
		customer.setAccountNumber(accountNumber);
		customer.setName(name);
		customer.setPinNumber(pin);
		customer.setAccountBalance(amount);
		
	}
	System.out.println(cusObj);
	obj.writeCustomerDetails(cusObj);
}

public void atmOperation() throws Exception
{ 
System.out.println("Enter the account Number");
long accountNo=scan.nextLong();
System.out.println("Enter the pin");
int pin=scan.nextInt();
obj.checkCrediantials(accountNo, pin);
System.out.println("Press1 for Check Balance");
System.out.println("Press2 for Withdraw money");
System.out.println("Press3 for Transfer money");
System.out.println("Press4 forCheck ATM balance");
System.out.println("Press5 for Mini statement");
int number=scan.nextInt();
switch(number)
{
case 1:
	
	obj.checkBalance(accountNo);
    break;
case 2:
	System.out.println("Enter the amount");
	int amount=scan.nextInt();
	obj.withDrawMoney(accountNo,amount);
	break;
case 3:
	
	System.out.println("Enter the receiver accountId");
	long receiver=scan.nextLong();
	System.out.println("Enter the amount");
	 amount=scan.nextInt();
	 obj.transferMoney(accountNo,amount,receiver);
	
	break;
case 4:
	
	break;

case 5:
	
	break;
	
	default:
		System.out.println("The option is not valid");
	
}
	
	
	
	
}
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
   
 
	AtmOperation obj=new AtmOperation();	
    Runner run=new Runner();
	int number=0;
	boolean value=true;
	System.out.println("1.Load cash");
	System.out.println("3.Customer details");
	System.out.println("5.Atm operation");
	while(value)
	{
	try {
		System.out.println("Enter the opertion to perform");
		number=scan.nextInt();
		scan.nextLine();
		
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
	case 3:
	try {
		run.customerDetails();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	break;
	case 4:
		
			try {
				obj.readCustomerDetails();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		break;
	case 5:
		try {
			
			run.atmOperation();
		}
		 catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		break;
		
	case 6:
	
		try {
			
			obj.checkAtmBalance();
		}
		 catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		break;
	default:
		value=false;
	}
}
}
}
