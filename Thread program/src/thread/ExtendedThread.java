package thread;

import java.util.Scanner;

public class ExtendedThread extends Thread {
	int number;
	String name;
	boolean value=false;
	Scanner scan=new Scanner(System.in);
	
public int get()
{
	return number;
}
public void setSleep(int number)
{
this.number=number;	
}

public void setMethod()
{
	value=true;
}

	public void run() 
	{
		
		
		while(!value)
		{	
	    System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
		System.out.println(currentThread().getState());
	   
	    int sleepingTime=get();
	    
	    try
	    {
	    System.out.println("Going to sleep:" +currentThread().getName());
	    Thread.sleep(sleepingTime);
	    System.out.println("After sleeping"+Thread.currentThread().getName());	
	    }
	    catch (IllegalArgumentException e)
		{
		 System.out.println(e);
		 e.printStackTrace();
		}
	   catch(InterruptedException e)
	   {
		System.out.println(e);
		e.printStackTrace();
	  }  

		}
		System.out.println("Thread stopped");
		
	}
	
	}




