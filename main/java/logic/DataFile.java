package logic;

import pack.*;

import exception.CustomException;


import java.io.*;
import java.lang.reflect.AccessibleObject;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.eclipse.jdt.internal.compiler.lookup.TypeConstants.BoundCheckStatus;

import utilityclass.Utility;

public class DataFile {

	int customerId = 0;
	int accountId = 100;
	int accountBalance = 0;
	int lastCustomerId = 0;
	int lastAccountId = 100;
    int userId=0;
	int lastUserId=0;
	public void createFile() throws CustomException {
		
	

		File myfile = new File("UserInfo.txt");
try {
		if (myfile.createNewFile()) {
			System.out.println("New File Created");
		} else {
			System.out.println("File alreaady existed");
		}
}
		catch (IOException e) 
		{
	             throw new CustomException("File Writing is failed.");
		}

	}

	public void writeCustomerMap(Map<Integer, CustomerDetails> cusObj) throws CustomException {

	
		try (

				FileOutputStream stream = new FileOutputStream("/home/inc1/eclipse-workspace/OnlineBanking/CustomerInfo.txt");
				ObjectOutputStream obj = new ObjectOutputStream(stream);)

		{

			obj.writeObject(cusObj);
			obj.writeObject(lastCustomerId);
		}
		catch (IOException e) 
		{
	             throw new CustomException("File Writing is failed.");
		}
	}

	public void writeAccountMap(Map<Integer, Map<Integer, AccountDetails>> accountObject) throws CustomException {
		
		
		try (

				FileOutputStream stream = new FileOutputStream("/home/inc1/eclipse-workspace/OnlineBanking/AccountInfo.txt");
				ObjectOutputStream obj = new ObjectOutputStream(stream);) {

			obj.writeObject(accountObject);
			obj.writeObject(lastAccountId);
		} 
		catch (IOException e) 
		{
	             throw new CustomException("File Writing is failed.");
		}
	}

	public Map<Integer, CustomerDetails> readCustomerMap() throws CustomException {
		// File createFile=createFile(filePath,fileName);

		File object = new File("/home/inc1/eclipse-workspace/OnlineBanking/CustomerInfo.txt");

		Map<Integer, CustomerDetails> cusObj = new HashMap<Integer, CustomerDetails>();
		if (object.exists()) {
			try (FileInputStream input = new FileInputStream(object);
					ObjectInputStream obStream = new ObjectInputStream(input);) {

				cusObj = (Map<Integer, CustomerDetails>) obStream.readObject();

				lastCustomerId = (int) obStream.readObject();
				System.out.println(cusObj);
			}
			catch (IOException e) 
			{
		             throw new CustomException("File Writing is failed.");
			}
			catch (ClassNotFoundException e) 
			{
		             throw new CustomException("Page cannot be found");
			}
		}
		return cusObj;
	
	}

	public Map<Integer, Map<Integer, AccountDetails>> readAccountMap() throws CustomException {

	File objectFile = new File("/home/inc1/eclipse-workspace/OnlineBanking/AccountInfo.txt");
		Map<Integer, Map<Integer, AccountDetails>> accountMap = new HashMap<Integer, Map<Integer, AccountDetails>>();
		if (objectFile.exists()) {
			try (

					FileInputStream input = new FileInputStream(objectFile);

					ObjectInputStream obStream = new ObjectInputStream(input);) {

				accountMap = (Map<Integer, Map<Integer, AccountDetails>>) obStream.readObject();
				// logic.customerAccount=accountMap;
				lastAccountId = (int) obStream.readObject();

			}
			catch (IOException e) 
			{
		             throw new CustomException("File Writing is failed.");
			}
			catch (ClassNotFoundException e) 
			{
		             throw new CustomException("Page cannot be found");
			}
		}
		
		System.out.println("this is file"+accountMap);
		return accountMap;
	}

	

	public void checkCustomerId(int customerId) throws CustomException {
		if (readCustomerMap().get(customerId) == null) {
			throw new CustomException("CustomerId doesnot exist");
		}
		
	}

	public CustomerDetails getCustomerDetails(int customerId) throws CustomException {
try {
		checkCustomerId(customerId);
		checkCustomerStatus(customerId);
		
	}
catch (CustomException e) {
	System.out.println("Enter valid customerId");

}
return readCustomerMap().get(customerId);
	}
	public Map<Integer, CustomerDetails> addCustomer(CustomerDetails cusInfo) throws CustomException {

		System.out.println(cusInfo);
		Map<Integer, CustomerDetails> cusObj = readCustomerMap();

		customerId = generateCustomerId();
		cusInfo.setCustomerId(customerId);
		cusObj.put(customerId, cusInfo);
		writeCustomerMap(cusObj);
		System.out.println(cusObj);
		// checkCustomerStatus(customerId);
		return cusObj;

	}

	public int generateCustomerId() {
		lastCustomerId = lastCustomerId + 1;
		customerId = lastCustomerId;
		return customerId;
	}



	public int generateAccountId() {
		lastAccountId = lastAccountId + 1;
		accountId = lastAccountId;
		return accountId;
	}

	public Map<Integer, Map<Integer, AccountDetails>> addAccount(int customerId, AccountDetails accObj)
			throws CustomException {

		checkCustomerId(customerId);
		checkCustomerStatus(customerId);
		// checkStatus(accObj);
		System.out.println(accObj);
		// Map<Integer,CustomerDetails> cusObj=readCustomerMap();
		Map<Integer, Map<Integer, AccountDetails>> account = readAccountMap();
		System.out.println(account);
		Map<Integer, AccountDetails> accountMap = account.get(customerId);

		if (accountMap == null) {
			accountMap = new HashMap<Integer, AccountDetails>();
			// accountMap.put(accId,accObj);
			account.put(customerId, accountMap);
		}

		accountId = generateAccountId();
		accObj.setAccountId(accountId);

		accountMap.put(accountId, accObj);
		System.out.println(account);
		writeAccountMap(account);

		return account;
	}

	public AccountDetails getAccountDetails(int customerId, int accountId) throws CustomException {
		checkCustomerId(customerId);
		checkCustomerStatus(customerId);
		Map<Integer, Map<Integer, AccountDetails>> accountMap = readAccountMap();
		Map<Integer, AccountDetails> accountDet = accountMap.get(customerId);
		if (accountDet == null) {
			throw new CustomException("Account doesnot exist");
		}

		return accountDet.get(accountId);

	}

	public Map<Integer, AccountDetails> getAccount(int customerId) throws CustomException {
		checkCustomerId(customerId);
		checkCustomerStatus(customerId);

		return readAccountMap().get(customerId);
	}
	
	public void updateAccount(int accountId,int customerId,AccountDetails accObj) throws CustomException
	{
	Map<Integer, Map<Integer, AccountDetails>> accountMap=readAccountMap();

	Map<Integer,AccountDetails> accMap=accountMap.get(customerId);
	accMap.put(accountId, accObj);
	accountMap.put(customerId, accMap);
	writeAccountMap(accountMap);
	
	}
	public void updateCustomer(int customerId,CustomerDetails cusObj) throws CustomException
	{
	 Map<Integer,CustomerDetails >customerMap=readCustomerMap();

    customerMap.put(customerId, cusObj);
    writeCustomerMap(customerMap);
	
	}

	public AccountDetails depositAmount(int customerId, int accountId, int amount) throws CustomException {
		checkCustomerId(customerId);
		checkCustomerStatus(customerId);
		AccountDetails accObj = getAccountDetails(customerId, accountId);
		if (accObj == null)

		{
			throw new CustomException("Account doesnot exist");
		}
		checkStatus(accObj);
		accountBalance = accObj.getAccountBalance();
		accountBalance += amount;

		accObj.setAccountBalance(accountBalance);
		return accObj;
	}

	public void setDepositAmount(int customerId, int accountId, AccountDetails accObj) throws CustomException {
		Map<Integer, Map<Integer, AccountDetails>> accMap = readAccountMap();
		accMap.get(customerId).put(accountId, accObj);
		writeAccountMap(accMap);
	}

	public AccountDetails withdrawAmount(int customerId, int accountId, int amount) throws CustomException {
		checkCustomerId(customerId);
		checkCustomerStatus(customerId);

		AccountDetails accObj = getAccountDetails(customerId, accountId);
		if (accObj == null)

		{
			throw new CustomException("Account doesnot exist");
		}
		checkStatus(accObj);
		accountBalance = accObj.getAccountBalance();
		checkStatus(accObj);
		if(amount>accountBalance)
		{
		throw new CustomException("Check balance and enter valid amount");	
		}
		else
		{
		accountBalance -= amount;
        accObj.setAccountBalance(accountBalance);
		}
		return accObj;
	}

	public void setWithdrawAmount(int customerId, int accountId, AccountDetails accObj) throws CustomException {
		Map<Integer, Map<Integer, AccountDetails>> accMap = readAccountMap();
		accMap.get(customerId).put(accountId, accObj);
		writeAccountMap(accMap);
	}

	public void accounttransfer(int accountId,int amount,int SenderAccountId) throws CustomException
	{
		Map<Integer, Map<Integer, AccountDetails>> accMap = readAccountMap();	
		for(Integer customerId:accMap.keySet())
		{
			checkCustomerStatus(customerId);
			Map<Integer,AccountDetails> accountMap=accMap.get(customerId);
			if(accountMap.containsKey(SenderAccountId))
			{
				
				AccountDetails object=accountMap.get(SenderAccountId);
				checkStatus(object);
				int balance=object.getAccountBalance();
				if(balance>amount)
				{
				accountBalance=balance-amount;
						object.setAccountBalance(accountBalance);
				 				accountMap.put(SenderAccountId, object);
				 				accMap.put(customerId, accountMap);
								writeAccountMap(accMap);	
			}
				else {
					throw new CustomException("Enter the valid amount");
				}
			}
			if(accountMap.containsKey(accountId))
			{
			AccountDetails object=accountMap.get(accountId);
			checkStatus(object);
			accountBalance=amount+object.getAccountBalance();
					object.setAccountBalance(accountBalance);
			 				accountMap.put(accountId, object);
			 				accMap.put(customerId, accountMap);
							writeAccountMap(accMap);
			}
			
		}
		
			
		
	}
	
	public void deposit(int accountId,int amount) throws CustomException
	{
		Map<Integer, Map<Integer, AccountDetails>> accMap = readAccountMap();	
		for(Integer customerId:accMap.keySet())
		{
			checkCustomerStatus(customerId);
			Map<Integer,AccountDetails> accountMap=accMap.get(customerId);
			if(accountMap.containsKey(accountId))
			{
		     AccountDetails object=accountMap.get(accountId);
			 checkStatus(object);
			if(amount>100)
			{
			accountBalance=amount+object.getAccountBalance();
					object.setAccountBalance(accountBalance);
			 				accountMap.put(accountId, object);
			 				accMap.put(customerId, accountMap);
							writeAccountMap(accMap);
			}
				else {
					
					throw new CustomException("Enter the valid amount");
			}
			}
		}
	}
	public void withdraw(int accountId,int amount) throws CustomException
	{
		Map<Integer, Map<Integer, AccountDetails>> accMap = readAccountMap();	
		for(Integer customerId:accMap.keySet())
		{
			checkCustomerStatus(customerId);
			Map<Integer,AccountDetails> accountMap=accMap.get(customerId);
			if(accountMap.containsKey(accountId))
			{
				
				if(amount>100)
				{
			
			AccountDetails object=accountMap.get(accountId);
			checkStatus(object);
			int balance=object.getAccountBalance();
			if(balance>amount)
			{
			accountBalance=balance-amount;
			
					object.setAccountBalance(accountBalance);
			 				accountMap.put(accountId, object);
			 				accMap.put(customerId, accountMap);
							writeAccountMap(accMap);
			}
			else {
				
				throw new CustomException("Enter the valid amount");
		}
				}
			else {
				
					throw new CustomException("Enter the valid amount");
			}
			}
		}	
	}
	public void changeCustomerStatus(int customerId, boolean custStatus) throws CustomException {

		checkCustomerId(customerId);
		Map<Integer, CustomerDetails> cusMap = readCustomerMap();
		CustomerDetails customer = cusMap.get(customerId);
		boolean status = customer.isCustomerStatus();
		if (status != custStatus) {
			customer.setCustomerStatus(custStatus);
			cusMap.put(customerId, customer);
			writeCustomerMap(cusMap);
		}

	}

	public void checkCustomerStatus(int customerId) throws CustomException {
		Map<Integer, CustomerDetails> custMap = readCustomerMap();
		CustomerDetails customer = custMap.get(customerId);

		boolean status = customer.isCustomerStatus();

		if (status == false) {
			throw new CustomException(
					"This customer account is deactivated and so kindly contact branch for activate the account");
		}

	}

	public void checkStatus(AccountDetails accObj) throws CustomException {
		boolean status = accObj.isAccountStatus();
		if (status == false) {
			throw new CustomException("This account is deactivated and so kindly contact branch for do operation");
		}
	}

	public void changeStatus(int customerId, int accountId, boolean status) throws CustomException {
		AccountDetails accObj = getAccountDetails(customerId, accountId);
		Map<Integer, Map<Integer, AccountDetails>> accountMap = readAccountMap();
		if (accObj == null)

		{
			throw new CustomException("Account doesnot exist");
		}

		boolean accountStatus = accObj.isAccountStatus();
		if (accountStatus != status) {
			accObj.setAccountStatus(status);

			accountMap.get(customerId).put(accountId, accObj);
			writeAccountMap(accountMap);
		} else {
			System.out.println("account ");
			accountMap.get(customerId).put(accountId, accObj);
		}
	}
 
	public int generateUserId()
	{
	lastUserId=	lastUserId+1;
	userId=lastUserId;
    return userId;
	}
public void storeUserInfo(Integer name,String password) throws CustomException
{
	    Map<Integer,String > userInfo=readUserInfoMap();
		
		userInfo.put(name, password);
		  writeUserInfoMap(userInfo);
}
	public void writeUserInfoMap(  Map<Integer,String> userInfo) throws CustomException {

		
		try (

				FileOutputStream stream = new FileOutputStream("/home/inc1/eclipse-workspace/OnlineBanking/CustomerDB.txt");
				ObjectOutputStream obj = new ObjectOutputStream(stream);)
		{

			obj.writeObject(userInfo);
			obj.writeObject(lastUserId);
		}
		
		catch(IOException e)
		{
		System.out.println("Enter valid userId and password");	
		}
		
	}
	public    Map<Integer,String > readUserInfoMap() throws CustomException {
		File createFile=new File("/home/inc1/eclipse-workspace/OnlineBanking/CustomerDB.txt");
        if(!createFile.exists())
        {
              Map<Integer,String > userInfoMap=new HashMap <Integer,String >();
        	try {
				createFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Enter valid userId and password");	
			}
        	writeUserInfoMap(userInfoMap);
        	
        }
		File myFile = new File("/home/inc1/eclipse-workspace/OnlineBanking/CustomerDB.txt");

		  Map<Integer,String> infoObj = new HashMap<Integer,String >();
			try (FileInputStream input = new FileInputStream(myFile);
					ObjectInputStream obStream = new ObjectInputStream(input);) {

				infoObj = (   Map<Integer,String >) obStream.readObject();

				lastUserId = (int) obStream.readObject();
				System.out.println(infoObj);
		}
			catch(IOException e)
			{
			System.out.println("Enter valid userId and password");	
			}
			catch(ClassNotFoundException e)
			{
			System.out.println("Enter valid userId and password");	
			}
			
		return infoObj;
	
	}

}

