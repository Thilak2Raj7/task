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
public void calculateAmount(String fileName,int note1,int note2,int note3) throws IOException
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
	
	return ++lastTransactionNo;
	
}
public void writeTransaction(long accountNumber) throws IOException
{
	String customerId=String.valueOf(accountNumber);
	try(BufferedWriter bw=new BufferedWriter(new FileWriter("<"+customerId+">transaction.txt")))
	{
		bw.write(lastTransactionNo+"\n");
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
		  bw.write(transaction+"\t\t"+ description+"\t\t"+ transferType+"\t\t"+amount+"\t\t"+closingBalance+'\n');
		   
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
         if(count==0)
         {
        	 lastTransactionNo=Integer.parseInt(array[0]);
         }
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
		cusObj.setAccountBalance(balance);
		customer.put(accountNumber, cusObj);
		
		writeCustomerDetails(customer);
		denomination(amount);
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
	String description=describe+String.valueOf(receiver);
	if(describe.equals("Transfer to "))
	{
		trans1.setTransferType("Debit");
	}
	else if(describe.equals("Transfer from"))
	{
		trans1.setTransferType("Credit");
	}
	else
	{
		trans1.setTransferType("CashWithdraw");
	}
	trans1.setDescription(description);
	int transNo=getTransactionNumber();
	trans1.setTransactionNumber(transNo);
	trans1.setAmount(amount);
	trans1.setClosingBalance(balance);
	transDetails.add(trans1);
	transaction.put(sender, transDetails);	
	writeTransaction(sender);
	
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
	System.out.println(customer);
	System.out.println(transaction);
}
public void denomination(int amount) throws IOException
{
int note1=atmObj.getCount1();
int note2=atmObj.getCount2();
int note3=atmObj.getCount3();
	if(amount>5000)
	{
	if(note1>=2)
	{
	note1=note1-2;
	}
	amount-=2*2000;
	
	System.out.println("a1"+amount);
	
  int den1=amount/500;
  System.out.println("den"+den1);
	if(note2>=2)
	{
	 note2=note2-den1;
	}
	amount-=den1*500;
	System.out.println("a2"+amount);
	int den2=amount/100;
	  System.out.println("den2"+den2);
	if(note3 >=den2 && den2<=10)
	{
	note3=note3-den2;	
	}
	amount-=den2*100;
	System.out.println("a3"+amount);
	atmObj.setCount1(note1);
	atmObj.setCount2(note2);
	atmObj.setCount3(note3);
	writeFile();
	}
	else
	{
		
		
	}
	
}

}

