//$Id$
package loop;

public class Loops
{
	public void printForLoop(String value,int num)
	{
		for(int i=0;i<num;i++)
		{
			System.out.println(value);
		}
	}
	public void printWhileLoop(String value,int num)
	{
		
		while(num >=0)
		{
			System.out.println(value);
			num--;
		}
	}
	public void printDoWhile(String value,int num)
	{
		do {
			System.out.println(value);
			num--;
		}
		while(num>=0);
		
	}
public static void main(String [] args)
{
	Loops obj=new Loops();
	String value="For loop";
	int num=5;
	obj.printForLoop(value,num);
	value="While";
	obj.printWhileLoop(value, num);
	value="DoWhile";
	obj.printDoWhile(value, num);
}
}
