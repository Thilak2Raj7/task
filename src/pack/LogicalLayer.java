package pack;
import java.util.*;
import java.io.*;
import exception.CustomException;

public class LogicalLayer {
	
	static Map<Integer,Object> cusObj=new HashMap();
    static Map<Integer,Map<Integer,Object>>customerAccount=new HashMap();
	int customerId=0;
	int accountId=100;
	int numgenerated=0;
	
public void customerIdCheck(int customerId)throws CustomException
{
if(cusObj.get(customerId) == null)
{
	throw new  CustomException("customerId doesnot exist");
}
}

/*public void accountIdCheck(int accountId)throws CustomException
{
if(newMapObj.get(accountId) == null)
{
	throw new  CustomException("accountId doesnot exist");
}
}*/

public Map<Integer,Object> customerDetails(CustomerDetails cusInfo)
{
int cusId=cusInfo.getCustomerId();
cusObj.put(cusId,cusInfo);
return cusObj;
}

public Map<Integer,Map<Integer,Object>> accountDetails(AccountDetails accObj)throws CustomException
{
    int	cusId=accObj.getCustomerId();
    int accId=accObj.getAccountId();
	customerIdCheck(cusId);
	Map accountMap=customerAccount.get(cusId);
	if(accountMap==null)
	{
	accountMap=new HashMap();
    customerAccount.put(cusId,accountMap);
	}
    accountMap.put(accId,accObj);
    return customerAccount;
}

public Object fetchAccountDetails(int customerId,int accountId)throws CustomException
{
customerIdCheck(customerId);

return customerAccount.get(customerId).get(accountId);	
}

public Object  getId(int  customerId)throws Exception
{
	customerIdCheck(customerId);
	return  cusObj.get(customerId);
}

public int generateId()
{
	return ++customerId;
}

public int  generateAccountId()
{
  accountId= ++accountId;
 return accountId;
}



}
