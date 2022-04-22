package architectureLayer;

import java.util.HashMap;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import accountInformation.TransactionDetails;
import accountInformation.CustomerInformation;
import architectureLayer.CustomException;
import accountInformation.AccountInformation;
public class Cache {
	int customerId=100;
	int accountId=0;
	private static Map<Integer,CustomerInformation>  mapObj=new HashMap<Integer,CustomerInformation>(); 	
	private static Map<Integer,AccountInformation> accountMap = new HashMap<Integer,AccountInformation>();
	private static Map<Integer,List<TransactionDetails>> transactionMap=new HashMap<Integer,List<TransactionDetails>>();
	List<Integer> accountList=new ArrayList<Integer>();
	List<TransactionDetails> listObj=new ArrayList<TransactionDetails>();
	static Map<Integer,List> accountRelation=new HashMap<Integer,List> ();
	public int  generateCustomerId()
	{
	      customerId+=1;	
	     return customerId;
	}
	public int  generateAccountId()
	{
	      accountId+=1;	
	     return accountId;
	}
	public void checkCustomerId(int customerId) throws CustomException {
		if (mapObj.get(customerId) == null) {
			throw new CustomException("CustomerId doesnot exist");
		}
	}
	public Map<Integer,CustomerInformation> customerInfo(CustomerInformation customer)
	{
	customerId=generateCustomerId();
	customer.setCustomerId(customerId);

	mapObj.put(customerId,customer);
	return mapObj;	
	}
    
	public Map<Integer,CustomerInformation> customerMap()
	{
		return mapObj;
	}
	public  Map<Integer,AccountInformation>  accountInfo(int customerId, AccountInformation account) throws CustomException
	{
		checkCustomerId(customerId);
	
		List listObj=accountRelation.get(customerId);
         if(listObj==null)
         {
        	 listObj=new ArrayList();
         }
         accountId=generateAccountId();
 		account.setAccountId(accountId);
         listObj.add(accountId);
        accountRelation.put(customerId,listObj);
		accountMap.put(accountId, account);
		
		return accountMap; 
	}
public void checkAccountId(int accountId) throws CustomException
{
if(accountMap.get(accountId)==null)	
{
	throw new CustomException("AccountId doesnot exist");
}
}

public int balanceEnquiry(int customerId)
{
System.out.println("Enter the accountId");
Scanner scan=new Scanner(System.in);
accountId=scan.nextInt();
AccountInformation account=accountMap.get(accountId);
int balance=account.getAccountBalance();
return balance;
}
public void depositAmount(int accountId,int amount) throws CustomException
{
	AccountInformation account=accountMap.get(accountId);
     checkAccountId(accountId);
	int balance=account.getAccountBalance();
	if(amount>100)
	{
	
    account.setAccountBalance(balance+amount);
	accountMap.put(accountId, account);
	
	

	
    
	
}
	else
	{
		System.out.print("Amount should be   500 and above");
	}
}
public void withdrawAmount(int accountId,int amount)
{
	AccountInformation account=accountMap.get(accountId);
	int balance=account.getAccountBalance();
	if(balance> amount && amount >100)
	{
    account.setAccountBalance(balance-amount);
	accountMap.put(accountId, account);
	
	
    
	

   }
	else
	{
		System.out.print("Amount range should be within 100 and 50000");
	}
}

public void moneyTransfer(int fAccountId,int tAccountId,int amount) throws CustomException
{
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();
		withdrawAmount(fAccountId,amount);
		TransactionDetails obj1=new TransactionDetails();
		AccountInformation account=accountMap.get(fAccountId);
		int balance =account.getAccountBalance();
		obj1.setAmount(amount);
		obj1.setBalance(balance);
		obj1.setTransType("To");
		obj1.setAccountId(tAccountId);
		obj1.setDate(formatter.format(date));
		List listObj1=transactionMap.get(fAccountId);
	    if(listObj1==null)
	    {
	    	listObj1=new ArrayList<>();
	    	transactionMap.put(fAccountId, listObj1);
	    }
	    listObj1.add(obj1);
	    
	    
	depositAmount(tAccountId,amount);
	TransactionDetails obj=new TransactionDetails();
	AccountInformation account1=accountMap.get(accountId);
	int balance1 =account1.getAccountBalance();
	obj.setAmount(amount);
	
	obj.setBalance(balance1);
	obj.setTransType("from");
	obj.setAccountId(fAccountId);

    
    obj.setDate(formatter.format(date)); 
    List listObj=transactionMap.get(tAccountId);
    if(listObj==null)
    {
    	listObj=new ArrayList<>();
    	transactionMap.put(tAccountId, listObj);

    }
    listObj.add(obj);
        
    
 
}
 public List<TransactionDetails> transactionHistory(int accountId)
{
	List listObj=transactionMap.get(accountId);
   return listObj;
}
}

