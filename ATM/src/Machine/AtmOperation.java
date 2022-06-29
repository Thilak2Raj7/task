package Machine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AtmOperation {
Data storage=new Data();
public  void calculateAmount(int note1,int note2,int note3) throws IOException
{
storage.calculateAmount(note1, note2, note3);;	
	
}

public void customerDetails(Map<Long,Customer> obj) throws IOException
{
	storage.writeCustomerDetails(obj);
}
public void checkBalance(long accountNumber) throws Exception
{
	storage.checkBalance(accountNumber);
}

public void withDrawMoney(long accountNumber,int amount) throws Exception
{
	storage.withDrawMoney(accountNumber, amount);
}
public void transferMoney(long accountNumber,int amount,long receiver) throws Exception
{
	storage.transferMoney(accountNumber,amount,receiver);
}
public ATM checkAtmBalance(long accountNumber) throws IOException
{
	return storage.checkAtmBalance();
}
public List<Transaction> miniStatement(long accountNumber) throws FileNotFoundException, IOException
{
	return storage.miniStatement(accountNumber);
}
public void checkCrediantials(long accountNumber,int pin) throws Exception
{
	storage.checkCrediantials(accountNumber, pin);
}
public  Map<Long,Customer> readCustomerDetails() throws IOException
{
	
	return storage.readCustomerDetails();
}
public void  writeCustomerDetails(Map<Long,Customer> customer) throws IOException
{
	storage.writeCustomerDetails(customer);
}
public void amountLimit(int amount) throws Exception {
	storage.amountLimit(amount);
	
}
public void transferLimit(int amount) throws Exception {
	storage.transferLimit(amount);
	
}

public void checkAccountNumber(long receiver) throws Exception {
	storage.checkAccountNumber(receiver);
	
}
}
