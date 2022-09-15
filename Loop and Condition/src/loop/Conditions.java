//$Id$
package loop;

public class Conditions {
	
	public void printCondition(int i)
	{
		if(i==1)
		{
			System.out.print("Number is "+1);
		}
		else if(i==2)
		{
			System.out.print("Number is "+2);
		}
		else if(i==3)
		{
			System.out.print("Number is "+3);
		}
		else {
			System.out.print("Number is "+ i );
		}
	}

	public static void main(String [] args)
	{
		Conditions obj=new Conditions();
		int i=2;
		obj.printCondition(i);
		}
}

