
  
package logic;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import pack.AccountDetails;
import pack.CustomerDetails;

public class Database {
	
	String url="jdbc:mysql://localhost:3306/bankDetails";
	String userName="root";
	String password="Root@123";
	String query="";
public void createTable() throws SQLException
{
	try(java.sql.Connection con= DriverManager.getConnection(url,userName,password);
	 Statement st=con.createStatement();){
String query1="create table customerInformation(customerId int not null auto_increment,name varchar(12),age int,mobileNumber bigint,address varchar(100),customerStatus tinyint,primary key (customerId));";
String query2="create table accountInformation(accountId int not null auto_increment,customerId int not null ,branch varChar(20),accountBalance int ,accountStatus tinyint,primary key(accountId),foreign key(customerId) references customerInformation(customerId));";
int c=st.executeUpdate(query1);
System.out.println(c+"rows affected");
int c1=st.executeUpdate(query2);
System.out.println(c1+"rows affected");
st.executeUpdate("alter table accountInformation auto_increment=100");
	}
}
	

public void insertTable(String query)
{
	try(java.sql.Connection con=DriverManager.getConnection(url,userName,password);
			Statement st=con.createStatement();){
		st.executeUpdate(query);
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}

	
public CustomerDetails selectCustomerInfo(String query) throws SQLException
{
	try(java.sql.Connection con=DriverManager.getConnection(url,userName,password);
			Statement st=con.createStatement();){
		
		ResultSet rs=st.executeQuery(query);
	
		while(rs.next())//for 2 0r more customerId
		{
		CustomerDetails customer=new CustomerDetails();
		customer.setCustomerId(rs.getInt("customerId"));
		customer.setAddress(rs.getString("address"));
		customer.setAge(rs.getInt("age"));
	    customer.setCustomerStatus(rs.getBoolean("customerStatus"));
		customer.setCustomerName(rs.getString("name"));
	
		customer.setMobileNumber(rs.getLong("mobileNumber"));
		
		return customer;	
			
		}
		
		
	}
	return null;
	
	
}

public CustomerDetails getCustomerDetails(int customerId) throws Exception
{
	checkCustomerId(customerId);

return selectCustomerInfo("select * from customerInformation where customerId="+customerId+";");
		
	}
	

public void addCustomer(CustomerDetails customer) {
	// TODO Auto-generated method stub
	try(java.sql.Connection con=DriverManager.getConnection(url,userName,password);
			Statement st=con.createStatement();){
	
		
		String name=customer.getCustomerName();
		int age=customer.getAge();
		String address=customer.getAddress();
		long mobileNumber=customer.getMobileNumber();
		boolean customerStatus=customer.isCustomerStatus();
		query="insert into customerInformation(name,age,address,mobileNumber,customerStatus) values('"+name+"',"+age+",'"+address+"',"+mobileNumber+","+customerStatus+");";
		insertTable(query);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public void addAccount(AccountDetails accObj)
{
	try(java.sql.Connection con=DriverManager.getConnection(url,userName,password);
			Statement st=con.createStatement();){
		
	  int customerId=accObj.getCustomerId();
	  String branch=accObj.getBranch();
	  int balance=accObj.getAccountBalance();
	  boolean accountStatus=accObj.isAccountStatus();
	  query="insert into accountInformation(customerId,branch,accountBalance,accountStatus)  values("+customerId+",'"+branch+"',"+balance+","+accountStatus+");";
	  insertTable(query);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}

	public AccountDetails getAccountDetails(int customerId,int accountId) throws Exception
	{
		checkCustomerId(customerId);
		checkAccountId(customerId,accountId);
		return  selectAccount("select * from accountInformation where customerId="+customerId+" And where accountId="+accountId+";");
		
		
	}
	public AccountDetails selectAccount(String query) throws SQLException
	{
		try(java.sql.Connection con=DriverManager.getConnection(url,userName,password);
				Statement st=con.createStatement();){
			ResultSet rs =st.executeQuery(query);
			while(rs.next())
			{
				AccountDetails accObj1=new AccountDetails();
				accObj1.setAccountId(rs.getInt("accountId"));
				accObj1.setAccountBalance(rs.getInt("accountBalance"));
				accObj1.setCustomerId(rs.getInt("customerId"));
				accObj1.setBranch(rs.getString("branch"));
				return accObj1;
				
			}
			
		}
		return null;
		
	}
	
	 public void  updateTable(String query)
	{

		try(java.sql.Connection con=DriverManager.getConnection(url,userName,password);
				Statement st=con.createStatement();){
		int count=st.executeUpdate(query);
	       System.out.println(count+"rowsAffected");
		}
	
	
	 catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	 public CustomerDetails getCustomerInfo(int customerId) throws Exception
	 {
		    checkCustomerId(customerId);
			return selectCustomerInfo("select * from customerInformation where customerId="+customerId+";");
	 }
	public AccountDetails getAccountInfo(int customerId,int accountId) throws Exception
	{
		checkCustomerId(customerId);
		checkAccountId(customerId,accountId);
		return selectAccount("select * from accountInformation where accountId="+accountId+" and customerId="+customerId+";");
	}
	public void depositAmount(int customerId,int accountId,int amount) throws Exception
	{
		checkCustomerId(customerId);
		checkAccountId(customerId,accountId);
		AccountDetails acc=getAccountInfo(customerId,accountId);
		System.out.println(acc);
		int deposit=acc.getAccountBalance()+amount;
		updateTable("update accountInformation set accountBalance="+deposit+" where accountId="+accountId+" and  customerId="+customerId+";");
	}
	public void withdrawAmount(int customerId,int accountId,int amount) throws Exception
	{
		checkCustomerId(customerId);
		checkAccountId(customerId,accountId);
	AccountDetails acc=getAccountInfo(customerId,accountId);
	int withdraw=acc.getAccountBalance()-amount;
	updateTable("update accountInformation set accountBalance="+withdraw+" where accountId="+accountId+" And  customerId="+customerId+";");
}
	public void updateAccountStatus(int customerId,int accountId,boolean status) throws Exception
	{
	checkCustomerId(customerId);
	checkAccountId(customerId,accountId);
	AccountDetails acc=getAccountInfo(customerId,accountId);
	
	updateTable("update accountInformation set accountStatus="+status+"   where accountId="+accountId+" and customerId="+customerId+"; ");
}
	public void updateCustomerStatus(int customerId,boolean status) throws Exception
	{
		checkCustomerId(customerId);
		
	CustomerDetails acc=getCustomerInfo(customerId);
	
	updateTable("update customerInformation set customerStatus="+status+" where customerId="+customerId+"; ");
}
	public  Map<Integer,CustomerDetails> getAllCustomerInformation() throws SQLException
	{
		try(java.sql.Connection con=DriverManager.getConnection(url,userName,password);
				Statement st=con.createStatement();){
			String query="select * from customerInformation;";
			 ResultSet rs=st.executeQuery(query);
			 Map<Integer,CustomerDetails> customerInfo=new HashMap<Integer,CustomerDetails>();
			 while(rs.next())
			 {
				CustomerDetails customer=new CustomerDetails() ;
				int customerId=rs.getInt("customerId");
				customer.setCustomerId(rs.getInt("customerId"));
				customer.setAddress(rs.getString("address"));
				customer.setAge(rs.getInt("age"));
			    customer.setCustomerStatus(rs.getBoolean("customerStatus"));
				customer.setCustomerName(rs.getString("name"));
		         customer.setMobileNumber(rs.getLong("mobileNumber"));
				customerInfo.put(customerId, customer);
			 }
			 return customerInfo;
		}
		
	}
	


public Map<Integer,Map<Integer,AccountDetails>> getAllAccount() throws SQLException
{
	try(java.sql.Connection con=DriverManager.getConnection(url,userName,password);
			Statement st=con.createStatement();){
		String query="select * from accountInformation;";
		 ResultSet rs=st.executeQuery(query);
		 Map<Integer,Map<Integer,AccountDetails>> account=new HashMap<Integer,Map<Integer,AccountDetails>>();
	      while(rs.next())
	      {
	    	 
	    	  AccountDetails accObj=new AccountDetails();
	    	    int customerId=rs.getInt("customerId");
	    	    int accountId=rs.getInt("accountId");
	    	    accObj.setAccountId(rs.getInt("accountId"));
				accObj.setAccountBalance(rs.getInt("accountBalance"));
				accObj.setCustomerId(rs.getInt("customerId"));
				accObj.setBranch(rs.getString("branch"));
				 Map<Integer,AccountDetails> accountMap=account.get(customerId);
				if(accountMap==null)
				{
					accountMap=new HashMap<Integer,AccountDetails>();
				}
				accountMap.put(accountId,accObj);
				account.put(customerId,accountMap);
	      }
	    return account;	  
	}
	}
	
	public void checkCustomerId(int customerId)throws Exception
	{
		Map<Integer,CustomerDetails> customer=getAllCustomerInformation();
		if(customer.get(customerId)==null)
		{
			throw new Exception("Customer id is not exist");
			
		}
	}
	
public void checkAccountId(int customerId,int accountId)throws Exception
{
	Map<Integer,Map<Integer,AccountDetails>> account=getAllAccount();
	
	Map<Integer,AccountDetails> accountMap=account.get(customerId);
	AccountDetails accObj=accountMap.get(accountId);
	if(accObj==null)
	{
		throw new Exception("Account id is not exist");
		
	}
}
}

