package pack;

import java.util.*;
public class RunnerClass {
	
	LogicalLayer logicObj=new LogicalLayer();
	Scanner scan=new Scanner(System.in);
	int count=0;
	int customerId=0;
	int accountId=0;
	//Map mapObj=new HashMap();
	//Map newMapObj=new HashMap();
	//Map<Integer,Map<Integer,Object>> newObj=new HashMap();
	
public void customerDetails()
{
	try {
    Map cusObj=new HashMap();
	 //List listObj=logicObj.getEmptyArrayList();
	System.out.println("Enter the number of customers");
	int count =scan.nextInt();
	scan.nextLine();
	//CustomerDetails pojoObj=new CustomerDetails(); 
	for(int i=0;i<count;i++)
	{
	 CustomerDetails cusInfo=new CustomerDetails();//
	 System.out.println("Enter the name");
	 String customerName=scan.nextLine();
	 scan.nextLine();
     cusInfo.setCustomerName(customerName);
    
	 System.out.println("Enter the age");
     int age=scan.nextInt();
    cusInfo.setAge(age);
     scan.nextLine();
	 System.out.println("Enter the address");
     String address=scan.nextLine();
     cusInfo.setAddress(address);
  
     customerId=logicObj.generateId();
    cusInfo.setCustomerId(customerId);
     cusObj=logicObj.customerDetails(cusInfo);
     
}
	System.out.println(cusObj);
}
catch(Exception e)
{
	System.out.println(e.getMessage());
	e.printStackTrace();
}
	//return mapObj;
}
public void getCustomerDetails()
{
try {
	System.out.println("Enter the customerID");
	int customerId=scan.nextInt();
	System.out.println ( logicObj.getId(customerId));
    }
catch (Exception e)
  {
	System.out.println(e.getMessage());
	e.printStackTrace();
  }
}
public void accountDetails()
{
	try
	{
	Map accountObj=new HashMap();
	System.out.println("Enter the number of accountholders");
	int count =scan.nextInt();
	//System.out.println("Enter the customerId");
	
	for(int i=0;i<count;i++)
	{
		AccountDetails  accObj=new AccountDetails();
		System.out.println("Enter the customerId");
		int customerId=scan.nextInt();
		
		int accountId=logicObj.generateAccountId();
		accObj.setAccountId(accountId);
		accObj.setCustomerId(customerId);
		System.out.println("Enter the accountNumber");
	   long accountNumber=scan.nextLong();
		accObj.setAccountNumber( accountNumber);
		System.out.println("Enter the account balance");
		double accountBalance=scan.nextDouble();
		accObj.setAccountBalance(accountBalance);
		scan.nextLine();
		System.out.println("Enter the branch");
		String branch=scan.nextLine();
		accObj.setBranch(branch);
		 //int accountId=logicObj.generateAccountId();
        accountObj=logicObj.accountDetails(accObj);
		
		}
		
	
	 System.out.println(accountObj);
}
	catch (Exception e)
	  {
		System.out.println(e.getMessage());
		e.printStackTrace();
	  }
//return newObj;
}
public void getAccountDetails()
{
	try {
		System.out.println("Enter the customerId");
	    int customerId=scan.nextInt();
		System.out.println("Enter the accountId");
		int accountId=scan.nextInt();
		  System.out.println(logicObj.fetchAccountDetails(customerId,accountId));	
}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
}
public static void main(String[] args)
{
int number=0;
RunnerClass object=new RunnerClass();
CustomerDetails pojoObj=new CustomerDetails();
LogicalLayer logicObj=new LogicalLayer();
Scanner scan=new Scanner(System.in);
boolean flag= true;
while (flag)
{
	try
	{
	System.out.println("Enter the number");
	number=scan.nextInt();
	scan.nextLine();
	}
	catch (Exception e)
	{
	 System.out.println(e.getMessage());
	}
	switch(number)
	{
	case 1:
	object.customerDetails();
    break;
    
	case 2:
	object.getCustomerDetails();
	break;
	
	case  3:
		object.accountDetails();
	  break;
	case 4:
		object.getAccountDetails();
		break;
     default :
	 flag=false;
	 System.out.println("Enter the invalid input");
	}
}


}
}


