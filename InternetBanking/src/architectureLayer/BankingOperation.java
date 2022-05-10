package architectureLayer;
import accountInformation.CustomerInformation;
import accountInformation.LoanDetails;
import architectureLayer.Cache;
import accountInformation.AccountInformation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import accountInformation.TransactionDetails;
import accountInformation.CustomerInformation;
public class BankingOperation {
	Cache storage=new Cache();

	
	
	public Map<Integer,CustomerInformation>  customerInfo(CustomerInformation customer)
	{
		
		return storage.customerInfo(customer) ;
	}
	
	public Map<Integer,AccountInformation>  accountInfo(int customerId,AccountInformation account) throws CustomException
	{
		return storage.accountInfo(customerId, account);
	}
	
public int  checkBalance(int userName) throws CustomException
{
  return storage.balanceEnquiry(userName);
}
public Map<Integer,CustomerInformation> getCustomerDetails()
{
	return storage.customerMap();
}

public Map<Integer,AccountInformation> getAccountDetails()
{
	return storage.accountMap();
}
		

public void moneyTransfer(int accountId,int accountId2,int amount) throws CustomException
{
storage.moneyTransfer(accountId,accountId2,amount);
	
}

public void depositAmount(int accountId,int amount) throws CustomException
{
storage.depositAmount(accountId, amount);	
}
public void withdrawAmount(int accountId,int amount)
{
storage.withdrawAmount(accountId, amount);	
}
public  void transactionDetail(int accountId) 
{
	 storage.transactionHistory(accountId);
	
}


public void checkUserLogin(int customerId,int accountId) throws CustomException
{
	storage.checkUser(customerId,accountId);
}
public void applyLoan(int accId,String loanType,long amount,long panCard) throws CustomException {
	
	storage.applyLoan(accId,loanType,amount,panCard);
}
public Map<String,LoanDetails> loanEnquiry(int accountId) throws CustomException{
  
  return storage.getLoanEnquiry(accountId);
}


public AccountInformation accountEnquiry(int accountId) throws CustomException
{
return storage.getAccountEnquiry(accountId);	
}
public CustomerInformation customerEnquiry(int customerId) throws CustomException
{
	return storage.getCustomerEnquiry(customerId);
}

public void changeLoanStatus(int accountId,String loanType) throws CustomException
{
	
	storage.changeLoanStatus(accountId,loanType);
}

public void loanAccount(){
	storage.loanAccount();
}

public void printTransaction()
{
	storage.transaction();
}

public void stringCheck(String name) throws CustomException
{
if(name.equals("") && name.isEmpty())	
{
	throw new CustomException("Entered value is null or empty");
}
}


public void ObjectCheck(Object obj)throws CustomException
{
	if(obj==null)
	{
		throw new CustomException("Entered value is null or empty");
	}
	}

}
	
