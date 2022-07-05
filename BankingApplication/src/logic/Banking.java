package logic;
//import java.util.HashMap;
import java.util.Map;

//import javax.management.MalformedObjectNameException;


import exception.CustomException;
import pack.AccountDetails;
import pack.CustomerDetails;
//import persistantLayer.Persistant;
public class Banking {
	//private static final CustomerDetails CustomerDetails = null;
	DataFile data=new DataFile();
	int customerId=0;
	int accountId=0;
    
    int accountBalance=0;
    long lastAccountNumber=0;
    int lastCustomerId=0;
    int lastAccountId=100;
    CustomerDetails cusInfo=new CustomerDetails();
    AccountDetails accInfo=new AccountDetails();
    Database db=new Database();
   


public void accountTransfer(int accountId,int receiverAccountId,int amount)
{

}
public void showCustomerDetails() throws Exception
{
Map<Integer, CustomerDetails> cusObj=data.readCustomerMap()	;
System.out.println(cusObj);
//cache.setCustomer(cusObj);
//System.out.println(cache.getCustomer());
}

public void showCustomerDetailsFromCache() throws Exception
{

//System.out.println(cache.getCustomer());
}


public Map<Integer,Map<Integer,AccountDetails>>  showAccountDetails() throws Exception
{
Map<Integer,Map<Integer,AccountDetails>> accountMap=data.readAccountMap();
System.out.println(accountMap);
//cache.setAccount(accountMap);
//System.out.println(cache.getAccount());
return accountMap;
}

public void showAccountDetailsFromCache() throws CustomException
{
	//System.out.println(cache.getAccount());
}

public void addCustomer(CustomerDetails customer)throws Exception
{
Map <Integer,CustomerDetails >  cusObj =data.addCustomer(customer);

db.addCustomer(customer);	
}

public  CustomerDetails getCustomerDetailsFile(int customerId)throws Exception
{
	
	return db.getCustomerDetails(customerId);
}
//public  CustomerDetails getCustomerDetailsCache(int customerId)throws Exception
//{
//	return cache.getCustomerDetails(customerId);
//}

public void addAccount(int customerId,AccountDetails accObj)throws Exception
{
	 Map<Integer,Map<Integer,AccountDetails>> customerAccount=data.addAccount(customerId,accObj);
	// cache.addAccount(customerAccount);
	 
	
}
 
public  AccountDetails getAccountDetailsFile(int customerId,int accountId)throws Exception
{
	return data.getAccountDetails(customerId, accountId);
}
//public AccountDetails getAccountDetailsFromCache(int customerId,int accountId)throws Exception
//		{
//	return cache.getAccountDetails(customerId, accountId);
//		}
// 
public Map<Integer,AccountDetails> getAccountFile(int customerId)throws Exception
{
 return data.getAccount(customerId);

}

//public Map<Integer,AccountDetails> getAccountCache(int customerId)throws Exception
//{
//
//return cache.getAccount(customerId);
//}
//
public void  depositAmount(int customerId,int accountId,int amount)throws Exception
{
AccountDetails accObj=data.depositAmount(customerId, accountId, amount);
data.setDepositAmount(customerId,accountId,accObj);
//cache.depositAmount(customerId, accountId, amount);
}


public void withdrawAmount(int customerId,int accountId,int amount)throws Exception
{
	AccountDetails accObj	=data.withdrawAmount(customerId, accountId, amount);
	//cache.withdrawAmount(customerId,accountId,amount);
	data.setWithdrawAmount(customerId,accountId,accObj);
	//cache.withdrawAmount(customerId, accountId, amount);
} 
 
public void changeCustomerStatus(int customerId, boolean status) throws Exception {
	
data.changeCustomerStatus(customerId,  status);
//cache.changeCustomerStatus(customerId,status);
}

public void changeStatus(int customerId, int accountId, boolean status) throws Exception {
	
data.changeStatus(customerId, accountId, status);
//cache.changeStatus(customerId,accountId,status);
}



public void fileCreation(String fileName) throws Exception
{

	//data.createFile(fileName);
}






}