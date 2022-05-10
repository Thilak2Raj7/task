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
import accountInformation.LoanDetails;

public class Cache {
	int customerId = 100;
	int accountId = 0;
	private static Map<Integer, CustomerInformation> mapObj = new HashMap<Integer, CustomerInformation>();
	private static Map<Integer, AccountInformation> accountMap = new HashMap<Integer, AccountInformation>();
	private static Map<Integer, List<TransactionDetails>> transactionMap = new HashMap<Integer, List<TransactionDetails>>();
	List<Integer> accountList = new ArrayList<Integer>();
	List<TransactionDetails> listObj = new ArrayList<TransactionDetails>();
	static Map<Integer, List> accountRelation = new HashMap<Integer, List>();
  static Map<Integer,Map<String,LoanDetails>> loanObj=new HashMap<Integer,Map<String,LoanDetails>>();
  static Map<String,LoanDetails> loanAccount=new HashMap<String,LoanDetails>();
//	public void dummy1() {
//	accountList.add(1);
//	accountRelation.put(101, accountList);
//	}
//	public void dummy2() {
//	accountList.add(2);
//	accountRelation.put(102, accountList);
//	}
  public Cache()
  {
   CustomerInformation cusObj=new CustomerInformation();
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter the userId");
   int userId=scan.nextInt();
   scan.nextLine();
    cusObj.setCustomerId(userId);
    cusObj.setRole(true);
    cusObj.setPassword("admin");
    mapObj.put(userId,cusObj);
	  
  }

	public int generateCustomerId() {
		customerId += 1;
		return customerId;
	}

	public int generateAccountId() {
		accountId += 1;
		return accountId;
	}

	public void checkCustomerId(int customerId) throws CustomException {
		if (mapObj.get(customerId) == null) {
			throw new CustomException("CustomerId doesnot exist");
		}
	}
	

	public Map<Integer, CustomerInformation> customerInfo(CustomerInformation customer) {
		customerId = generateCustomerId();
		customer.setCustomerId(customerId);

		mapObj.put(customerId, customer);
		return mapObj;
	}

	public Map<Integer, CustomerInformation> customerMap() {
		return mapObj;
	}

	public Map<Integer,AccountInformation> accountMap()
	{
		return accountMap;
	}
	public Map<Integer, AccountInformation> accountInfo(int customerId, AccountInformation account)
			throws CustomException {
		checkCustomerId(customerId);

		List listObj = accountRelation.get(customerId);
		if (listObj == null) {
			listObj = new ArrayList();
		}
		accountId = generateAccountId();
		account.setAccountId(accountId);
		listObj.add(accountId);
		accountRelation.put(customerId, listObj);
		accountMap.put(accountId, account);

		return accountMap;
	}

	public void checkAccountId(int accountId) throws CustomException {
		if (accountMap.get(accountId) == null) {
			throw new CustomException("AccountId doesnot exist");
		}
	}

	public int balanceEnquiry(int customerId) throws CustomException {
		System.out.println("Enter the accountId");
		Scanner scan = new Scanner(System.in);
		accountId = scan.nextInt();
		checkAccountId(accountId);
		AccountInformation account = accountMap.get(accountId);
		int balance = account.getAccountBalance();
		return balance;
	}

	public void depositAmount(int accountId, int amount) throws CustomException {
		AccountInformation account = accountMap.get(accountId);
		checkAccountId(accountId);
		int balance = account.getAccountBalance();
		if (amount > 100) {

			account.setAccountBalance(balance + amount);
			accountMap.put(accountId, account);

		} else {
			System.out.print("Amount should be   500 and above");
		}
	}

	public void withdrawAmount(int accountId, int amount) {
		AccountInformation account = accountMap.get(accountId);
		int balance = account.getAccountBalance();
		if (balance > amount && amount > 100) {
			account.setAccountBalance(balance - amount);
			accountMap.put(accountId, account);

		} else {
			System.out.print("Amount range should be within 100 and 50000");
		}
	}

	public void moneyTransfer(int fAccountId, int tAccountId, int amount) throws CustomException {
        checkAccountId(fAccountId);
        checkAccountId(tAccountId);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		withdrawAmount(fAccountId, amount);
		TransactionDetails obj1 = new TransactionDetails();
		AccountInformation account = accountMap.get(fAccountId);
		int balance = account.getAccountBalance();
		obj1.setAmount(amount);
		obj1.setBalance(balance);
		obj1.setSenderAccountId(fAccountId);

		obj1.setReceiverAccountId(tAccountId);
		obj1.setDate(formatter.format(date));
		List listObj1 = transactionMap.get(fAccountId);
		if (listObj1 == null) {
			listObj1 = new ArrayList<>();
			transactionMap.put(fAccountId, listObj1);
		}
		listObj1.add(obj1);

		depositAmount(tAccountId, amount);
		TransactionDetails obj = new TransactionDetails();
		AccountInformation account1 = accountMap.get(accountId);
		int balance1 = account1.getAccountBalance();
		obj.setAmount(amount);

		obj.setBalance(balance1);
		
		obj.setSenderAccountId(fAccountId);

		obj.setReceiverAccountId(tAccountId);

		obj.setDate(formatter.format(date));
		List listObj = transactionMap.get(tAccountId);
		if (listObj == null) {
			listObj = new ArrayList<>();
			transactionMap.put(tAccountId, listObj);

		}
		listObj.add(obj);
	}

	public void transactionHistory(int accountId) {
		List listObj = transactionMap.get(accountId);
		for (int i = listObj.size() - 1; i >= 0; i--) {
			System.out.println(listObj.get(i));

		}
	}

	public void checkUser(int userName, int loginId) throws CustomException {
		List accountList = accountRelation.get(userName);
		System.out.println(accountList);
		if (accountList.contains(loginId)) {
			System.out.print("login success");
		} else {
			throw new CustomException("Enter login credentials invalid!");
		}
	}

	public void loanCreation(String loanType,int accId,long amount,long panCard) throws CustomException
	{
		checkAccountId(accId);
		SimpleDateFormat form=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date obj1=new Date();
		
	  	LoanDetails obj=new LoanDetails();
	  	obj.setAccountId(accId);
	  	obj.setLoanAmount(amount);
	  	obj.setLoanType(loanType);
	    obj.setPanCardId(panCard);
	  	obj.setDate(form.format(obj1));
	  	loanAccount.put(loanType,obj);
	  	loanObj.put(accId, loanAccount);
		
	}
	public AccountInformation getAccountEnquiry(int accountId) throws CustomException
	{
		checkAccountId(accountId);
		AccountInformation account=accountMap.get(accountId);
		return account;
	}
	
public CustomerInformation getCustomerEnquiry(int customerId) throws CustomException
{
	checkCustomerId(customerId);
	CustomerInformation cusObj=mapObj.get(customerId);
	return cusObj;
	
}
	
public  Map<String,LoanDetails> getLoanEnquiry(int accountId) throws CustomException
{
	checkAccountId(accountId);
	Map<String,LoanDetails> loanAccount=loanObj.get(accountId);
	return loanAccount;
}

	public void applyLoan(int accId,String loanType,long amount,long panCardId) throws CustomException
	{
		checkAccountId(accId);
		Map<String,LoanDetails> loanAccount=loanObj.get(accId);
		if(loanAccount==null)
		{
		  loanCreation(loanType,accId,amount,panCardId);	
		}	
		else
		{
		for(String loan:loanAccount.keySet())
		{
			if(loan==loanType)
			{
				throw new CustomException("Sorry, you already have this loan");
			}
			else
			{
				loanCreation(loanType,accId,amount,panCardId);
			}
			
		}
		}
		
		
		
	}
	public void loanAccount(){
		System.out.println(loanObj);
	}

	public void changeLoanStatus(int accountId2,String loanType) throws CustomException {
		checkAccountId(accountId2);
		SimpleDateFormat form=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date obj1=new Date();
		checkAccountId(accountId2);
	Map<String,LoanDetails> loanAccount=loanObj.get(accountId2);
	LoanDetails obj=loanAccount.get(loanType);
	Scanner scan=new Scanner(System.in);

	
	System.out.println("Enter the status");
	String changeStatus=scan.nextLine();
	
	obj.setLoanStatus(changeStatus);
	System.out.println(form.format(obj1));
	obj.setDate(form.format(obj1));
	
	loanAccount.put(loanType,obj);
	//loanObj.put(accountId,loanAccount);
		
	}
	public void transaction()
	{
		System.out.println(transactionMap);
	}
}
