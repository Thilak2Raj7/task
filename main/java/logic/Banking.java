package logic;

import java.sql.SQLException;
import java.util.Map;

//import javax.management.MalformedObjectNameException;

import CacheLayer.StoreCache;
import exception.CustomException;
import pack.AccountDetails;
import pack.CustomerDetails;

public class Banking {
	
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
    StoreCache cache=new StoreCache();

public void updateCustomer(int customerId,CustomerDetails cusObj) throws CustomException
{
	data.updateCustomer(customerId, cusObj);
}

public Map <Integer,CustomerDetails > showCustomerDetails() throws CustomException
{
Map<Integer, CustomerDetails> cusObj=data.readCustomerMap()	;
System.out.println(cusObj);
cache.setCustomer(cusObj);
return cusObj;
//System.out.println(cache.getCustomer());
}

public void showCustomerDetailsFromCache() throws CustomException
{

System.out.println(cache.getCustomer());
}

public void accountTransfer(int accountId,int amount,int SenderAccountId) throws CustomException
{
	data.accounttransfer(accountId, amount,SenderAccountId);	
}


public Map<Integer,Map<Integer,AccountDetails>>  showAccountDetails() throws CustomException
{
Map<Integer,Map<Integer,AccountDetails>> accountMap=data.readAccountMap();
System.out.println(accountMap);
cache.setAccount(accountMap);
return accountMap;
//System.out.println(cache.getAccount());
}

public void showAccountDetailsFromCache() throws CustomException
{
	System.out.println(cache.getAccount());
}

public Map <Integer,CustomerDetails > addCustomer(CustomerDetails customer)throws CustomException
{
Map <Integer,CustomerDetails >  cusObj =data.addCustomer(customer);
cache.addCustomer(cusObj);
db.addCustomer(customer);
return cusObj;
}

public  CustomerDetails getCustomerDetailsFile(int customerId)throws CustomException, SQLException
{
	 //data.getCustomerDetails(customerId);
	return db.getCustomerDetails(customerId);
}
public  CustomerDetails getCustomerDetailsCache(int customerId)throws CustomException
{
	return cache.getCustomerDetails(customerId);
}

public Map<Integer,Map<Integer,AccountDetails>> addAccount(int customerId,AccountDetails accObj)throws CustomException
{
	 Map<Integer,Map<Integer,AccountDetails>> customerAccount=data.addAccount(customerId,accObj);
	 cache.addAccount(customerAccount);	
	return customerAccount;
}

public void updateMap(int accountId,int customerId,AccountDetails accObj)throws CustomException
{
	data.updateAccount( accountId,customerId,accObj);
	
}
 
public  AccountDetails getAccountDetailsFile(int customerId, int accountId)throws CustomException
{
	return data.getAccountDetails( customerId,accountId);
}


public AccountDetails getAccountDetailsFromCache(int customerId,int accountId)throws CustomException
		{
	return cache.getAccountDetails(customerId, accountId);
		}
 
public Map<Integer,AccountDetails> getAccountFile(int customerId)throws CustomException
{
 return data.getAccount(customerId);

}

public Map<Integer,AccountDetails> getAccountCache(int customerId)throws CustomException
{

return cache.getAccount(customerId);
}

public void  depositAmount(int customerId ,int accountId,int amount)throws CustomException
{
if(amount>0)
{
AccountDetails accObj=data.depositAmount(customerId ,accountId, amount);
data.setDepositAmount(customerId,accountId,accObj);
cache.depositAmount(customerId, accountId, amount);
}
throw new CustomException("Enter valid amount");
}



public void withdrawAmount(int customerId,int accountId,int amount)throws CustomException
{
	
	AccountDetails accObj	=data.withdrawAmount(customerId, accountId, amount);
	//cache.withdrawAmount(customerId,accountId,amount);
	data.setWithdrawAmount(customerId,accountId,accObj);
	cache.withdrawAmount(customerId, accountId, amount);
} 
 
public void changeCustomerStatus(int customerId, boolean status) throws CustomException {
	
data.changeCustomerStatus(customerId,  status);
cache.changeCustomerStatus(customerId,status);
}

public void changeStatus(int customerId, int accountId, boolean status) throws CustomException {
	
data.changeStatus(customerId, accountId, status);
cache.changeStatus(customerId,accountId,status);
}



public void fileCreation() throws CustomException
{

	data.createFile();
}

public void deposit(int accountId,int amount) throws CustomException
{
	data.deposit(accountId, amount);
	
}

public void withdraw(int accountId,int amount) throws CustomException
{
	data.withdraw(accountId, amount);
	
}
public void  storeUserInfo(Integer name,String password) throws CustomException
{
data.storeUserInfo(name,password);


}

public Map<Integer, String> readUserInfo() throws CustomException
{
 return data.readUserInfoMap();	

}
}
