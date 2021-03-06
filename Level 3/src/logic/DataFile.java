package logic;

import pack.*;

import exception.CustomException;


import java.io.*;

import java.util.HashMap;
import java.util.Map;

import utilityclass.Utility;

public class DataFile {

	int customerId = 0;
	int accountId = 100;
	int accountBalance = 0;
	int lastCustomerId = 0;
	int lastAccountId = 100;

	
	public void createFile(String fileName) throws Exception {
		
		Utility.checkString(fileName);

		File myfile = new File("TRK.txt");

		if (myfile.createNewFile()) {
			System.out.println("New File Created");
		} else {
			System.out.println("File alreaady existed");
		}

	}

	public void writeCustomerMap(Map<Integer, CustomerDetails> cusObj) throws Exception {

	
		try (

				FileOutputStream stream = new FileOutputStream("CustomerInformation.txt");
				ObjectOutputStream obj = new ObjectOutputStream(stream);)

		{

			obj.writeObject(cusObj);
			obj.writeObject(lastCustomerId);
		}
	}

	public void writeAccountMap(Map<Integer, Map<Integer, AccountDetails>> accountObject) throws Exception {
		try (

				FileOutputStream stream = new FileOutputStream("AccountInformation.txt");
				ObjectOutputStream obj = new ObjectOutputStream(stream);) {

			obj.writeObject(accountObject);
			obj.writeObject(lastAccountId);
		}
	}

	public Map<Integer, CustomerDetails> readCustomerMap() throws Exception {
		// File createFile=createFile(filePath,fileName);

		File object = new File("CustomerInformation.txt");

		Map<Integer, CustomerDetails> cusObj = new HashMap<Integer, CustomerDetails>();
		if (object.exists()) {
			try (FileInputStream input = new FileInputStream(object);
					ObjectInputStream obStream = new ObjectInputStream(input);) {

				cusObj = (Map<Integer, CustomerDetails>) obStream.readObject();

				lastCustomerId = (int) obStream.readObject();

			}

		}
		return cusObj;
	}

	public Map<Integer, Map<Integer, AccountDetails>> readAccountMap() throws Exception {

		File objectFile = new File("/home/inc1/eclipse-workspace/AccountInformation.txt");
		Map<Integer, Map<Integer, AccountDetails>> accountMap = new HashMap<Integer, Map<Integer, AccountDetails>>();
		if (objectFile.exists()) {
			try (

					FileInputStream input = new FileInputStream(objectFile);

					ObjectInputStream obStream = new ObjectInputStream(input);) {

				accountMap = (Map<Integer, Map<Integer, AccountDetails>>) obStream.readObject();
				// logic.customerAccount=accountMap;
				lastAccountId = (int) obStream.readObject();

			}
		}
		return accountMap;
	}

	public int readCustomerId(String fileName) throws Exception {
		try (

				FileInputStream input = new FileInputStream(fileName);
				ObjectInputStream obStream = new ObjectInputStream(input);) {

			return lastCustomerId = (int) obStream.readObject();
		}

	}

	public int readAccountId(String fileName) throws Exception // logic.lastCustomerId=lastCustomerId;
	{
		try (

				FileInputStream input = new FileInputStream(fileName);
				ObjectInputStream obStream = new ObjectInputStream(input);) {
			return lastAccountId = (int) obStream.readObject();
		}

	}

	public void checkCustomerId(int customerId) throws Exception {
		if (readCustomerMap().get(customerId) == null) {
			throw new CustomException("CustomerId doesnot exist");
		}
	}

	public CustomerDetails getCustomerDetails(int customerId) throws Exception {
//CustomerDetails customerObj=new CustomerDetails();
		// customerId=cusInfo.getCustomerId();
		checkCustomerId(customerId);
		checkCustomerStatus(customerId);
		return readCustomerMap().get(customerId);
	}

	public Map<Integer, CustomerDetails> addCustomer(CustomerDetails cusInfo) throws Exception {

		System.out.println(cusInfo);
		Map<Integer, CustomerDetails> cusObj = readCustomerMap();

		customerId = generateCustomerId();
		cusInfo.setCustomerId(customerId);
		cusObj.put(customerId, cusInfo);
		writeCustomerMap(cusObj);
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
			throws Exception {

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
		writeAccountMap(account);

		return account;
	}

	public AccountDetails getAccountDetails(int customerId, int accountId) throws Exception {
		checkCustomerId(customerId);
		checkCustomerStatus(customerId);
		Map<Integer, Map<Integer, AccountDetails>> accountMap = readAccountMap();
		Map<Integer, AccountDetails> accountDet = accountMap.get(customerId);
		if (accountDet == null) {
			throw new CustomException("Account doesnot exist");
		}

		return accountDet.get(accountId);

	}

	public Map<Integer, AccountDetails> getAccount(int customerId) throws Exception {
		checkCustomerId(customerId);
		checkCustomerStatus(customerId);

		return readAccountMap().get(customerId);
	}

	public AccountDetails depositAmount(int customerId, int accountId, int amount) throws Exception {
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

	public void setDepositAmount(int customerId, int accountId, AccountDetails accObj) throws Exception {
		Map<Integer, Map<Integer, AccountDetails>> accMap = readAccountMap();
		accMap.get(customerId).put(accountId, accObj);
		writeAccountMap(accMap);
	}

	public AccountDetails withdrawAmount(int customerId, int accountId, int amount) throws Exception {
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
		accountBalance -= amount;

		accObj.setAccountBalance(accountBalance);

		return accObj;
	}

	public void setWithdrawAmount(int customerId, int accountId, AccountDetails accObj) throws Exception {
		Map<Integer, Map<Integer, AccountDetails>> accMap = readAccountMap();
		accMap.get(customerId).put(accountId, accObj);
		writeAccountMap(accMap);
	}

	public void changeCustomerStatus(int customerId, boolean custStatus) throws Exception {

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

	public void checkCustomerStatus(int customerId) throws Exception {
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

	public void changeStatus(int customerId, int accountId, boolean status) throws Exception {
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

}
