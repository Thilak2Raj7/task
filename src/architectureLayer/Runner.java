package architectureLayer;
import accountInformation.CustomerInformation;
import accountInformation.AccountInformation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {
	BankingOperation perform=new BankingOperation();
	//static Map<Integer,String> storeLogin=new HashMap<Integer,String>();
	 Scanner scan=new Scanner(System.in);
	 public void addDummy() throws CustomException
	 {
		 CustomerInformation customer=new CustomerInformation();
			
			//System.out.println(name);
			customer.setCustomerName("Thilak");
			customer.setAge(21);
            customer.setPassword("tk");
		    customer.setAddress("Karaikudi");
		    System.out.println(perform.customerInfo(customer));
		    int customerId1=customer.getCustomerId();
		    AccountInformation account=new AccountInformation();
		    account.setBranch("KK");
		    System.out.println(perform.accountInfo(customerId1,account));
		    
		    CustomerInformation customer1=new CustomerInformation();
		    AccountInformation account1=new AccountInformation();
			customer1.setCustomerName("mani");
			customer1.setAge(21);
            customer1.setPassword("ms");
		    customer1.setAddress("Karaikudi");
	        System.out.println(perform.customerInfo(customer1));
	        int customerId=customer.getCustomerId();
	        account1.setBranch("KL");
	        System.out.println(perform.accountInfo(customerId,account1));
	   
	 }
	 
	public void userDetails() throws CustomException
	{
	 System.out.println("Existing customer");
	 boolean existing=scan.nextBoolean();
	 scan.nextLine();
	 if(existing== true)
	 {
	   checkLogin()	; 
	  }
	 else
	 {
		newUserDetails(); 
	 }
	 
		
	}
	
	public void newUserDetails() throws CustomException {
		CustomerInformation customer=new CustomerInformation();
		System.out.println("Enter the customerName");
		String name=scan.nextLine();
		System.out.println(name);
		customer.setCustomerName(name);
		//scan.nextLine();
		System.out.println("Enter the age");
		int age=scan.nextInt();
		
		customer.setAge(age);
		scan.nextLine();
		System.out.println("Enter the  password");
		String password=scan.nextLine();
		customer.setPassword(password);
		System.out.println("Enter the address");
		//String address=scan.nextLine();
        customer.setAddress("Karaikudi");
        System.out.println(perform.customerInfo(customer));
        int customerId=customer.getCustomerId();
     
        generateAccount(customerId);
      
	}
	
	public void generateAccount(int customerId) throws CustomException
	{
		AccountInformation account=new AccountInformation();
		System.out.println("Enter the branch");
		String branch=scan.nextLine();
		 
		account.setBranch("Kottaiyur");
		account.setCustomerId(customerId);
		System.out.println(perform.accountInfo(customerId,account));
	}
public void checkLogin() throws CustomException
{
	System.out.println("Enter the userName");
	int userName=scan.nextInt();
	scan.nextLine();
	System.out.println("Enter the password");
	String password=scan.nextLine();
    Map<Integer,CustomerInformation> mapObj=perform.getCustomerDetails();
    CustomerInformation customer=mapObj.get(userName);
    int count=0;
	if(customer.getPassword().equals(password))
	{
	 showOptions(userName);
	}
	else
	{
	count++;
	if(count<2)
	{
	System.out.println("reenter the password");
	password=scan.nextLine();
	}
	System.out.println("Entered logindetails wrong kindly check the details");	
	}
	
}


public void  deposit() throws CustomException
{
	
	System.out.println("Enter the beneficiary account");
	int accountId=scan.nextInt();
	System.out.println("Enter the amount");
	int amount=scan.nextInt();
	perform.depositAmount(accountId, amount);	
}
public void  withdraw()
{
	
	System.out.println("Enter your accountId");
	int accountId=scan.nextInt();
	System.out.println("Enter the amount");
	int amount=scan.nextInt();
	perform.withdrawAmount(accountId, amount);	
}

public void showOptions(int userName) throws CustomException {
int option=0;
boolean choice=true;

while(choice)
{
try
{
	System.out.println("Enter the operation to perform");
	option=scan.nextInt();
	scan.nextLine();
}
catch(Exception e)
{
System.out.print(e.getMessage());
}
switch(option)
{
case 1:
	
	generateAccount(userName);
  break;
  
case 2:
	System.out.println(perform.checkBalance(userName));
	break;
case 3:
	System.out.println("Enter your accountId");
	int fromAccountId=scan.nextInt();
	System.out.println("Enter the beneficiary account");
	int toAccountId=scan.nextInt();
	System.out.println("Enter the amount");
	int amount=scan.nextInt();
	perform.moneyTransfer(fromAccountId, toAccountId, amount);
	break;
	
case 4:
    deposit();
break;

case 5:
	withdraw();
break;

case 6:
	System.out.print("Enter the accountId");
	int account=scan.nextInt();
	System.out.println(perform.transactionDetail(account));
	break;
default :
	 choice=false;
	 System.out.println("Enter the valid input!"); 

}
}
}

	public static void main(String[] args) throws CustomException
	{
		 int operation=0;
		 Runner run=new Runner();
		 run.addDummy();
		 Scanner scan=new Scanner(System.in);
		 boolean value=true;
	while(value) {
     System.out.print("Enter the operation to perform");
     try {
        operation=scan.nextInt(); 
        scan.nextLine();
     }
 catch(Exception e)
     {
	 System.out.print(e.getMessage());
     }
    
 switch(operation) 
 {
 case 1:
	 try {
    run.userDetails	(); 
	 }
    catch(Exception e){
    	System.out.println(e.getMessage());
    }
 break;
 
 case 2:
	; 
 
 default :
	 value=false;
	 System.out.println("Enter the valid input!"); 
 
 }
}
		
}
}

