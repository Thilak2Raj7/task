
package logic;
import pack.*;
import exception.CustomException;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.*;

import javax.management.loading.PrivateClassLoader;

import CacheLayer.StoreCache;
public class Runner { 
 Banking logic=new Banking();
 Scanner scan=new Scanner(System.in);
 int accountId=0;
DataFile myData=new DataFile();
String fileName=" ";
DataFile data=new DataFile();
 
 private void  customerDetails()
{
try
{

System.out.println("Enter the number of customers");
int count =scan.nextInt();
scan.nextLine();
 for(int i=0;i<count;i++)
{
 CustomerDetails cusInfo=new CustomerDetails();//
 System.out.println("Enter the name");
 String customerName=scan.nextLine();

 cusInfo.setCustomerName(customerName);
 System.out.println("Enter the age");
 int age=scan.nextInt();
 
 cusInfo.setAge(age);
 
 System.out.println("Enter MobileNumber");
 long mobileNumber=scan.nextLong();
 cusInfo.setMobileNumber(mobileNumber);
 scan.nextLine();
System.out.println("Enter the address");

String address=scan.nextLine();
cusInfo.setAddress(address);

logic.addCustomer(cusInfo);
}
//System.out.println(cusObj);
}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
}
 
 private void getCustomerDetails()
 {
 try{
	 
System.out.println("enter the CustomerId");
int customerId=scan.nextInt();
System.out.println( logic.getCustomerDetailsFile(customerId));

}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
}
 
 private void getCustomerDetailsCache()
 {
 try{
	 
System.out.println("enter the CustomerId");
int customerId=scan.nextInt();
System.out.println( logic.getCustomerDetailsCache(customerId));

}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
}
 
 private void accountDetails()throws CustomException
 {
try {
Map<Integer,Map<Integer,AccountDetails>>accountMap=new HashMap();
System.out.println("Enter the no. of accounts");
int account=scan.nextInt();
for(int i=0;i<account;i++)
{
AccountDetails accObj=new AccountDetails();
System.out.println("Enter the customerId");
int customerId=scan.nextInt();
	
accObj.setCustomerId(customerId);
scan.nextLine();
System.out.println("Enter the branch");
String branch=scan.nextLine();
accObj.setBranch(branch);

logic.addAccount(customerId,accObj);

//return accObj;
}
//System.out.println(accountMap);
	
}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
 }
 
 
 private void getAccount()
 {

try{
System.out.println("enter the CustomerId");
int customerId=scan.nextInt();
System.out.println("enter the accountId");
int accountId=scan.nextInt();
System.out.println(logic.getAccountDetailsFile(customerId,accountId));
//System.out.println(logic.getAccountDetailsCache(customerId,accountId));
}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();	
}

}

 
 private void getAccountIdDetails()
 {
 try
  {
System.out.println("enter the CustomerId");
int customerId=scan.nextInt();

System.out.println(logic.getAccountFile(customerId));
//System.out.println(logic.getAccountCache(customerId));
}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
 } 
 private void getAccountDetailsFromCache()
 {
 try
  {
System.out.println("enter the CustomerId");
int customerId=scan.nextInt();
System.out.println("enter the accountId");
int accountId=scan.nextInt();
System.out.println(logic.getAccountDetailsFromCache(customerId,accountId));
//System.out.println(logic.getAccountCache(customerId));
}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
}
 private void getAccountCache()
 {
 try
  {
System.out.println("enter the CustomerId");
int customerId=scan.nextInt();

System.out.println(logic.getAccountCache(customerId));
//System.out.println(logic.getAccountCache(customerId));
}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
 }
 
 private void depositAmount()
 {
try {
AccountDetails accObj=new AccountDetails();
System.out.println("enter the CustomerId");
int customerId=scan.nextInt();
accObj.setCustomerId(customerId);
System.out.println("enter the accountId");
int accountId=scan.nextInt();
	  //accObj.setAccountId(accountId);
System.out.println("enter the amount");
int amount=scan.nextInt();
logic.depositAmount(customerId,accountId,amount);
//logic.depositAmountCache(customerId, accountId, amount);
 }
 catch (Exception e)
 {
System.out.println(e.getMessage());
e.printStackTrace();
 }
 }
 
 private void withDraw()
 {
try {
AccountDetails accObj=new AccountDetails();
System.out.println("enter the CustomerId");
int customerId=scan.nextInt();
accObj.setCustomerId(customerId);
System.out.println("enter the accountId");
int accountId=scan.nextInt();
//accObj.setAccountId(accountId);
System.out.println("enter the amount");
int amount=scan.nextInt();
logic.withdrawAmount(customerId,accountId,amount);
//logic.withdrawAmountCache(customerId, accountId, amount);
}
 catch (Exception e)
 {
System.out.println(e.getMessage());
e.printStackTrace();
 }
 }
 
 private void customerStatus()
 {
try{
CustomerDetails cusObj=new CustomerDetails();
System.out.println("enter the CustomerId");
int customerId=scan.nextInt();
cusObj.setCustomerId(customerId);

System.out.println("Enter the status");
boolean status=scan.nextBoolean();
logic.changeCustomerStatus(customerId,status);
}  
 catch (Exception e)
 {
System.out.println(e.getMessage());
e.printStackTrace();
 }
 }
 
 private void accountStatus()
 {
try{
 AccountDetails accObj=new AccountDetails();
System.out.println("enter the CustomerId");
int customerId=scan.nextInt();
accObj.setCustomerId(customerId);
System.out.println("enter the accountId");
int accountId=scan.nextInt();
 //accObj.setAccountId(accountId);
scan.nextLine();
System.out.println("Enter the status");
boolean status=scan.nextBoolean();
logic.changeStatus(customerId,accountId,status);
}  
 catch (Exception e)
 {
System.out.println(e.getMessage());
e.printStackTrace();
 }
 }
 
private void createFile()
{
try {
scan.nextLine();

System.out.println("Enter the fileName");
String fileName=scan.nextLine();
	
logic.fileCreation(fileName);
}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
 	
}
}

public static void main(String[] args) 
{
Scanner scan=new Scanner(System.in);
int operation =0;
boolean value=true;
Banking logic =new Banking();
Runner run=new Runner();
while(value)
{
try {

System.out.println("Enter the number");
operation=scan.nextInt();
scan.nextLine();
}
catch(Exception e)
{
System.out.println("Enter the valid input");
e.printStackTrace();
}
	 
switch(operation)
{
case 1:
run.customerDetails();
break;
	
case 2:
run.getCustomerDetails();
break;
	
case 3:
try
{
run.accountDetails();
}
catch (Exception e) 
{
System.out.println(e.getMessage());
e.printStackTrace();
}
break;
	
case 4:
run.getAccount();
break;
	
case 5:
run.getAccountIdDetails();
break;
	
case 6:
run.depositAmount();
break;
	
case 7:
run.withDraw();
break;

case 8:
try
{
run.accountStatus();
}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
break;
	
case 9:
run.createFile();

	break;

case 10:
run.customerStatus();
	break;
	
case 11:
try {
	
logic.showCustomerDetails();
}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}	
break;

case 12:
try {
	
logic.showAccountDetails();
}
catch (Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}	
break;
 
case 13:
	
try {
		logic.showCustomerDetailsFromCache();
	} 
catch (Exception e) 
{
		System.out.println(e.getMessage());
		e.printStackTrace();
}
break;

case 14:
try {
		logic.showAccountDetailsFromCache();
} 
catch (Exception e) {
System.out.println(e.getMessage());
e.printStackTrace();
}
break;

case 15:
	run.getAccountDetailsFromCache();
break;

case 16:
	run.getCustomerDetailsCache();
	break;
	
case 17:
	run.getAccountCache();
default :
value=false;
System.out.println("Enter the valid input!");
}
 }
}
}
