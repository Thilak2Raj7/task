package Machine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
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
	
    obj.calculateAmount(note1,note2,note3);
    System.out.println("Successfully the cash loaded to the atm");
}
public void readFile() throws IOException
{
	obj.cashAvailableInAtm();
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
	
	obj.writeCustomerDetails(cusObj);
	System.out.println("Customer added successfully");
}

public void atmOperation() throws Exception
{ 
System.out.println("Enter the account Number");
long accountNo=scan.nextLong();
System.out.println("Enter the pin");
int pin=scan.nextInt();
obj.checkCrediantials(accountNo, pin);
//obj.readTransaction();
//obj.readFile();
//obj.readCustomerDetails();
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
	obj.amountLimit(amount);
	obj.withDrawMoney(accountNo,amount);
	System.out.println("Amount withdrawn successfully");
	break;
case 3:
	
	System.out.println("Enter the receiver accountId");
	long receiver=scan.nextLong();
	if(accountNo==receiver)
	{
		throw new Exception("Sender account and receiver account are same !");
	}
	else
	{
	System.out.println("Enter the amount");
	 amount=scan.nextInt();
	 obj.transferMoney(accountNo,amount,receiver);
	 System.out.println("Amount transfered successfully");
	}
	break;
case 4:
	obj.checkAtmBalance(accountNo);
	break;

case 5:
	List<Transaction> transObj=obj.miniStatement(accountNo);
	Formatter formatter=new Formatter();
	formatter.format("%s %12s %15s %12s %12s","TransactionNo","Description","Credit/debit","Amount","ClosingBalance");
	//System.out.println(formatter);
   int length=transObj.size();
	int count=0;
	if(length>10)
	{
	count=length-10;	
	}
	else 
	{
	count=0;	
	}
	
	System.out.println(transObj);
	for(int i=length-1;i>=count;i--)
	{
	Transaction obj=transObj.get(i);
	Formatter form=new Formatter();
	
	form.format("%10s %15s %15s %12s %12s",obj.getTransactionNumber(),obj.getDescription(),obj.getTransferType(),obj.getAmount(),obj.getClosingBalance());
	System.out.println(form);
	}
	break;
	
	default:
		System.out.println("The option is not valid");
	
}
}


public void readCustomerDetails() throws IOException
{
	System.out.println(obj.readCustomerDetails());
}
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
   
 	
    Runner run=new Runner();
	int number=0;
	boolean value=true;
	System.out.println("1.Load cash");
	System.out.println("2.Read the cash from atm");
	System.out.println("3.Customer details");
	System.out.println("4.Read the details of customer");
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
				AtmOperation obj=new AtmOperation();
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

	default:
		value=false;
	}
}
}
}
