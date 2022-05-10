package Logic;

public class Rotation {

public boolean findRotation(String a,String b) throws Exception	
{
	char[] array=new char[a.length()];
	char[] array1=new char[b.length()];
	if(a.isEmpty())
	{
		throw new Exception("String should not be empty");
	}
	
	
	if(a.length()!=b.length())
	{
		return false;
	}
	
  for(int i=0;i<a.length();i++)
  {
	  array[i]=a.charAt(i);
	  
  }
  for(int i=0;i< b.length();i++)
  {
	  array1[i]=b.charAt(i);
  }
  int count=0;
  
	for(int i=0;i<a.length();i++)
	{
		for(int j=0;j<b.length();j++)
		{
	    if(array[i]==array1[j])	
	    {
	    	
	    
	    	count++;
	    }
		}
		
	}
		
if(count==a.length())
{
	return true;
}
return false;
	
	
}
public static void main(String[] args)
{
	String a="IMMORTAL";
	String b="TALIMMOR";
	Rotation obj=new Rotation();
try {
	System.out.println(obj.findRotation(a,b));
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}
