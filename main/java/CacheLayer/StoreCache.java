package CacheLayer;

import java.util.HashMap;
import java.util.Map;

import exception.CustomException;
//import logic.Banking;
import pack.AccountDetails;
import pack.CustomerDetails;

public class StoreCache {
	CustomerDetails cusInfo = new CustomerDetails();
	int accountBalance = 0;
static	Map<Integer, CustomerDetails> customerObject = new HashMap<Integer, CustomerDetails>();
static	Map<Integer, Map<Integer, AccountDetails>> accountObject = new HashMap<Integer, Map<Integer, AccountDetails>>();
	int customerId = 0;
	int accountId = 0;

	public void setCustomer(Map<Integer, CustomerDetails> customerMap) {
		// System.out.println(customerMap);
		customerObject = customerMap;
	}

	public void setAccount(Map<Integer, Map<Integer, AccountDetails>> accountMap) {

		accountObject = accountMap;
	}

	public Map<Integer, Map<Integer, AccountDetails>> getAccount() throws CustomException {

		return accountObject;
	}

	public Map<Integer, CustomerDetails> getCustomer() {
		return customerObject;
	}
	
	public void addCustomer(Map<Integer, CustomerDetails> customerMap)
	{
		customerObject=customerMap;
	}
	
	public void addAccount(Map<Integer,Map<Integer, AccountDetails>> accountMap)
	{
		accountObject=accountMap;
	}
	
	public CustomerDetails getCustomerDetails(int customerId)
	{
		return customerObject.get(customerId);
	}

	public void checkCustomerId(int customerId) throws CustomException {
		if (customerObject.get(customerId) == null) {
			throw new CustomException("CustomerId doesnot exist");
		}
	}

	public Map<Integer, AccountDetails> getAccount(int customerId) throws Exception {
		checkCustomerId(customerId);
		checkCustomerStatus(customerId);

		return accountObject.get(customerId);
	}
	public void checkStatus(AccountDetails accObj) throws CustomException {
		boolean status = accObj.isAccountStatus();
		if (status == false) {
			throw new CustomException("This account is deactivated and so kindly contact branch for do operation");
		}
	}

	public AccountDetails getAccountDetails(int customerId, int accountId) throws Exception {
		checkCustomerId(customerId);
		checkCustomerStatus(customerId);
	
		Map<Integer, AccountDetails> accountDet = accountObject.get(customerId);
		if (accountDet == null) {
			throw new CustomException("Account doesnot exist");
		}
		return accountDet.get(accountId);
	}

	public void checkCustomerStatus(int customerId) throws Exception {
		
		CustomerDetails customer = customerObject.get(customerId);

		boolean status = customer.isCustomerStatus();

		if (status == false) {
			throw new CustomException(
					"This customer account is deactivated and so kindly contact branch for activate the account");
		}

	}

	public void depositAmount(int customerId, int accountId, int amount) throws Exception {

		AccountDetails accObj = getAccountDetails(customerId, accountId);
		checkStatus(accObj);
		if (accObj == null)

		{
			throw new CustomException("Account doesnot exist");
		}

		accountBalance = accObj.getAccountBalance();
		accountBalance += amount;

		accObj.setAccountBalance(accountBalance);
		accountObject.get(customerId).put(accountId, accObj);

	}

	public void withdrawAmount(int customerId, int accountId, int amount) throws Exception {
		AccountDetails accObj = getAccountDetails(customerId, accountId);
		checkStatus(accObj);
		if (accObj == null)

		{
			throw new CustomException("Account doesnot exist");
		}

		accountBalance = accObj.getAccountBalance();
		checkStatus(accObj);
		accountBalance -= amount;

		accObj.setAccountBalance(accountBalance);

		accountObject.get(customerId).put(accountId, accObj);
	}
	
	public void changeStatus(int customerId, int accountId, boolean status) throws Exception {
		AccountDetails accObj = getAccountDetails(customerId, accountId);

		if (accObj == null)

		{
			throw new CustomException("Account doesnot exist");
		}

		boolean accountStatus = accObj.isAccountStatus();
		if (accountStatus != status) {
			accObj.setAccountStatus(status);
		accountObject.get(customerId).put(accountId,accObj);
		} else {
			System.out.println("account ");
			accountObject.get(customerId).put(accountId,accObj);
		}
	}
	
	public void changeCustomerStatus(int customerId, boolean custStatus) throws Exception {

		checkCustomerId(customerId);
		//Map<Integer, CustomerDetails> cusMap=customerObject;
		CustomerDetails customer = customerObject.get(customerId);
		boolean status = customer.isCustomerStatus();
		if (status != custStatus) {
			customer.setCustomerStatus(custStatus);
			customerObject.put(customerId, customer);
			
		}
		
	}

}

