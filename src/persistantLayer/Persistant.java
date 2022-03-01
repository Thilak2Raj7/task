package persistantLayer;

import java.util.Map;
import exception.CustomException;
import logic.Banking;
import pack.AccountDetails;
import pack.CustomerDetails;

public interface Persistant{
	void checkCustomerId(int customerId) throws CustomException;

	CustomerDetails getCustomerDetails(int customerId) throws CustomException;

	Map<Integer, CustomerDetails> customerDetails(int customerId, CustomerDetails cusInfo) throws CustomException;

	Map<Integer, Map<Integer, AccountDetails>> accountDetails(int customerId, int accountId, AccountDetails accObj)throws CustomException;

	 AccountDetails getAccountDetails(int customerId, int accountId) throws CustomException;

	 Map<Integer, AccountDetails> getAccount(int customerId) throws CustomException;

	 AccountDetails depositAmount(int customerId, int accountId, int amount) throws CustomException;

	 AccountDetails withdrawAmount(int customerId, int accountId, int amount) throws CustomException;

	 CustomerDetails changeCustomerStatus(int customerId, boolean custStatus) throws CustomException;

	 void checkCustomerStatus(int customerId) throws CustomException;

	 void checkStatus(AccountDetails accObj) throws CustomException;

	 AccountDetails changeStatus(int customerId, int accountId, boolean status) throws CustomException;

	 void readData(String fileName, Banking logic, int lastCustomerId, int lastAccountId,long lastAccountNumber) throws Exception;

	 void writeData(String fileName, Map<Integer, Map<Integer, AccountDetails>> accountData,int lastCustomerId, int lastAccountId,long lastAccountNumber);
		
	 //Map<Integer, CustomerDetails> customerInfo)throws Exception;
	
}
