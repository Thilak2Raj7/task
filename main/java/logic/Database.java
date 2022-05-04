package logic;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



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

public CustomerDetails getCustomerDetails(int customerId) throws SQLException
{
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
		query="insert into customerInformation(name,age,address,mobileNumber) values('"+name+"',"+age+",'"+address+"',"+mobileNumber+");";
		insertTable(query);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}


}
