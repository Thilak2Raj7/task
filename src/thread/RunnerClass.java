package thread;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class RunnerClass {
//ExtendedThread logic=new ExtendedThread ();
	Scanner scan=new Scanner(System.in);
    int sleepTime=0;
   boolean  value;
 /*public void printThread()
 {
//logic.run();
ExtendedThread t1=new ExtendedThread();
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
System.out.println(Thread.currentThread().getState());
t1.start();
//System.out.println(t1.currentThread());
//System.out.println(t1.getPriority());
//System.out.println(t1.getState());
 }*/
 public void runnableThread() 
 {
	 RunnableThread object=new  RunnableThread();
	 Thread t2=new Thread(object);
	 System.out.println(Thread.currentThread().getName());
	 System.out.println(Thread.currentThread().getPriority());
	 System.out.println(Thread.currentThread().getState());
     t2.start();
 }
 public void spawnThread()
 {
ExtendedThread t1=new ExtendedThread(); 
t1.setName("ExtendedThread");
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
System.out.println(Thread.currentThread().getState());
t1.start();
RunnableThread object =new RunnableThread();
Thread t2=new Thread(object);
System.out.println("Enter the thread name");
String name=scan.nextLine();
t2.setName(name);
System.out.println(Thread.currentThread().currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
System.out.println(Thread.currentThread().getState());
t2.start();
 }
 public void customThreads()
 {
	ExtendedThread t1=new ExtendedThread();
	t1.start();
	
	ExtendedThread t2=new ExtendedThread();
	t2.start();
	
	ExtendedThread  t3=new ExtendedThread();
	t3.start();
	
	ExtendedThread t4=new ExtendedThread();
	t4.start();
	
	ExtendedThread t5=new ExtendedThread();
	t5.start();
	   
 }
 public void runnableCustomThreads()
 {
	 RunnableThread object=new  RunnableThread();
	 Thread t1=new Thread(object);
	 t1.start();
	 Thread t2=new Thread(object);
	 t2.start();
	 Thread t3=new Thread(object);
	 t3.start();
	 Thread t4=new Thread(object);
	 t4.start();
	 Thread t5=new Thread(object);
	 t5.start();
 }
 
 public void differentSleepTime()
 {
for(int i=0;i<5;i++)
{
		ExtendedThread t=new ExtendedThread();
		System.out.println("Enter the Sleep Time");
		sleepTime=scan.nextInt();
		t.setSleep(sleepTime);
		t.start();
		}
 }
 public void runnableSleepTime()
{
	 for(int i=0;i<5;i++)
{
		 ExtendedThread t=new ExtendedThread();
		 RunnableThread object=new  RunnableThread();
		 Thread t1=new Thread(object);
		 System.out.println("Enter the Sleep Time");
			sleepTime=scan.nextInt();
			t.setSleep(sleepTime);
		    t1.start();
}
}
public void instanceSpecific()
{
 for(int i=0;i<5;i++)
{
	ExtendedThread t=new ExtendedThread();
	System.out.println("Enter the Sleep Time");
	sleepTime=scan.nextInt();
	t.setSleep(sleepTime);
	t.start();

}
}
public void runnerCondition()
{
	System.out.println("Enter the Sleep Time");
	sleepTime=scan.nextInt();
 for(int i=0;i<5;i++)
{
	ExtendedThread t=new ExtendedThread();
	RunnableThread object=new  RunnableThread();
	Thread t1=new Thread(object);
	System.out.println("Enter the thread name");
	String name=scan.nextLine();
	t1.setName(name);
	t.setSleep(sleepTime);
	t1.start();
}
}
public void extendedStop() 
{
List<ExtendedThread> thread=new ArrayList<ExtendedThread>();
for(int i=0;i<5;i++)
 {
ExtendedThread t=new ExtendedThread();
thread.add(i,t);
thread.get(i).setSleep(20000);
thread.get(i).setName("ExtendedThread"+i);
thread.get(i).start();
 }
try
{
 Thread.sleep(60000);	
}
catch(InterruptedException e)
{
	System.out.println(e);
	e.printStackTrace();
 }
 

for(int i=0;i<5;i++)
{
	thread.get(i).setMethod();
}

}
public void runnableStop()
{
	List <RunnableThread> callThread=new ArrayList<RunnableThread>();
	 List <Thread> spawn=new ArrayList<Thread>();
	for(int i=-0;i<5;i++)
	{
   callThread.add(i,new RunnableThread());
   //callThread.get(i).setSleep(30000);
   spawn.add(i,new Thread(callThread.get(i)));
    callThread.get(i).setSleep(30000);
    //spawn.add(i,new Thread(callThread.get(i)));
   spawn.get(i).setName("RunnableThread");
   spawn.get(i).start();
    }
	try
	{
	 Thread.sleep(60000);	
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
		e.printStackTrace();
	 }
	 
	for(int i=0;i<5;i++)
	{
		callThread.get(i).setMethod();
	}

	
}
 public static void main (String [] args)
 {
	 Scanner scan=new Scanner(System.in);
	 int number =0;
	 int sleepTime=0;
	 RunnerClass run=new RunnerClass();
	try {
		
		System.out.println("Enter the number");
		number=scan.nextInt();
		scan.nextLine();
		if(number<0 ||number>10)
		{
		System.out.println("Number is invalid");	
		}
		}
			
		catch (Exception e)
		{
		System.out.println("Enter a valid number");
		 e.printStackTrace();
	    }
	

switch(number)
{
case 1:
	//run.printThread();
	break;
case 2:
	run.runnableThread();
	break;
case 3:
	run.spawnThread();
	break;
case 4:
	run.customThreads();
	run.runnableCustomThreads();
	break;
case 5:
run.differentSleepTime();
run.runnableSleepTime();
    break;
case 6:
run.instanceSpecific();
run.runnerCondition();
break;
case 7:
	run.extendedStop();
	break;
case 8:
	run.runnableStop();
	break;
}

}
}
