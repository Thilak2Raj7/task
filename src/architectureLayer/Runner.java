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
//	 public void addDummy() throws CustomException
//	 {
//		 CustomerInformation customer=new CustomerInformation();
//			
//			//System.out.println(name);
//			customer.setCustomerName("Thilak");
//			customer.setAge(21);
//            customer.setPassword("tk");
//		    customer.setAddress("Karaikudi");
//		    System.out.println(perform.customerInfo(customer));
//		    int customerId1=customer.getCustomerId();
//		    AccountInformation account=new AccountInformation();
//		    account.setCustomerId(customerId1);
//		    account.setBranch("KK");
//		    System.out.println(perform.accountInfo(customerId1,account));
//		    
//		    CustomerInformation customer1=new CustomerInformation();
//		    AccountInformation account1=new AccountInformation();
//			customer1.setCustomerName("mani");
//			customer1.setAge(21);
//            customer1.setPassword("ms");
//		    customer1.setAddress("Karaikudi");
//	        System.out.println(perform.customerInfo(customer1));
//	        int customerId=customer1.getCustomerId();
//	        account1.setCustomerId(customerId);
//	        account1.setBranch("KL");
//	        System.out.println(perform.accountInfo(customerId,account1));
//	   
//	 }
	 
	public void userDetails() throws CustomException
	{
	 System.out.println("Are you an existing customer"
			 +"type true  for yes" +"or false for no") ;
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
		String address=scan.nextLine();
        customer.setAddress(address);
        System.out.println(perform.customerInfo(customer));
        perform.ObjectCheck(customer);
        int customerId=customer.getCustomerId();
        System.out.println("Your userId is "+customerId + "Your password is"+password);
        generateAccount(customerId);
      
	}
	
	public void generateAccount(int customerId) throws CustomException
	{
		AccountInformation account=new AccountInformation();
		System.out.println("Enter the branch");
		String branch=scan.nextLine();
		 
		account.setBranch(branch);
		account.setCustomerId(customerId);
		System.out.println(perform.accountInfo(customerId,account));
		perform.ObjectCheck(branch);
	}
public void checkLogin() throws CustomException
{
	System.out.println("Enter the userName");
	int userName=scan.nextInt();
	perform.numCheck(userName);
	scan.nextLine();
	System.out.println("Enter the password");
	String password=scan.nextLine();
	perform.stringCheck(password);
	if(userName==5000 && password.equals("admin"))
	{
	   adminLogin();	
	}
	else
	{
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
	perform.stringCheck(password);
	}
	System.out.println("Entered logindetails wrong kindly check the details");	
	}
	}
}

public void adminLogin() throws CustomException
{
	System.out.print(" 1-Logout "
	+ "2-AccountEnquiry"
	+"3- Customer Enquiry"+
	"4- TransactionDetails"+
	"5- LoanEnquiry"
	+"6- MoneyTransfer"
	+"7- Total customerDetails"
  	+"8- Total accountDetails"		
    +"9- ChangeLoan"
	+"10- Print the Transaction"
			);
	boolean check=true;
	System.out.println("Enter the  value for admin operation");
	int value=scan.nextInt();
	
	while(check)
	switch(value)
	{
	case 1:
		userDetails();
		break;
	case 2:
		System.out.println("Enter accountId");
		int accountId=scan.nextInt();
		System.out.println(perform.accountEnquiry(accountId));
		break;
		
	case 3:
		System.out.println("Enter customerId");
		int customerId=scan.nextInt();
		System.out.println(perform.customerEnquiry(customerId));
		break;
		
	case 4:
		System.out.println("Enter accountId");
		int accountId1=scan.nextInt();
	    perform.transactionDetail(accountId1);
         break;
      
   case 5:
	   System.out.println("Enter accountId");
		int accountId2=scan.nextInt();
		System.out.println(perform.loanEnquiry(accountId2));
		break;
		
   case 6:
	   System.out.println("Enter  sender accountId");
	   int senderAccountId=scan.nextInt();
	   System.out.println("Enter  receiver accountId");
	   int receiverAccountId=scan.nextInt();
	   System.out.println("Enter amount");
	   int amount=scan.nextInt();
	   perform.moneyTransfer(senderAccountId,receiverAccountId,amount);
	   break;
	   
   case 7:
	  Map<Integer,CustomerInformation> mapObj= perform.getCustomerDetails();
	  System.out.println(mapObj);
	  break;
	  
   case 8:
	   Map<Integer,AccountInformation> accountObj=perform.getAccountDetails();
	   System.out.println(accountObj);
	   break;
	   
   case 9:
	   perform.loanAccount();
	   System.out.println("Enter the accountId");
	   int accId=scan.nextInt();
	   scan.nextLine();
	   System.out.println("Enter the loan type");
	   String loanType=scan.nextLine();
	   perform.changeLoanStatus(accId,loanType);
	   break;
	   
   case 10:
	   perform.printTransaction();
	   break; 
 
   default :
		 check=false;
		 System.out.println("Enter the valid input!");    
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
 
public void loanOperation(int userName) throws CustomException
{
	boolean value=true;
	
	System.out.println("Enter the accountId");
	   int accId=scan.nextInt();
	   System.out.println( "Choose loanId"+
	     "Enter 1   for Education loan "
	   + "Enter  2  for  Home loan "
	   + "Enter 3   for Personal Loan "
	   + "Enter 4   for Gold loan ");
	   System.out.println("Enter the loanId");
	   int loanNumber=scan.nextInt();
	  
	   switch (loanNumber)
	   {
	   case 1:
		  String loanType="EducationLoan";
		  System.out.println("Enter the loan amount");
		  long amount3=scan.nextInt();
		  System.out.println("Enter the pan card details");
		  long pancard=scan.nextLong();
		  perform.applyLoan(accId,loanType,amount3,pancard);
	    break;
	   case 2:
		   String loanType1="HomeLoan";
		   long amount1=scan.nextInt();
		   System.out.println("Enter the pan card details");
			  long pancard1=scan.nextLong();
			  perform.applyLoan(accId,loanType1,amount1,pancard1);
		    break;  
	   case 3:
		   String loanType2="PersonalLoan";
		   long amount2=scan.nextInt();
		   System.out.println("Enter the pan card details");
			  long pancard2=scan.nextLong();
			  perform.applyLoan(accId,loanType2,amount2,pancard2);
		    break;  
	   case 4:
		   showOptions(userName);
	   
   default :
	         value=false;
			System.out.println("Enter the valid input!"); 
	 
	   
	}
}

public void showOptions(int userName) throws CustomException {
int option=0;
boolean choice=true;
System.out.println("1.Generate Account"
		+ "2.Check Balance"
		+"3.MoneyTransfer"
		+"4.Deposit"
		+"5.Withdraw"
		+"6.TransactionDetails"
		+"7.LoanOperation"
		+"8.LoanEnquiry"
		+"9.customerEnquiry"
		+"10.AccountEnquiry"
		+"11.CustomerMap"
		+"12.AccountMap");

while(choice)
{
try
{
	System.out.println("Enter the user operation to perform");
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
	perform.checkUserLogin(userName,fromAccountId);
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
	perform.checkUserLogin(userName,account);
	perform.transactionDetail(account);
	break;
	
case 7:
  loanOperation(userName) ;
 break;
 
case 8:
System.out.println("Enter the accountId");	
int accountId=scan.nextInt();
System.out.println(perform.loanEnquiry(accountId));
break;

case 9:
	int customerId=scan.nextInt();
	System.out.println(perform.customerEnquiry(customerId));
   break;
   
case 10:
	int acId=scan.nextInt();
	System.out.println(perform.accountEnquiry(acId));
    break;
    
case 11:  
       Map<Integer,CustomerInformation> mapObj= perform.getCustomerDetails();
	  System.out.println(mapObj);
	  break;
	  
 case 12:
	   Map<Integer,AccountInformation> accountObj=perform.getAccountDetails();
	   System.out.println(accountObj);
	   break;
	   
case 13:
	userDetails();
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
		 
		 Scanner scan=new Scanner(System.in);
		 boolean value=true;
	while(value) {
     System.out.print("Enter the login operations to perform");
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
 

 
 default :
	 value=false;
	 System.out.println("Enter the valid input!"); 
 
 }
}
		
}
}

