package String3;
import java.util.*;
public class CompareString {
	public String pairOfString(String s,String t)
		{
		String m="";
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)!=t.charAt(i))
			{
				m+=String.valueOf(s.charAt(i))+String.valueOf(t.charAt(i))+",";
				
			}
		}
		
		return m;
	}
public void removeFragment(String s,String t,String u)
{
	String word="";
	String ot="";
  for(int i=0;i<s.length();i++)
  {
	  if(s.charAt(i)!=' ')
	  {
		  
	  }
  }
}
public String[] digitMapping() 
{
	String[] array= {"a","b","c"};
	Map<Integer,String[]> mapObj=new HashMap<>();	
	
}

	
	
	public static void main(String[] args)
	{
		
	int number=0;
	String s="";
	String t="";
	Scanner scan=new Scanner(System.in);
	CompareString obj=new CompareString();
	try
	{
		 number=scan.nextInt();
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
switch(number)
{
case 1:
 s="abcddefgikom";
	 t="abdcdeffgklm";
		System.out.println(obj.pairOfString(s,t));
		break;
		
case 2:
    s=scan.nextLine();
	t=scan.nextLine();
	String r=scan.nextLine();
	obj.removeFragment(s,t,r);
	break;
case 3:
	int key=scan.nextInt();
	 s="abc";
     t="def";

	
}
}
