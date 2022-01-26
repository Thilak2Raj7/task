package thread;

public class RunnableThread  implements Runnable{
boolean value=false;
String name;
int number;
ExtendedThread object= new ExtendedThread();
public void setName(String name)
{
	this.name=name;	
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
	    //while(value=true)
	    ///{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState());
		
		try
		{
		System.out.println("Going to sleep:" +Thread.currentThread().getName());
		Thread.sleep(object.get());
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
		System.out.println("Thread stopped");
	
	//}

}
}