package architectureLayer;
import accountInformation.CustomerInformation;
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
	
public int  checkBalance(int userName)
{
  return storage.balanceEnquiry(userName);
}
public Map<Integer,CustomerInformation> getCustomerDetails()
{
	return storage.customerMap();
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
public  List<TransactionDetails> transactionDetail(int accountId) 
{
	return storage.transactionHistory(accountId);
	
}
}

	
