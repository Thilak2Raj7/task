package Machine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AtmOperation {
ATM atmObj=new ATM();
Customer cusObj1=new Customer();
Map<Long,Customer> customer=new HashMap<Long,Customer>();
Map<Long,List<Transaction>> transaction=new HashMap<Long,List<Transaction>>();
int transactionNumber;
int lastTransactionNo=1;
public AtmOperation()
{
	try {
		readFile();
	readCustomerDetails();
	System.out.println("Successfully completed");
	readTransaction();
	//readTransactionNumber();
}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
public void checkAtmBalance() 
 {
	 try {
	
	readFile();
	System.out.println("Denomination     Number       value");
	System.out.println("2000            "+atmObj.getCount1()+"        " + atmObj.getAmount1());
	System.out.println("500             "+atmObj.getCount2()+"        "+  atmObj.getAmount2());
	System.out.println("100             "+atmObj.getCount3()+"        "+  atmObj.getAmount3());
	int totalAmount=atmObj.getAmount1()+atmObj.getAmount2()+atmObj.getAmount3();
	System.out.println("The total amount in Atm is "+totalAmount);
	 }
	 catch(Exception e)
	 {
		 System.out.println("Exception occured");
	 }
	
}
public void calculateAmount(int note1,int note2,int note3) throws IOException
{

	int count1=atmObj.getCount1();
	int count2=atmObj.getCount2();
	int count3=atmObj.getCount3();
	atmObj.setCount1(count1+note1);
	atmObj.setCount2(count2+note2);
	atmObj.setCount3(count3+note3);
	int amount1=atmObj.getAmount1();
	int amount2=atmObj.getAmount2();
	int amount3=atmObj.getAmount3();
	writeFile();
	
	}



public void createFile(String fileName) throws IOException
{

	File myFile=new File(fileName);
	myFile.createNewFile();
	System.out.println("File created");
	
}

public void writeFile() throws IOException
{
	
try(BufferedWriter bw=new BufferedWriter(new FileWriter("Atm.txt")))
	{
	 bw.write("Denomination"+"t\t"+"Number"+"\t\t"+"Value"+'\n');
	 bw.write("2000"+"\t\t"+atmObj.getCount1()+"\t\t"+atmObj.getAmount1()+'\n');
	 bw.write("500"+"\t\t"+atmObj.getCount2()+"\t\t"+atmObj.getAmount2()+'\n');
	 bw.write("100"+"\t\t"+atmObj.getCount3()+"\t\t"+atmObj.getAmount3()+'\n');
	 bw.close();	
	}
}
public void readFile() throws IOException
{
	//StringBuilder sb=new StringBuilder();
	String t="";
	
	try(BufferedReader bw=new BufferedReader(new FileReader("Atm.txt")))
	{
		 
		String line="";
		int count=0;
		while((line=bw.readLine())!=null)
		{
			t=line;
			t=t.trim();
		if(count>0)
		{
		String[] array=t.split("\t");
	     //.out.println(Arrays.toString(array));
	     if(count==1)
	     {
	     atmObj.setCount1(Integer.parseInt(array[2]));
		}
	     if(count==2)
	     {
	    	 atmObj.setCount2(Integer.parseInt(array[2]));
	     }
	     if(count==3)
	     {
	     atmObj.setCount3(Integer.parseInt(array[2]));
	     }
		}
	     count++;
	
		}
	
	
}
}
public void writeCustomerDetails(Map<Long,Customer> customer) throws IOException
{

	System.out.println(customer);
	try(BufferedWriter bw=new BufferedWriter(new FileWriter("Customer.txt")))
	{
		bw.write("AccountNumber"+"\t"+"AccountHolder"+"\t"+"PinNumber"+"\t"+"ClosingBalance"+'\n');
		for(long accNo:customer.keySet())
		{
	   Customer cusObj=customer.get(accNo);
		String accountNumber=String.valueOf(cusObj.getAccountNumber());
		String accountBalance=String.valueOf(cusObj.getAccountBalance());
		String name=String.valueOf(cusObj.getName());
		String pin=String.valueOf(cusObj.getPinNumber());
		bw.write(accountNumber+"\t\t"+name+"\t\t"+pin+"\t\t"+accountBalance+'\n');
		}
	
	
}
}
public void readCustomerDetails() throws IOException
{
	try(BufferedReader bw=new BufferedReader(new FileReader("Customer.txt")))
	{
		int count=0;
		String line="";
		while((line=bw.readLine())!=null)
		{
		  String text=line;
		  String [] array=text.split("\t\t");
	          if(count>0)
		      {
			  long accountNumber=Long.parseLong(array[0]);
			  int pin=Integer.parseInt(array[2]);
			  String name=array[1];
			  int balance=Integer.parseInt(array[3]);
			 Customer cusObj=customer.get(accountNumber);
			    if(cusObj==null)
			    {
			    	cusObj=new Customer();
			    }
			cusObj.setAccountNumber(accountNumber);
			cusObj.setName(name);
			cusObj.setPinNumber(pin);
			cusObj.setAccountBalance(balance);
			
		    
			  customer.put(accountNumber, cusObj);
				
		      }
		    
		      count++;
		  }
		}
		
		
		
		
	
	
	System.out.println(customer);
	
}
public void checkCrediantials(long accountNumber,int pin)throws Exception
{
	if(!customer.containsKey(accountNumber)){
		throw new Exception("Exception occured");
	}
	else
	{
		Customer cusObj=customer.get(accountNumber);
		if(pin==cusObj.getPinNumber())
		{
			System.out.println("logged in Successfully");
		}
		else
		{
			throw new Exception("Exception occured");
		}
	}
	
}
public int getTransactionNumber()
{
	lastTransactionNo=lastTransactionNo+1;
	return lastTransactionNo;
	
}
public void writeTransaction(long accountNumber) throws IOException
{
	String customerId=String.valueOf(accountNumber);
	try(BufferedWriter bw=new BufferedWriter(new FileWriter("<"+customerId+">transaction.txt")))
	{
		
	
		
		bw.write("TransactionNo"+"\t"+"Description"+"\t\t"+"Credit/debit "+"\t"+"Amount "+"\t"+"ClosingBalance"+'\n');
		List<Transaction> trans=transaction.get(accountNumber);
	   for(int i=0;i<trans.size();i++)
	   {
		   Transaction obj=trans.get(i);
		  //String.valueOf (obj.getAccountNumber());
		  String closingBalance=String.valueOf (obj.getClosingBalance());
		  String amount=String.valueOf (obj.getAmount());
		 String description =String.valueOf (obj.getDescription());
		 String transaction =String.valueOf (obj.getTransactionNumber());
		 String transferType =String.valueOf (obj.getTransferType());
		 //Formatter fr=new Formatter();
		 
		  bw.write(transaction+"\t\t"+ description+"\t\t"+ transferType+"\t\t"+amount+"\t\t"+closingBalance+'\n');
		   
	   }
	}
	
	
	
}
public void amountLimit(int amount) throws Exception
{
if(amount>10000 && amount<100)
{
	throw new Exception("Maximum withdraw limit is 10000 and Minimum withdraw limit is 500");
}
	
	
}
public void writeTransactionNumber() throws IOException
{
	try(BufferedWriter bw=new BufferedWriter(new FileWriter("TransactionNumber.txt")))
	{
		String transactionNumber=String.valueOf(lastTransactionNo);
		bw.write(transactionNumber);
	}
	
	
}
public void readTransactionNumber() throws FileNotFoundException, IOException
{
	try(BufferedReader bw=new BufferedReader(new FileReader("TransactionNumber.txt"))) {
		String line="";
		while((line=bw.readLine())!=null)
		{
			
		line=line.trim();
			String trans=line;
		}
	}
}

public void readTransaction() throws FileNotFoundException, IOException
{
	for(long id:customer.keySet())
	{
		String customerId=String.valueOf(id);
		 List<Transaction> trans= transaction.get(id);
		 if(trans==null)
		 {
			 trans=new ArrayList();
		 }
	try(BufferedReader bw=new BufferedReader(new FileReader("<"+customerId+">transaction.txt")))	
	{
		String line="";
	    int count=0;
	   
		while((line=bw.readLine())!=null)
		{
		
         String[] array=line.split("\t\t");
       
         if(count>1)
         {
        	int closingBalance=Integer.parseInt(array[4]) ;
        	int transactionNo=Integer.parseInt(array[0]);
        	String describe=array[1];
        	String transfer=array[2];
        	int amount=Integer.parseInt(array[3]);
            Transaction obj=new Transaction();
            obj.setTransactionNumber(transactionNo);
            obj.setAmount(amount);
            obj.setClosingBalance(closingBalance);
            obj.setDescription(describe);
            obj.setTransferType(transfer);
        	 trans.add(obj);
        	 
         }
         count++;
		}
		transaction.put(id, trans);
	}

	}
}
public void checkBalance(long accountNumber) throws Exception
{
	
	Customer cusObj=customer.get(accountNumber);
    System.out.println(cusObj.getAccountBalance());
	
}

public void withDrawMoney(long accountNumber,int amount) throws Exception
{
	Customer cusObj=customer.get(accountNumber);

		int balance=cusObj.getAccountBalance();
		if(balance>amount && amount>100 && amount <10000)
		{
		balance=balance-amount;
		
		
	
		System.out.println(customer);
		denomination(amount);
		
		cusObj.setAccountBalance(balance);
		customer.put(accountNumber, cusObj);
		transactionDetails(accountNumber,"CashWithdraw",0,balance,amount);
		writeCustomerDetails(customer);
         }
		else
		{
			throw new Exception("Exception occured");
		}
}
public void transactionDetails(long sender,String describe,long receiver,long balance,int amount) throws IOException
{
	List<Transaction> transDetails=transaction.get(sender);
	if(transDetails==null)
	{
		transDetails=new ArrayList<>();
	}
	Transaction trans1=new Transaction();
	//trans1.setAccountNumber(sender);
	String description="";
	if(describe.equals("Transfer to "))
	{
		 description=describe+String.valueOf(receiver);
		trans1.setTransferType("Debit");
	}
	else if(describe.equals("Transfer from"))
	{
		description=describe+String.valueOf(receiver);
		trans1.setTransferType("Credit");
	}
	else
	{
		description=describe;
		trans1.setTransferType("Debit");
	}
	trans1.setDescription(description);
	int transNo=getTransactionNumber();
	System.out.println(transNo);
	trans1.setTransactionNumber(transNo);
	trans1.setAmount(amount);
	trans1.setClosingBalance(balance);
	transDetails.add(trans1);
	transaction.put(sender, transDetails);	
	writeTransaction(sender);
	writeTransactionNumber();
}
public void transferMoney(long sender,int amount,long receiver) throws Exception
{
	Customer cusObj=customer.get(sender);
	int balance=cusObj.getAccountBalance();
	if(balance> amount && amount>=1000 && amount<=10000)
	{
		balance=balance-amount;
		cusObj.setAccountBalance(balance);
		customer.put(sender, cusObj);
	   String describe="Transfer to ";
	   transactionDetails(sender,describe,receiver,balance,amount);
		
		Customer cus1=customer.get(receiver);
		int balance1=cus1.getAccountBalance();
		balance1=balance1+amount;
		cus1.setAccountBalance(balance1);
		customer.put(receiver, cus1);
		describe="Transfer from";
		 transactionDetails(receiver,describe,sender,balance1,amount);
		 writeCustomerDetails(customer);
		
	}
	else
	{
		throw new Exception("Exception occured");
	}
	//System.out.println(customer);
	//System.out.println(transaction);
}
public void denomination(int amount) throws Exception
{
readFile();	
int note1=atmObj.getCount1();
int note2=atmObj.getCount2();
int note3=atmObj.getCount3();
	if(amount>5000)
	{
	if(note1>=2)
	{
	note1=note1-2;
	amount-=2*2000;
	}
	else
	{
	throw new Exception("Not sufficient amount to withdraw");
	}
	
	//System.out.println("a1"+amount);
	
  int den1=amount/500;
  if(den1>note2)
  {
	  throw new Exception("Not sufficient amount to withdraw");  
  }
  ///System.out.println("den"+den1);
  else  
	{
	note2=note2-den1;
	amount-=den1*500;
	}
	
	//System.out.println("a2"+amount);
	int den2=amount/100;
	  //System.out.println("den2"+den2);
	if(note3 >=den2 && den2<=10)
	{
	note3=note3-den2;
	amount-=den2*100;
	}
	else
	{
	throw new Exception("Not sufficient amount to withdraw");
	}
	//System.out.println("a3"+amount);

	writeFile();
	}
	else
	{
		if(amount>3000 )
		{
	    if(note1<0)
	    {
	    throw new Exception("Not sufficent amount to withdraw ");	
	    }
		note1=note1-1;
		//System.out.println("n1"+note1);
		amount-=(2000*1);
		}
		//System.out.println("a1"+amount);
		while(amount>1000)
		{
		 if(note2<0)
		  {
		 throw new Exception("Not sufficent amount to withdraw ");	
	    }
		note2=note2-1;
		amount-=(500*1);
		//System.out.println("n2"+note2);
		}
		//System.out.println("a2"+amount);
		while(amount>=100)
		{
		if(note3<0)
		{
		 throw new Exception("Not sufficent amount to withdraw ");	
	    }
		note3=note3-1;
		amount-=(100*1);
		//System.out.println("n3"+note3);
		}
		//System.out.println("a3"+amount);
     }
	atmObj.setCount1(note1);
	atmObj.setCount2(note2);
	atmObj.setCount3(note3);
	writeFile();
	
    
}
public void miniStatement(long accountNumber) throws FileNotFoundException, IOException
{
	Formatter formatter=new Formatter();
	formatter.format("%s %12s %15s %12s %12s","TransactionNo","Description","Credit/debit","Amount","ClosingBalance");
	System.out.println(formatter);
	List<Transaction> transObj=transaction.get(accountNumber);
	System.out.println(transObj);
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
	
	
	for(int i=length-1;i>=count;i--)
	{
	Transaction obj=transObj.get(i);
	Formatter form=new Formatter();
	
	form.format("%10s %15s %15s %12s %12s",obj.getTransactionNumber(),obj.getDescription(),obj.getTransferType(),obj.getAmount(),obj.getClosingBalance());
	System.out.println(form);	
	}

	
}
}

