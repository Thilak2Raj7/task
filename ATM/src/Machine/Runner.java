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


/*public void customerDetails() throws IOException
{
	Map<Long,Customer> customer=new HashMap<Long,Customer>();

	Customer cusObj1=new Customer();
	Customer cusObj2=new Customer();
	Customer cusObj3=new Customer();
	Customer cusObj4=new Customer();
	Customer cusObj5=new Customer();
	String name1="Suresh";
	int pin1=1236;
	long account1=1;
	int amount1=41000;
	cusObj1.setName(name1);
	cusObj1.setPinNumber(pin1);
	cusObj1.setAccountNumber(account1);
	cusObj1.setAccountBalance(amount1);
	String name2="Mani";
	long account2=2;
	int amount2=82000;
	int pin2=1256;
	cusObj2.setName(name2);
	cusObj2.setPinNumber(pin2);
	cusObj2.setAccountNumber(account2);
	cusObj2.setAccountBalance(amount2);
	String name3="Ramu";
	int pin3=7845;
	long account3=3;
	int amount3=65200;
	cusObj3.setName(name3);
	cusObj3.setPinNumber(pin3);
	cusObj3.setAccountNumber(account3);
	cusObj3.setAccountBalance(amount3);
	String name4="Rajesh";
	int pin4=7845;
	long account4=4;
	int amount4=30700;
	cusObj4.setName(name4);
	cusObj4.setPinNumber(pin4);
	cusObj4.setAccountNumber(account4);
	cusObj4.setAccountBalance(amount4);
	String name5="Vijay";
	int pin5=4789;
	long account5=5;
	int amount5=24400;
	cusObj5.setName(name5);
	cusObj5.setPinNumber(pin5);
	cusObj5.setAccountNumber(account5);
	cusObj5.setAccountBalance(amount5);
	customer.put(account1, cusObj1);
	customer.put(account2, cusObj2);
	customer.put(account3, cusObj3);
	customer.put(account4, cusObj4);
	customer.put(account5, cusObj5);
	
	obj.writeCustomerDetails(customer);
	
	System.out.println("Customer added successfully");
}*/

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
	obj.checkAccountNumber(receiver);
	if(accountNo==receiver)
	{
		throw new Exception("Sender account and receiver account are same !");
	}
	else
	{
	System.out.println("Enter the amount");
	 amount=scan.nextInt();
	 obj.transferLimit(amount);
	 obj.transferMoney(accountNo,amount,receiver);
	 System.out.println("Amount transfered successfully");
	}
	break;
case 4:
	ATM atmObj=obj.checkAtmBalance(accountNo);
	System.out.println("Denomination     Number       value");
	System.out.println("2000            "+atmObj.getCount1()+"        " + atmObj.getAmount1());
	System.out.println("500             "+atmObj.getCount2()+"        "+  atmObj.getAmount2());
	System.out.println("100             "+atmObj.getCount3()+"        "+  atmObj.getAmount3());
	int totalAmount=atmObj.getAmount1()+atmObj.getAmount2()+atmObj.getAmount3();
	System.out.println("The total amount in Atm is "+totalAmount);
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
	Map<Long,Customer> mapObj=obj.readCustomerDetails();
	System.out.println("AccountNumber"+"\t"+"AccountHolder"+"\t"+"Pin    "+"\t"+"AccountBalance ");
	

for(long id:mapObj.keySet())
{
		Customer cusObj1=mapObj.get(id);
	    System.out.println("\t"+cusObj1.getAccountNumber()+"\t"+cusObj1.getName()+"\t\t"+cusObj1.getPinNumber()+"\t"+cusObj1.getAccountBalance());

}
	
	
}
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
   
 	
    Runner run=new Runner();
	int number=0;
	boolean value=true;
	System.out.println("1.Load cash in Atm");
	System.out.println("2.Read the details of customer");
	System.out.println("3.Atm operation");
    
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
	run.readCustomerDetails();
		
		
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		break;
	case 3:
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
		System.out.println("Kindly check number you have entered!! && Press number from 1  to 4 to perform operation");
	}
}
}
}
