package banking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import account.AccountDetails;
import amount.ATMAmountDetails;
import logic.ATMBankingLogic;

public class ATMBankingManagement {
	
	Map<Double,ATMAmountDetails> amountMap=new HashMap<>();
	ATMBankingLogic logicObj=new ATMBankingLogic();
	Scanner scan=new Scanner(System.in);
	
	public void getAmountDetails() throws Exception
	{
		amountMap=logicObj.getMap();
		System.out.println("Enter the File Name to Create  :");
		String fileName=scan.nextLine();
		logicObj.writeAmount(fileName,amountMap);
		List<String> newOne=logicObj.readAmount(fileName);
		for(int i=0;i<newOne.size();i++)
		{
			System.out.println(newOne.get(i)+" ");
		}
	}
	
	public void setAccountDetails() throws Exception
	{
		AccountDetails accountObj=new AccountDetails();
		int accountNo=logicObj.getAccountNo();
		accountObj.setAccountNo(accountNo);
		
		System.out.println("Enter the Account Holder Name :");
		String accName=scan.nextLine();
		accountObj.setAccountHolderName(accName);
		
		System.out.println("Enter the 4 digit PIN Number:");
		int pinNo=scan.nextInt();
		scan.nextLine();
		accountObj.setPinNumber(pinNo);
		accountObj.setAccountBalance();
		
		System.out.println("Enter the File to Write AccountDetails :");
		String fileName=scan.nextLine();
		
		logicObj.setAccountDetails(accountNo,accountObj,fileName);
	}
	
	public void withdraw() throws Exception
	{
		boolean flag=true;
		
		while(flag==false)
		{
			System.out.println("Enter the Account No :");
			int accountNo=scan.nextInt();
			scan.nextLine();
		
			System.out.println("Enter the Pin No:");
			int pinNo=scan.nextInt();
			scan.nextLine();
			
			if(logicObj.getValidate(accountNo,PinNo))
			{
				System.out.println("Enter the Amount to Withdraw :");
				double amount=scan.nextDouble();
				scan.nextLine();
				logicObj.withdraw(accountNo,amount);	
				flag=true;
			}
			else
			{
				System.out.println("Invalid Pin No Entered");
			}	
			
		}
	}
	
	public void getAccountDetails() throws Exception
	{
		System.out.println("Enter the File Name to Get Account Details :");
		String fileName=scan.nextLine();
		String account=logicObj.getAccountDetails(fileName);
		System.out.println(account);
	}
	
	public static void main(String args[]) throws Exception
	{
		ATMBankingManagement bankingObj=new ATMBankingManagement();
		bankingObj.getAmountDetails();
		bankingObj.setAccountDetails();
	}
}
